package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{conta_detalhe_response_description}}}")
public class ContaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("nomeFantasiaBasica")
  private String nomeFantasiaBasica = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("statusConta")
  private String statusConta = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("melhorDiaCompra")
  private Integer melhorDiaCompra = null;
  @SerializedName("dataStatusConta")
  private String dataStatusConta = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataUltimaAlteracaoVencimento")
  private String dataUltimaAlteracaoVencimento = null;
  @SerializedName("dataHoraUltimaCompra")
  private String dataHoraUltimaCompra = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("formaEnvioFatura")
  private String formaEnvioFatura = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteSaqueGlobal")
  private BigDecimal limiteSaqueGlobal = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;
  @SerializedName("saldoDisponivelSaque")
  private BigDecimal saldoDisponivelSaque = null;
  @SerializedName("impedidoFinanciamento")
  private Boolean impedidoFinanciamento = null;
  @SerializedName("diasAtraso")
  private Long diasAtraso = null;
  @SerializedName("proximoVencimentoPadrao")
  private String proximoVencimentoPadrao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("quantidadePagamentos")
  private Integer quantidadePagamentos = null;
  @SerializedName("correspondencia")
  private Long correspondencia = null;
  @SerializedName("dataInicioAtraso")
  private String dataInicioAtraso = null;
  @SerializedName("rotativoPagaJuros")
  private BigDecimal rotativoPagaJuros = null;
  @SerializedName("totalPosProx")
  private BigDecimal totalPosProx = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("saldoExtratoAnterior")
  private BigDecimal saldoExtratoAnterior = null;
  @SerializedName("aceitaNovaContaPorGrupoProduto")
  private Boolean aceitaNovaContaPorGrupoProduto = null;
  public enum FuncaoAtivaEnum {
     DEBITO_CREDITO,  CREDITO, 
  };
  @SerializedName("funcaoAtiva")
  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * {{{conta_detalhe_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{conta_detalhe_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_detalhe_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{conta_detalhe_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_detalhe_response_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_detalhe_response_nome_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_nome_origem_comercial_value}}}")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{conta_detalhe_response_id_fantasia_basica_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_fantasia_basica_value}}}")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * {{{conta_detalhe_response_nome_fantasia_basica_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_nome_fantasia_basica_value}}}")
  public String getNomeFantasiaBasica() {
    return nomeFantasiaBasica;
  }
  public void setNomeFantasiaBasica(String nomeFantasiaBasica) {
    this.nomeFantasiaBasica = nomeFantasiaBasica;
  }

  
  /**
   * {{{conta_detalhe_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{conta_detalhe_response_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_status_conta_value}}}")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{conta_detalhe_response_dia_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_dia_vencimento_value}}}")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_detalhe_response_melhor_dia_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_melhor_dia_compra_value}}}")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * {{{conta_detalhe_response_data_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_data_status_conta_value}}}")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * {{{conta_detalhe_response_data_cadastro_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_data_cadastro_value}}}")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{conta_detalhe_response_data_ultima_alteracao_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_data_ultima_alteracao_vencimento_value}}}")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * {{{conta_detalhe_response_data_hora_ultima_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_data_hora_ultima_compra_value}}}")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * {{{conta_detalhe_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{conta_detalhe_response_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{conta_detalhe_response_valor_renda_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_valor_renda_value}}}")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_detalhe_response_forma_envio_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_forma_envio_fatura_value}}}")
  public String getFormaEnvioFatura() {
    return formaEnvioFatura;
  }
  public void setFormaEnvioFatura(String formaEnvioFatura) {
    this.formaEnvioFatura = formaEnvioFatura;
  }

  
  /**
   * {{{conta_detalhe_response_titular_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_titular_value}}}")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * {{{conta_detalhe_response_limite_global_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_limite_global_value}}}")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_limite_saque_global_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_limite_saque_global_value}}}")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_saldo_disponivel_global_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_saldo_disponivel_global_value}}}")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * {{{conta_detalhe_response_saldo_disponivel_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_saldo_disponivel_saque_value}}}")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * {{{conta_detalhe_response_impedido_de_financiamento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_impedido_de_financiamento_value}}}")
  public Boolean getImpedidoFinanciamento() {
    return impedidoFinanciamento;
  }
  public void setImpedidoFinanciamento(Boolean impedidoFinanciamento) {
    this.impedidoFinanciamento = impedidoFinanciamento;
  }

  
  /**
   * {{{conta_detalhe_response_dias_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_dias_atraso_value}}}")
  public Long getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Long diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  
  /**
   * {{{conta_response_proximo_vencimento_padrao_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_proximo_vencimento_padrao_value}}}")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * {{{conta_detalhe_response_id_proposta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_id_proposta_value}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{conta_detalhe_response_quantidade_pagamentos_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_quantidade_pagamentos_value}}}")
  public Integer getQuantidadePagamentos() {
    return quantidadePagamentos;
  }
  public void setQuantidadePagamentos(Integer quantidadePagamentos) {
    this.quantidadePagamentos = quantidadePagamentos;
  }

  
  /**
   * {{{conta_detalhe_response_correspondencia_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_correspondencia_value}}}")
  public Long getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Long correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * {{{conta_detalhe_response_data_inicio_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_data_inicio_atraso_value}}}")
  public String getDataInicioAtraso() {
    return dataInicioAtraso;
  }
  public void setDataInicioAtraso(String dataInicioAtraso) {
    this.dataInicioAtraso = dataInicioAtraso;
  }

  
  /**
   * {{{estado_conta_response_rotativo_paga_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{estado_conta_response_rotativo_paga_juros_value}}}")
  public BigDecimal getRotativoPagaJuros() {
    return rotativoPagaJuros;
  }
  public void setRotativoPagaJuros(BigDecimal rotativoPagaJuros) {
    this.rotativoPagaJuros = rotativoPagaJuros;
  }

  
  /**
   * {{{estado_conta_response_total_pos_proximo_value}}}
   **/
  @ApiModelProperty(value = "{{{estado_conta_response_total_pos_proximo_value}}}")
  public BigDecimal getTotalPosProx() {
    return totalPosProx;
  }
  public void setTotalPosProx(BigDecimal totalPosProx) {
    this.totalPosProx = totalPosProx;
  }

  
  /**
   * {{{estado_conta_response_saldo_atual_final_value}}}
   **/
  @ApiModelProperty(value = "{{{estado_conta_response_saldo_atual_final_value}}}")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * {{{estado_conta_response_saldo_extrato_anterior_value}}}
   **/
  @ApiModelProperty(value = "{{{estado_conta_response_saldo_extrato_anterior_value}}}")
  public BigDecimal getSaldoExtratoAnterior() {
    return saldoExtratoAnterior;
  }
  public void setSaldoExtratoAnterior(BigDecimal saldoExtratoAnterior) {
    this.saldoExtratoAnterior = saldoExtratoAnterior;
  }

  
  /**
   * {{{conta_detalhe_response_aceita_nova_conta_grupo_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_detalhe_response_aceita_nova_conta_grupo_produto_value}}}")
  public Boolean getAceitaNovaContaPorGrupoProduto() {
    return aceitaNovaContaPorGrupoProduto;
  }
  public void setAceitaNovaContaPorGrupoProduto(Boolean aceitaNovaContaPorGrupoProduto) {
    this.aceitaNovaContaPorGrupoProduto = aceitaNovaContaPorGrupoProduto;
  }

  
  /**
   * {{{conta_response_funcao_ativa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_funcao_ativa_value}}}")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  nomeFantasiaBasica: ").append(nomeFantasiaBasica).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  melhorDiaCompra: ").append(melhorDiaCompra).append("\n");
    sb.append("  dataStatusConta: ").append(dataStatusConta).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataUltimaAlteracaoVencimento: ").append(dataUltimaAlteracaoVencimento).append("\n");
    sb.append("  dataHoraUltimaCompra: ").append(dataHoraUltimaCompra).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  formaEnvioFatura: ").append(formaEnvioFatura).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  impedidoFinanciamento: ").append(impedidoFinanciamento).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("  proximoVencimentoPadrao: ").append(proximoVencimentoPadrao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  quantidadePagamentos: ").append(quantidadePagamentos).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  dataInicioAtraso: ").append(dataInicioAtraso).append("\n");
    sb.append("  rotativoPagaJuros: ").append(rotativoPagaJuros).append("\n");
    sb.append("  totalPosProx: ").append(totalPosProx).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoExtratoAnterior: ").append(saldoExtratoAnterior).append("\n");
    sb.append("  aceitaNovaContaPorGrupoProduto: ").append(aceitaNovaContaPorGrupoProduto).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
