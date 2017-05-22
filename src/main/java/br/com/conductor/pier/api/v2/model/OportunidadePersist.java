package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DetalheOportunidadePersist;
import java.util.*;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Oportunidade
 **/
@ApiModel(description = "Objeto Oportunidade")
public class OportunidadePersist  {
  
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private Date dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private Date dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<DetalheOportunidadePersist> detalhes = null;

  
  /**
   * C\u00C3\u00B3digo identificador do tipo oportunidade
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do tipo oportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do status oportunidade
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do status oportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * N\u00C3\u00BAmero receita federal do cliente
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero receita federal do cliente")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Date de in\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade
   **/
  @ApiModelProperty(required = true, value = "Date de in\u00C3\u00ADcio da vig\u00C3\u00AAncia da oportunidade")
  public Date getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(Date dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * Data do fim da vig\u00C3\u00AAncia da oportunidade
   **/
  @ApiModelProperty(required = true, value = "Data do fim da vig\u00C3\u00AAncia da oportunidade")
  public Date getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(Date dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Atributo que indica se a oportunidade est\u00C3\u00A1 ativa
   **/
  @ApiModelProperty(required = true, value = "Atributo que indica se a oportunidade est\u00C3\u00A1 ativa")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Lista de detalhes
   **/
  @ApiModelProperty(required = true, value = "Lista de detalhes")
  public List<DetalheOportunidadePersist> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadePersist> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadePersist {\n");
    
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  idStatusOportunidade: ").append(idStatusOportunidade).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataInicioVigencia: ").append(dataInicioVigencia).append("\n");
    sb.append("  dataFimVigencia: ").append(dataFimVigencia).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

