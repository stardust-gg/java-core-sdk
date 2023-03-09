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
import gg.stardust.coresdk.models.SDGameGetResponseFees;
import gg.stardust.coresdk.models.SDTemplateGetAllResponseProps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * SDTemplateGetResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-09T11:52:00.026066-08:00[America/Los_Angeles]")
public class SDTemplateGetResponse implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("gameId")
  private Integer gameId = null;

  @SerializedName("_id")
  private Integer _id = null;

  @SerializedName("cap")
  private String cap = null;

  /**
   * The type of custom contract bieng used for this template.
   */
  @JsonAdapter(ContractTypeEnum.Adapter.class)
  public enum ContractTypeEnum {
    ERC721("ERC721"),
    INTERNAL_MINT("internal-mint"),
    EXTERNAL_NO_MINT("external-no-mint");

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

  @SerializedName("totalSupply")
  private String totalSupply = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets type
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

  @SerializedName("props")
  private SDTemplateGetAllResponseProps props = null;

  @SerializedName("publicContractMetadata")
  private Object publicContractMetadata = null;

  @SerializedName("publicTokenMetadata")
  private Object publicTokenMetadata = null;

  @SerializedName("fees")
  private List<SDGameGetResponseFees> fees = null;

  public SDTemplateGetResponse gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * Game ID Number (unsigned 32 bit integer)
   * minimum: 0
   * maximum: 2147483647
   * @return gameId
  **/
  @Schema(required = true, description = "Game ID Number (unsigned 32 bit integer)")
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public SDTemplateGetResponse _id(Integer _id) {
    this._id = _id;
    return this;
  }

   /**
   * Get _id
   * minimum: 0
   * maximum: 2147483647
   * @return _id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return _id;
  }

  public void setId(Integer _id) {
    this._id = _id;
  }

  public SDTemplateGetResponse cap(String cap) {
    this.cap = cap;
    return this;
  }

   /**
   * u96 Number as String, min: 0, max: 39614081257132168796771975167
   * @return cap
  **/
  @Schema(required = true, description = "u96 Number as String, min: 0, max: 39614081257132168796771975167")
  public String getCap() {
    return cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public SDTemplateGetResponse contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

   /**
   * The type of custom contract bieng used for this template.
   * @return contractType
  **/
  @Schema(description = "The type of custom contract bieng used for this template.")
  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public SDTemplateGetResponse totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * u96 Number as String, min: 0, max: 39614081257132168796771975167
   * @return totalSupply
  **/
  @Schema(required = true, description = "u96 Number as String, min: 0, max: 39614081257132168796771975167")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  public SDTemplateGetResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template
   * @return name
  **/
  @Schema(required = true, description = "The name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SDTemplateGetResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SDTemplateGetResponse props(SDTemplateGetAllResponseProps props) {
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @Schema(required = true, description = "")
  public SDTemplateGetAllResponseProps getProps() {
    return props;
  }

  public void setProps(SDTemplateGetAllResponseProps props) {
    this.props = props;
  }

  public SDTemplateGetResponse publicContractMetadata(Object publicContractMetadata) {
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

  public SDTemplateGetResponse publicTokenMetadata(Object publicTokenMetadata) {
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

  public SDTemplateGetResponse fees(List<SDGameGetResponseFees> fees) {
    this.fees = fees;
    return this;
  }

  public SDTemplateGetResponse addFeesItem(SDGameGetResponseFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<SDGameGetResponseFees>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @Schema(description = "")
  public List<SDGameGetResponseFees> getFees() {
    return fees;
  }

  public void setFees(List<SDGameGetResponseFees> fees) {
    this.fees = fees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDTemplateGetResponse sdTemplateGetResponse = (SDTemplateGetResponse) o;
    return Objects.equals(this.gameId, sdTemplateGetResponse.gameId) &&
        Objects.equals(this._id, sdTemplateGetResponse._id) &&
        Objects.equals(this.cap, sdTemplateGetResponse.cap) &&
        Objects.equals(this.contractType, sdTemplateGetResponse.contractType) &&
        Objects.equals(this.totalSupply, sdTemplateGetResponse.totalSupply) &&
        Objects.equals(this.name, sdTemplateGetResponse.name) &&
        Objects.equals(this.type, sdTemplateGetResponse.type) &&
        Objects.equals(this.props, sdTemplateGetResponse.props) &&
        Objects.equals(this.publicContractMetadata, sdTemplateGetResponse.publicContractMetadata) &&
        Objects.equals(this.publicTokenMetadata, sdTemplateGetResponse.publicTokenMetadata) &&
        Objects.equals(this.fees, sdTemplateGetResponse.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, _id, cap, contractType, totalSupply, name, type, props, publicContractMetadata, publicTokenMetadata, fees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDTemplateGetResponse {\n");
    
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    publicContractMetadata: ").append(toIndentedString(publicContractMetadata)).append("\n");
    sb.append("    publicTokenMetadata: ").append(toIndentedString(publicTokenMetadata)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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
