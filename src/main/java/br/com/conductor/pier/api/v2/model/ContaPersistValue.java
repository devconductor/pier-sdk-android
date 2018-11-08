package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_persist_description}}}
 **/
@ApiModel(description = "{{{conta_persist_description}}}")
public class ContaPersistValue  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("idEnderecoCorrespondencia")
  private Long idEnderecoCorrespondencia = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("flagFaturaPorEmail")
  private Integer flagFaturaPorEmail = null;
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("matricula")
  private String matricula = null;
  @SerializedName("responsavelDigitacao")
  private String responsavelDigitacao = null;
  @SerializedName("idPromotorVenda")
  private Integer idPromotorVenda = null;

  
  /**
   * {{{conta_persist_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_persist_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_persist_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_persist_dia_vencimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_dia_vencimento_value}}}")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_persist_valor_renda_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_valor_renda_value}}}")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_persist_canal_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_persist_canal_entrada_value}}}")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{conta_persist_valor_pontuacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_valor_pontuacao_value}}}")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{conta_persist_id_endereco_correspondencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_id_endereco_correspondencia_value}}}")
  public Long getIdEnderecoCorrespondencia() {
    return idEnderecoCorrespondencia;
  }
  public void setIdEnderecoCorrespondencia(Long idEnderecoCorrespondencia) {
    this.idEnderecoCorrespondencia = idEnderecoCorrespondencia;
  }

  
  /**
   * {{{conta_persist_limite_global_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_limite_global_value}}}")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{conta_persist_limite_maximo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_limite_maximo_value}}}")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{conta_persist_limite_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_limite_parcelas_value}}}")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{conta_persist_limite_consignado_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_limite_consignado_value}}}")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * {{{conta_persist_flag_fatura_por_email_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{conta_persist_flag_fatura_por_email_value}}}")
  public Integer getFlagFaturaPorEmail() {
    return flagFaturaPorEmail;
  }
  public void setFlagFaturaPorEmail(Integer flagFaturaPorEmail) {
    this.flagFaturaPorEmail = flagFaturaPorEmail;
  }

  
  /**
   * {{{conta_persist_funcao_ativa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_persist_funcao_ativa_value}}}")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_matricula_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_matricula_value}}}")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_responsavelDigitacao_value}}}")
  public String getResponsavelDigitacao() {
    return responsavelDigitacao;
  }
  public void setResponsavelDigitacao(String responsavelDigitacao) {
    this.responsavelDigitacao = responsavelDigitacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_idPromotorVenda_value}}}")
  public Integer getIdPromotorVenda() {
    return idPromotorVenda;
  }
  public void setIdPromotorVenda(Integer idPromotorVenda) {
    this.idPromotorVenda = idPromotorVenda;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPersistValue {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  idEnderecoCorrespondencia: ").append(idEnderecoCorrespondencia).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  flagFaturaPorEmail: ").append(flagFaturaPorEmail).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  matricula: ").append(matricula).append("\n");
    sb.append("  responsavelDigitacao: ").append(responsavelDigitacao).append("\n");
    sb.append("  idPromotorVenda: ").append(idPromotorVenda).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
