package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia do benef\u00EDcio
 **/
@ApiModel(description = "Objeto para persist\u00EAncia do benef\u00EDcio")
public class BeneficioPersist  {
  
  @SerializedName("numeroBeneficio")
  private String numeroBeneficio = null;
  @SerializedName("mesProvaVida")
  private Integer mesProvaVida = null;
  @SerializedName("tipoBeneficio")
  private String tipoBeneficio = null;

  
  /**
   * N\u00FAmero do benef\u00EDcio
   **/
  @ApiModelProperty(value = "N\u00FAmero do benef\u00EDcio")
  public String getNumeroBeneficio() {
    return numeroBeneficio;
  }
  public void setNumeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
  }

  
  /**
   * M\u00EAs de prova de vida do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "M\u00EAs de prova de vida do benefici\u00E1rio")
  public Integer getMesProvaVida() {
    return mesProvaVida;
  }
  public void setMesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
  }

  
  /**
   * Tipo do benef\u00EDcio
   **/
  @ApiModelProperty(value = "Tipo do benef\u00EDcio")
  public String getTipoBeneficio() {
    return tipoBeneficio;
  }
  public void setTipoBeneficio(String tipoBeneficio) {
    this.tipoBeneficio = tipoBeneficio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioPersist {\n");
    
    sb.append("  numeroBeneficio: ").append(numeroBeneficio).append("\n");
    sb.append("  mesProvaVida: ").append(mesProvaVida).append("\n");
    sb.append("  tipoBeneficio: ").append(tipoBeneficio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
