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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VendorSpecificationService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-08-25T02:56:46.257Z[GMT]")
public class VendorSpecificationService {
  @SerializedName("serviceDescription")
  private String serviceDescription = null;

  @SerializedName("serviceId")
  private String serviceId = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  /**
   * The type of markers used in this services platform
   */
  @JsonAdapter(ServicePlatformMarkerTypeEnum.Adapter.class)
  public enum ServicePlatformMarkerTypeEnum {
    FIXED("FIXED"),
    DISCOVERABLE("DISCOVERABLE");

    private String value;

    ServicePlatformMarkerTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServicePlatformMarkerTypeEnum fromValue(String text) {
      for (ServicePlatformMarkerTypeEnum b : ServicePlatformMarkerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServicePlatformMarkerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServicePlatformMarkerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServicePlatformMarkerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServicePlatformMarkerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("servicePlatformMarkerType")
  private ServicePlatformMarkerTypeEnum servicePlatformMarkerType = null;

  @SerializedName("servicePlatformName")
  private String servicePlatformName = null;

  @SerializedName("specificRequirements")
  private Object specificRequirements = null;

  public VendorSpecificationService serviceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
    return this;
  }

   /**
   * Description of the vendor platform
   * @return serviceDescription
  **/
  @Schema(description = "Description of the vendor platform")
  public String getServiceDescription() {
    return serviceDescription;
  }

  public void setServiceDescription(String serviceDescription) {
    this.serviceDescription = serviceDescription;
  }

  public VendorSpecificationService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Unique identifier for this service
   * @return serviceId
  **/
  @Schema(description = "Unique identifier for this service")
  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public VendorSpecificationService serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * The human readable name of a platform
   * @return serviceName
  **/
  @Schema(description = "The human readable name of a platform")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public VendorSpecificationService servicePlatformMarkerType(ServicePlatformMarkerTypeEnum servicePlatformMarkerType) {
    this.servicePlatformMarkerType = servicePlatformMarkerType;
    return this;
  }

   /**
   * The type of markers used in this services platform
   * @return servicePlatformMarkerType
  **/
  @Schema(description = "The type of markers used in this services platform")
  public ServicePlatformMarkerTypeEnum getServicePlatformMarkerType() {
    return servicePlatformMarkerType;
  }

  public void setServicePlatformMarkerType(ServicePlatformMarkerTypeEnum servicePlatformMarkerType) {
    this.servicePlatformMarkerType = servicePlatformMarkerType;
  }

  public VendorSpecificationService servicePlatformName(String servicePlatformName) {
    this.servicePlatformName = servicePlatformName;
    return this;
  }

   /**
   * The technology platform used by this service
   * @return servicePlatformName
  **/
  @Schema(description = "The technology platform used by this service")
  public String getServicePlatformName() {
    return servicePlatformName;
  }

  public void setServicePlatformName(String servicePlatformName) {
    this.servicePlatformName = servicePlatformName;
  }

  public VendorSpecificationService specificRequirements(Object specificRequirements) {
    this.specificRequirements = specificRequirements;
    return this;
  }

   /**
   * Additional arbitrary requirements for a particular platform
   * @return specificRequirements
  **/
  @Schema(description = "Additional arbitrary requirements for a particular platform")
  public Object getSpecificRequirements() {
    return specificRequirements;
  }

  public void setSpecificRequirements(Object specificRequirements) {
    this.specificRequirements = specificRequirements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorSpecificationService vendorSpecificationService = (VendorSpecificationService) o;
    return Objects.equals(this.serviceDescription, vendorSpecificationService.serviceDescription) &&
        Objects.equals(this.serviceId, vendorSpecificationService.serviceId) &&
        Objects.equals(this.serviceName, vendorSpecificationService.serviceName) &&
        Objects.equals(this.servicePlatformMarkerType, vendorSpecificationService.servicePlatformMarkerType) &&
        Objects.equals(this.servicePlatformName, vendorSpecificationService.servicePlatformName) &&
        Objects.equals(this.specificRequirements, vendorSpecificationService.specificRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceDescription, serviceId, serviceName, servicePlatformMarkerType, servicePlatformName, specificRequirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorSpecificationService {\n");
    
    sb.append("    serviceDescription: ").append(toIndentedString(serviceDescription)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePlatformMarkerType: ").append(toIndentedString(servicePlatformMarkerType)).append("\n");
    sb.append("    servicePlatformName: ").append(toIndentedString(servicePlatformName)).append("\n");
    sb.append("    specificRequirements: ").append(toIndentedString(specificRequirements)).append("\n");
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
