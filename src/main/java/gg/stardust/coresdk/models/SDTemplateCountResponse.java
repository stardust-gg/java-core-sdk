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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * SDTemplateCountResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-09T11:52:00.026066-08:00[America/Los_Angeles]")
public class SDTemplateCountResponse implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("count")
  private Integer count = null;

  public SDTemplateCountResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Game ID Number (unsigned 32 bit integer)
   * @return count
  **/
  @Schema(required = true, description = "Game ID Number (unsigned 32 bit integer)")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDTemplateCountResponse sdTemplateCountResponse = (SDTemplateCountResponse) o;
    return Objects.equals(this.count, sdTemplateCountResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDTemplateCountResponse {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
