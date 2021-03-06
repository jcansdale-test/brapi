/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.v2.germplasm.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.request.BaseRequest;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class GermplasmRequest extends BaseRequest {

    private String germplasmPUI;
    private String germplasmDbId;
    private String germplasmName;
    private String commonCropName;
    private String accessionNumber;
    private String collection;
    private String genus;
    private String species;
    private String studyDbId;
    private String synonym;
    private String parentDbId;
    private String progenyDbId;
    private String externalReferenceID;
    private String externalReferenceSource;

    public Map<String, String> constructParameters() {

        Map<String, String> params = new HashMap<>();

        params.putAll(super.constructParameters());
        if (germplasmPUI != null) params.put("germplasmPUI", germplasmPUI);
        if (germplasmDbId != null) params.put("germplasmDbId", germplasmDbId);
        if (germplasmName != null) params.put("germplasmName", germplasmName);
        if (commonCropName != null) params.put("commonCropName", commonCropName);
        if (accessionNumber != null) params.put("accessionNumber", accessionNumber);
        if (collection != null) params.put("collection", collection);
        if (genus != null) params.put("genus", genus);
        if (species != null) params.put("species", species);
        if (studyDbId != null) params.put("studyDbId", studyDbId);
        if (synonym != null) params.put("synonym", synonym);
        if (parentDbId != null) params.put("parentDbId", parentDbId);
        if (progenyDbId != null) params.put("progenyDbId", progenyDbId);
        if (externalReferenceID != null) params.put("externalReferenceID", externalReferenceID);
        if (externalReferenceSource != null) params.put("externalReferenceSource", externalReferenceSource);

        return params;
    }
}
