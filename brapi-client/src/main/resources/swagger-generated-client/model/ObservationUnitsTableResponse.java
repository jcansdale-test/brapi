/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * ObservationUnitsTableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class ObservationUnitsTableResponse {
  @SerializedName("data")
  private List<List<String>> data = null;

  @SerializedName("headerRow")
  private List<String> headerRow = null;

  @SerializedName("observationVariableDbIds")
  private List<String> observationVariableDbIds = null;

  @SerializedName("observationVariableNames")
  private List<String> observationVariableNames = null;

  public ObservationUnitsTableResponse data(List<List<String>> data) {
    this.data = data;
    return this;
  }

  public ObservationUnitsTableResponse addDataItem(List<String> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<List<String>>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Matrix of observation meta-data and recorded values. Each inner array represents 1 row of data.
   * @return data
  **/
  @Schema(description = "Matrix of observation meta-data and recorded values. Each inner array represents 1 row of data.")
  public List<List<String>> getData() {
    return data;
  }

  public void setData(List<List<String>> data) {
    this.data = data;
  }

  public ObservationUnitsTableResponse headerRow(List<String> headerRow) {
    this.headerRow = headerRow;
    return this;
  }

  public ObservationUnitsTableResponse addHeaderRowItem(String headerRowItem) {
    if (this.headerRow == null) {
      this.headerRow = new ArrayList<String>();
    }
    this.headerRow.add(headerRowItem);
    return this;
  }

   /**
   * Names of the columns included in the data matrix. Any or All of [ \&quot;year\&quot;,\&quot;studyDbId\&quot;,\&quot;studyName\&quot;,\&quot;locationDbId\&quot;,\&quot;locationName\&quot;,\&quot;germplasmDbId\&quot;,\&quot;germplasmName\&quot;,\&quot;observationUnitDbId\&quot;,\&quot;plotNumber\&quot;,\&quot;replicate\&quot;,\&quot;blockNumber\&quot;, \&quot;entryType\&quot;, \&quot;X\&quot;, \&quot;Y\&quot;]
   * @return headerRow
  **/
  @Schema(description = "Names of the columns included in the data matrix. Any or All of [ \"year\",\"studyDbId\",\"studyName\",\"locationDbId\",\"locationName\",\"germplasmDbId\",\"germplasmName\",\"observationUnitDbId\",\"plotNumber\",\"replicate\",\"blockNumber\", \"entryType\", \"X\", \"Y\"]")
  public List<String> getHeaderRow() {
    return headerRow;
  }

  public void setHeaderRow(List<String> headerRow) {
    this.headerRow = headerRow;
  }

  public ObservationUnitsTableResponse observationVariableDbIds(List<String> observationVariableDbIds) {
    this.observationVariableDbIds = observationVariableDbIds;
    return this;
  }

  public ObservationUnitsTableResponse addObservationVariableDbIdsItem(String observationVariableDbIdsItem) {
    if (this.observationVariableDbIds == null) {
      this.observationVariableDbIds = new ArrayList<String>();
    }
    this.observationVariableDbIds.add(observationVariableDbIdsItem);
    return this;
  }

   /**
   * Array of observation variable DbIds for the collected data. This array is appended to the \&quot;headerRow\&quot; to get the complete header of the data matrix
   * @return observationVariableDbIds
  **/
  @Schema(description = "Array of observation variable DbIds for the collected data. This array is appended to the \"headerRow\" to get the complete header of the data matrix")
  public List<String> getObservationVariableDbIds() {
    return observationVariableDbIds;
  }

  public void setObservationVariableDbIds(List<String> observationVariableDbIds) {
    this.observationVariableDbIds = observationVariableDbIds;
  }

  public ObservationUnitsTableResponse observationVariableNames(List<String> observationVariableNames) {
    this.observationVariableNames = observationVariableNames;
    return this;
  }

  public ObservationUnitsTableResponse addObservationVariableNamesItem(String observationVariableNamesItem) {
    if (this.observationVariableNames == null) {
      this.observationVariableNames = new ArrayList<String>();
    }
    this.observationVariableNames.add(observationVariableNamesItem);
    return this;
  }

   /**
   * Human readable names of the observation variables for the collected data. This array should match 1 to 1 with the \&quot;observationVariableDbIds\&quot; array.
   * @return observationVariableNames
  **/
  @Schema(description = "Human readable names of the observation variables for the collected data. This array should match 1 to 1 with the \"observationVariableDbIds\" array.")
  public List<String> getObservationVariableNames() {
    return observationVariableNames;
  }

  public void setObservationVariableNames(List<String> observationVariableNames) {
    this.observationVariableNames = observationVariableNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationUnitsTableResponse observationUnitsTableResponse = (ObservationUnitsTableResponse) o;
    return Objects.equals(this.data, observationUnitsTableResponse.data) &&
        Objects.equals(this.headerRow, observationUnitsTableResponse.headerRow) &&
        Objects.equals(this.observationVariableDbIds, observationUnitsTableResponse.observationVariableDbIds) &&
        Objects.equals(this.observationVariableNames, observationUnitsTableResponse.observationVariableNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, headerRow, observationVariableDbIds, observationVariableNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationUnitsTableResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    headerRow: ").append(toIndentedString(headerRow)).append("\n");
    sb.append("    observationVariableDbIds: ").append(toIndentedString(observationVariableDbIds)).append("\n");
    sb.append("    observationVariableNames: ").append(toIndentedString(observationVariableNames)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
