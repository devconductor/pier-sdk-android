package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso validar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso validar c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
public class CodigoSegurancaEMAILPersist  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("codigoSeguranca")
  private String codigoSeguranca = null;

  
  /**
   * E-mail usado para envio do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.
   **/
  @ApiModelProperty(value = "E-mail usado para envio do c\u00C3\u00B3digo de seguran\u00C3\u00A7a.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Token para valida\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Token para valida\u00C3\u00A7\u00C3\u00A3o.")
  public String getCodigoSeguranca() {
    return codigoSeguranca;
  }
  public void setCodigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaEMAILPersist {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  codigoSeguranca: ").append(codigoSeguranca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
