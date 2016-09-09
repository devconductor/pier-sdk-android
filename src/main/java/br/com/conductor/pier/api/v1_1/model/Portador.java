package br.com.conductor.pier.api.v1_1.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Portador
 **/
@ApiModel(description = "Portador")
public class Portador  {
  
  @SerializedName("dataCadastroPortador")
  private Date dataCadastroPortador = null;
  @SerializedName("dataCancelamentoPortador")
  private Date dataCancelamentoPortador = null;
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;

  
  /**
   * Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o Portador fora cadastrado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  public Date getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(Date dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  
  /**
   * Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o Portador fora cancelado, quando possuir esta informa\u00C3\u00A7\u00C3\u00A3o.")
  public Date getDataCancelamentoPortador() {
    return dataCancelamentoPortador;
  }
  public void setDataCancelamentoPortador(Date dataCancelamentoPortador) {
    this.dataCancelamentoPortador = dataCancelamentoPortador;
  }

  
  /**
   * Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Quanto ativa, indica que o cadastro do Portador est\u00C3\u00A1 ativo, em emissores que realizam este tipo de gest\u00C3\u00A3o.")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco (id)")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id).")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o nome a ser impresso no cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o nome a ser impresso no cart\u00C3\u00A3o.")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portador {\n");
    
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("  dataCancelamentoPortador: ").append(dataCancelamentoPortador).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


