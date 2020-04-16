package org.brapi.client.v2.modules.core;

import com.google.gson.reflect.TypeToken;
import org.brapi.client.v2.model.exceptions.APIException;
import org.brapi.client.v2.model.exceptions.HttpException;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.client.v2.model.HttpMethod;
import org.brapi.client.v2.model.exceptions.*;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.BrAPIEndpoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.brapi.v2.core.model.BrApiProgram;
import org.brapi.v2.core.model.request.ProgramsRequest;
import org.brapi.v2.core.model.response.DataResponse;


public class ProgramsAPI extends BrAPIEndpoint {

    public ProgramsAPI(BrAPIClient brAPIClient) { super(brAPIClient); }

    public List<BrApiProgram> getPrograms(ProgramsRequest programFilter) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (programFilter == null) {
            programFilter = new ProgramsRequest();
        }

        // Build our request
        String endpoint = String.format(BrAPICoreEndpoints_V2.getProgramsPath());
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .parameters(programFilter.constructParameters())
                .method(HttpMethod.GET)
                .build();

        List<BrApiProgram> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            Type resultGsonType = new TypeToken<DataResponse<BrApiProgram>>() {}.getType();
            DataResponse<BrApiProgram> dataResponse = gson.fromJson(resultJson, resultGsonType);
            return dataResponse.data();
        }).orElse(new ArrayList<>());

        return searchResult;
    }

    public List<BrApiProgram> getPrograms() throws HttpException, APIException {
        try {
            return getPrograms(null);
        } catch (APIException e){
            throw new APIException(e.getMessage());
        }
    }

    public Optional<BrApiProgram> getProgramById(String programID) throws HttpException, APIException {

        // Check if our values are passed in and raise error if not
        if (programID == null) {
            throw new APIException("Must specify programID for the getProgramById endpoint.");
        }

        // Build our request
        String endpoint = BrAPICoreEndpoints_V2.getProgramsByIdPath(programID);
        BrAPIRequest request = BrAPIRequest.builder()
                .target(endpoint)
                .parameter("dataType", "application/json")
                .method(HttpMethod.GET)
                .build();

        Optional<BrApiProgram> searchResult = getBrAPIClient().execute(request, (metadata, resultJson, gson) -> {
            BrApiProgram resultResponse = gson.fromJson(resultJson, BrApiProgram.class);
            return Optional.of(resultResponse);
        }).orElse(Optional.empty());

        return searchResult;
    }

}