/*
 * Stardust API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2023-02-22T22:32:07Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package gg.stardust.coresdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import gg.stardust.coresdk.models.SDTemplateCreateBulkProps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * SDTemplateCreateBulk
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-09T11:52:00.026066-08:00[America/Los_Angeles]")
public class SDTemplateCreateBulk implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("name")
  private String name = null;

  @SerializedName("cap")
  private String cap = null;

  /**
   * The type of custom contract to use for this template. Default will use a shared contract.
   */
  @JsonAdapter(ContractTypeEnum.Adapter.class)
  public enum ContractTypeEnum {
    ERC721("ERC721");

    private String value;

    ContractTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ContractTypeEnum fromValue(String input) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ContractTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContractTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ContractTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ContractTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("contractType")
  private ContractTypeEnum contractType = null;

  /**
   * FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FT("FT"),
    NFT("NFT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("activeListing")
  private Boolean activeListing = null;

  @SerializedName("ownerAddress")
  private String ownerAddress = null;

  @SerializedName("props")
  private SDTemplateCreateBulkProps props = null;

  @SerializedName("publicContractMetadata")
  private Object publicContractMetadata = null;

  @SerializedName("publicTokenMetadata")
  private Object publicTokenMetadata = null;

  public SDTemplateCreateBulk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template (ex. Bronze Axe)
   * @return name
  **/
  @Schema(required = true, description = "The name of the template (ex. Bronze Axe)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SDTemplateCreateBulk cap(String cap) {
    this.cap = cap;
    return this;
  }

   /**
   * u96 Number as String (ex. 200000000), default 39614081257132168796771975168 
   * @return cap
  **/
  @Schema(description = "u96 Number as String (ex. 200000000), default 39614081257132168796771975168 ")
  public String getCap() {
    return cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public SDTemplateCreateBulk contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * The type of custom contract to use for this template. Default will use a shared contract.
   * @return contractType
  **/
  @Schema(description = "The type of custom contract to use for this template. Default will use a shared contract.")
  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public SDTemplateCreateBulk type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT)
   * @return type
  **/
  @Schema(description = "FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SDTemplateCreateBulk image(String image) {
    this.image = image;
    return this;
  }

   /**
   * image url
   * @return image
  **/
  @Schema(required = true, description = "image url")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public SDTemplateCreateBulk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of template
   * @return description
  **/
  @Schema(description = "Description of template")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SDTemplateCreateBulk activeListing(Boolean activeListing) {
    this.activeListing = activeListing;
    return this;
  }

   /**
   * Set if the Template is active or not
   * @return activeListing
  **/
  @Schema(description = "Set if the Template is active or not")
  public Boolean isActiveListing() {
    return activeListing;
  }

  public void setActiveListing(Boolean activeListing) {
    this.activeListing = activeListing;
  }

  public SDTemplateCreateBulk ownerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
    return this;
  }

   /**
   * Blockchain address to set as owner of the custom contract, if contractType is passed in.
   * @return ownerAddress
  **/
  @Schema(description = "Blockchain address to set as owner of the custom contract, if contractType is passed in.")
  public String getOwnerAddress() {
    return ownerAddress;
  }

  public void setOwnerAddress(String ownerAddress) {
    this.ownerAddress = ownerAddress;
  }

  public SDTemplateCreateBulk props(SDTemplateCreateBulkProps props) {
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @Schema(description = "")
  public SDTemplateCreateBulkProps getProps() {
    return props;
  }

  public void setProps(SDTemplateCreateBulkProps props) {
    this.props = props;
  }

  public SDTemplateCreateBulk publicContractMetadata(Object publicContractMetadata) {
    this.publicContractMetadata = publicContractMetadata;
    return this;
  }

   /**
   * Returned to marketplaces as contract metadata
   * @return publicContractMetadata
  **/
  @Schema(description = "Returned to marketplaces as contract metadata")
  public Object getPublicContractMetadata() {
    return publicContractMetadata;
  }

  public void setPublicContractMetadata(Object publicContractMetadata) {
    this.publicContractMetadata = publicContractMetadata;
  }

  public SDTemplateCreateBulk publicTokenMetadata(Object publicTokenMetadata) {
    this.publicTokenMetadata = publicTokenMetadata;
    return this;
  }

   /**
   * Inherited by tokens, and returned to marketplaces as token metadata
   * @return publicTokenMetadata
  **/
  @Schema(description = "Inherited by tokens, and returned to marketplaces as token metadata")
  public Object getPublicTokenMetadata() {
    return publicTokenMetadata;
  }

  public void setPublicTokenMetadata(Object publicTokenMetadata) {
    this.publicTokenMetadata = publicTokenMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDTemplateCreateBulk sdTemplateCreateBulk = (SDTemplateCreateBulk) o;
    return Objects.equals(this.name, sdTemplateCreateBulk.name) &&
        Objects.equals(this.cap, sdTemplateCreateBulk.cap) &&
        Objects.equals(this.contractType, sdTemplateCreateBulk.contractType) &&
        Objects.equals(this.type, sdTemplateCreateBulk.type) &&
        Objects.equals(this.image, sdTemplateCreateBulk.image) &&
        Objects.equals(this.description, sdTemplateCreateBulk.description) &&
        Objects.equals(this.activeListing, sdTemplateCreateBulk.activeListing) &&
        Objects.equals(this.ownerAddress, sdTemplateCreateBulk.ownerAddress) &&
        Objects.equals(this.props, sdTemplateCreateBulk.props) &&
        Objects.equals(this.publicContractMetadata, sdTemplateCreateBulk.publicContractMetadata) &&
        Objects.equals(this.publicTokenMetadata, sdTemplateCreateBulk.publicTokenMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cap, contractType, type, image, description, activeListing, ownerAddress, props, publicContractMetadata, publicTokenMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDTemplateCreateBulk {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeListing: ").append(toIndentedString(activeListing)).append("\n");
    sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    publicContractMetadata: ").append(toIndentedString(publicContractMetadata)).append("\n");
    sb.append("    publicTokenMetadata: ").append(toIndentedString(publicTokenMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
