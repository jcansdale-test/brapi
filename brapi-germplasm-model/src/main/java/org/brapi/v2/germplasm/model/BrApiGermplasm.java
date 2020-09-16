package org.brapi.v2.germplasm.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.brapi.v2.core.model.BrApiExternalReference;
import org.brapi.v2.core.model.request.BaseRequest;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@SuperBuilder
@NoArgsConstructor
public class BrApiGermplasm {
    private String accessionNumber;
    private Date acquisitionDate;
    private Map<String, String> additionalInfo;
    private BrApiBiologicalStatusOfAccessionCode biologicalStatusOfAccessionCode;
    private String biologicalStatusOfAccessionDescription;
    private String breedingMethodDbId;
    private String collection;
    private String commonCropName;
    private String countryOfOriginCode;
    private String defaultDisplayName;
    private String documentationURL;
    private List<BrApiGermplasmDonor> donors;
    private List<BrApiExternalReference> externalReferences;
    private String genus;
    private String germplasmDbId;
    private String germplasmName;
    private List<BrApiGermplasmOrigin> germplasmOrigin;
    private String germplasmPUI;
    private String germplasmPreprocessing;
    private String instituteCode;
    private String instituteName;
    private String pedigree;
    private String seedSource;
    private String seedSourceDescription;
    private String species;
    private String speciesAuthority;
    private List<BrApiGermplasmStorageType> stoageTypes;
    private String subtaxa;
    private String subtaxaAuthority;
    private List<BrApiGermplasmSynonym> synonyms;
    private List<BrApiGermplasmTaxon> taxonIds;

}
