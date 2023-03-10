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
import gg.stardust.coresdk.models.SDTemplateGetTokensResponseTokenProps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * SDTemplateGetTokensResponseToken
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-09T11:52:00.026066-08:00[America/Los_Angeles]")
public class SDTemplateGetTokensResponseToken implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("templateId")
  private Integer templateId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("props")
  private SDTemplateGetTokensResponseTokenProps props = null;

  @SerializedName("publicMetadata")
  private Object publicMetadata = null;

  public SDTemplateGetTokensResponseToken id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Token ID Number (unsigned 32 bit integer)
   * minimum: 0
   * maximum: 2147483647
   * @return id
  **/
  @Schema(required = true, description = "Token ID Number (unsigned 32 bit integer)")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SDTemplateGetTokensResponseToken amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * u64 Number as String, min: 0, max: 9223372036854775807 (ex. \&quot;6\&quot;)
   * @return amount
  **/
  @Schema(required = true, description = "u64 Number as String, min: 0, max: 9223372036854775807 (ex. \"6\")")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public SDTemplateGetTokensResponseToken templateId(Integer templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template ID Number (unsigned 32 bit integer)
   * minimum: 0
   * maximum: 2147483647
   * @return templateId
  **/
  @Schema(description = "Template ID Number (unsigned 32 bit integer)")
  public Integer getTemplateId() {
    return templateId;
  }

  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }

  public SDTemplateGetTokensResponseToken name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template Name
   * @return name
  **/
  @Schema(description = "Template Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SDTemplateGetTokensResponseToken props(SDTemplateGetTokensResponseTokenProps props) {
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @Schema(description = "")
  public SDTemplateGetTokensResponseTokenProps getProps() {
    return props;
  }

  public void setProps(SDTemplateGetTokensResponseTokenProps props) {
    this.props = props;
  }

  public SDTemplateGetTokensResponseToken publicMetadata(Object publicMetadata) {
    this.publicMetadata = publicMetadata;
    return this;
  }

   /**
   * Returned to marketplaces as token metadata
   * @return publicMetadata
  **/
  @Schema(description = "Returned to marketplaces as token metadata")
  public Object getPublicMetadata() {
    return publicMetadata;
  }

  public void setPublicMetadata(Object publicMetadata) {
    this.publicMetadata = publicMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDTemplateGetTokensResponseToken sdTemplateGetTokensResponseToken = (SDTemplateGetTokensResponseToken) o;
    return Objects.equals(this.id, sdTemplateGetTokensResponseToken.id) &&
        Objects.equals(this.amount, sdTemplateGetTokensResponseToken.amount) &&
        Objects.equals(this.templateId, sdTemplateGetTokensResponseToken.templateId) &&
        Objects.equals(this.name, sdTemplateGetTokensResponseToken.name) &&
        Objects.equals(this.props, sdTemplateGetTokensResponseToken.props) &&
        Objects.equals(this.publicMetadata, sdTemplateGetTokensResponseToken.publicMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, templateId, name, props, publicMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDTemplateGetTokensResponseToken {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    publicMetadata: ").append(toIndentedString(publicMetadata)).append("\n");
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
