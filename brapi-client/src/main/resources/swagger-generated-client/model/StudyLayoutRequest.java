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
import io.swagger.client.model.StudyLayoutRequestLayout;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
/**
 * StudyLayoutRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class StudyLayoutRequest {
  @SerializedName("layout")
  private List<StudyLayoutRequestLayout> layout = null;

  public StudyLayoutRequest layout(List<StudyLayoutRequestLayout> layout) {
    this.layout = layout;
    return this;
  }

  public StudyLayoutRequest addLayoutItem(StudyLayoutRequestLayout layoutItem) {
    if (this.layout == null) {
      this.layout = new ArrayList<StudyLayoutRequestLayout>();
    }
    this.layout.add(layoutItem);
    return this;
  }

   /**
   * List of observation unit position data entities which need to be updated
   * @return layout
  **/
  @Schema(description = "List of observation unit position data entities which need to be updated")
  public List<StudyLayoutRequestLayout> getLayout() {
    return layout;
  }

  public void setLayout(List<StudyLayoutRequestLayout> layout) {
    this.layout = layout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyLayoutRequest studyLayoutRequest = (StudyLayoutRequest) o;
    return Objects.equals(this.layout, studyLayoutRequest.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudyLayoutRequest {\n");
    
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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
