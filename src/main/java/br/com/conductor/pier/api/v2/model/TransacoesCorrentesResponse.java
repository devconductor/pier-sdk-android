package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto transacoes correntes
 **/
@ApiModel(description = "Objeto transacoes correntes")
public class TransacoesCorrentesResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTransacao")
  private Long idTipoTransacao = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;
  @SerializedName("statusTransacao")
  private String statusTransacao = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("tipoEvento")
  private String tipoEvento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("cartaoMascarado")
  private String cartaoMascarado = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("dataFaturamento")
  private String dataFaturamento = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("modoEntradaTransacao")
  private String modoEntradaTransacao = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;
  @SerializedName("cotacaoUSD")
  private BigDecimal cotacaoUSD = null;
  @SerializedName("dataCotacaoUSD")
  private String dataCotacaoUSD = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoReferencia")
  private String codigoReferencia = null;
  @SerializedName("codigoTerminal")
  private String codigoTerminal = null;
  @SerializedName("codigoMCC")
  private Long codigoMCC = null;
  @SerializedName("grupoMCC")
  private Long grupoMCC = null;
  @SerializedName("grupoDescricaoMCC")
  private String grupoDescricaoMCC = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("localidadeEstabelecimento")
  private String localidadeEstabelecimento = null;
  @SerializedName("planoParcelamento")
  private Long planoParcelamento = null;
  @SerializedName("numeroParcela")
  private Long numeroParcela = null;
  @SerializedName("detalhesTransacao")
  private String detalhesTransacao = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("flagFaturado")
  private Integer flagFaturado = null;
  @SerializedName("flagEstorno")
  private Integer flagEstorno = null;
  @SerializedName("idTransacaoEstorno")
  private Long idTransacaoEstorno = null;
  @SerializedName("valorCompraMoedaEstrangeira")
  private BigDecimal valorCompraMoedaEstrangeira = null;
  @SerializedName("moedaEstrangeira")
  private String moedaEstrangeira = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Status de Processamento da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Status de Processamento da Transa\u00E7\u00E3o")
  public String getStatusTransacao() {
    return statusTransacao;
  }
  public void setStatusTransacao(String statusTransacao) {
    this.statusTransacao = statusTransacao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Evento que originou a Transa\u00E7\u00E3o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Evento que originou a Transa\u00E7\u00E3o (id)")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Descri\u00E7\u00E3o do Evento que representa a Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Evento que representa a Transa\u00E7\u00E3o")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000
   **/
  @ApiModelProperty(value = "N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * Nome completo do Portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome completo do Portador do Cart\u00E3o")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Data em que a Transa\u00E7\u00E3o foi realizada
   **/
  @ApiModelProperty(value = "Data em que a Transa\u00E7\u00E3o foi realizada")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Data de Faturamento da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de Faturamento da Transa\u00E7\u00E3o")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Data de Vencimento da Fatura
   **/
  @ApiModelProperty(value = "Data de Vencimento da Fatura")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas
   **/
  @ApiModelProperty(value = "Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada
   **/
  @ApiModelProperty(value = "Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em Real (BRL)
   **/
  @ApiModelProperty(value = "Valor da Transa\u00E7\u00E3o em Real (BRL)")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)
   **/
  @ApiModelProperty(value = "Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)
   **/
  @ApiModelProperty(value = "Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)
   **/
  @ApiModelProperty(value = "Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado
   **/
  @ApiModelProperty(value = "C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo do Estabelecimento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo do Estabelecimento")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Nome do Estabelecimento
   **/
  @ApiModelProperty(value = "Nome do Estabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Nome Fantasia do Estabelecimento
   **/
  @ApiModelProperty(value = "Nome Fantasia do Estabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Localidade do Estabelecimento
   **/
  @ApiModelProperty(value = "Localidade do Estabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas
   **/
  @ApiModelProperty(value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas")
  public Long getPlanoParcelamento() {
    return planoParcelamento;
  }
  public void setPlanoParcelamento(Long planoParcelamento) {
    this.planoParcelamento = planoParcelamento;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela
   **/
  @ApiModelProperty(value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela")
  public Long getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Long numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Detalhes complementares a respeito da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Detalhes complementares a respeito da Transa\u00E7\u00E3o")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o foi estornada
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a Transa\u00E7\u00E3o foi estornada")
  public Integer getFlagEstorno() {
    return flagEstorno;
  }
  public void setFlagEstorno(Integer flagEstorno) {
    this.flagEstorno = flagEstorno;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * Valor da compra em moeda estrangeira
   **/
  @ApiModelProperty(value = "Valor da compra em moeda estrangeira")
  public BigDecimal getValorCompraMoedaEstrangeira() {
    return valorCompraMoedaEstrangeira;
  }
  public void setValorCompraMoedaEstrangeira(BigDecimal valorCompraMoedaEstrangeira) {
    this.valorCompraMoedaEstrangeira = valorCompraMoedaEstrangeira;
  }

  
  /**
   * S\u00EDmbolo da moeda estrangeira
   **/
  @ApiModelProperty(value = "S\u00EDmbolo da moeda estrangeira")
  public String getMoedaEstrangeira() {
    return moedaEstrangeira;
  }
  public void setMoedaEstrangeira(String moedaEstrangeira) {
    this.moedaEstrangeira = moedaEstrangeira;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacoesCorrentesResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("  statusTransacao: ").append(statusTransacao).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  cartaoMascarado: ").append(cartaoMascarado).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  dataFaturamento: ").append(dataFaturamento).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  modoEntradaTransacao: ").append(modoEntradaTransacao).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("  cotacaoUSD: ").append(cotacaoUSD).append("\n");
    sb.append("  dataCotacaoUSD: ").append(dataCotacaoUSD).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoReferencia: ").append(codigoReferencia).append("\n");
    sb.append("  codigoTerminal: ").append(codigoTerminal).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("  grupoMCC: ").append(grupoMCC).append("\n");
    sb.append("  grupoDescricaoMCC: ").append(grupoDescricaoMCC).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  localidadeEstabelecimento: ").append(localidadeEstabelecimento).append("\n");
    sb.append("  planoParcelamento: ").append(planoParcelamento).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  detalhesTransacao: ").append(detalhesTransacao).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  flagFaturado: ").append(flagFaturado).append("\n");
    sb.append("  flagEstorno: ").append(flagEstorno).append("\n");
    sb.append("  idTransacaoEstorno: ").append(idTransacaoEstorno).append("\n");
    sb.append("  valorCompraMoedaEstrangeira: ").append(valorCompraMoedaEstrangeira).append("\n");
    sb.append("  moedaEstrangeira: ").append(moedaEstrangeira).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
