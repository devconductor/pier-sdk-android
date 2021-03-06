package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta da seguran\u00E7a mobile
 **/
@ApiModel(description = "Objeto de resposta da seguran\u00E7a mobile")
public class SegurancaMobileResponse  {
  
  @SerializedName("canal")
  private String canal = null;
  @SerializedName("chapaPromotor")
  private String chapaPromotor = null;
  @SerializedName("codOperacaoNeurotech")
  private String codOperacaoNeurotech = null;
  @SerializedName("cpfCnpj")
  private String cpfCnpj = null;
  @SerializedName("dataAtivacao")
  private String dataAtivacao = null;
  @SerializedName("dataExpiracao")
  private String dataExpiracao = null;
  @SerializedName("dataUtilizacao")
  private String dataUtilizacao = null;
  @SerializedName("deviceName")
  private String deviceName = null;
  @SerializedName("deviceToken")
  private String deviceToken = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("respostaNeurotech")
  private String respostaNeurotech = null;
  public enum StatusRequisicaoEnum {
     PENDENTE,  APROVADA,  NEGADA,  CANCELADA,  ATIVADO, 
  };
  @SerializedName("statusRequisicao")
  private StatusRequisicaoEnum statusRequisicao = null;
  @SerializedName("tablet")
  private String tablet = null;
  @SerializedName("token")
  private String token = null;

  
  /**
   * Canal de entrada
   **/
  @ApiModelProperty(value = "Canal de entrada")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Chapa do promotor 
   **/
  @ApiModelProperty(value = "Chapa do promotor ")
  public String getChapaPromotor() {
    return chapaPromotor;
  }
  public void setChapaPromotor(String chapaPromotor) {
    this.chapaPromotor = chapaPromotor;
  }

  
  /**
   * C\u00F3digo de opera\u00E7\u00E3o da Neurotech
   **/
  @ApiModelProperty(value = "C\u00F3digo de opera\u00E7\u00E3o da Neurotech")
  public String getCodOperacaoNeurotech() {
    return codOperacaoNeurotech;
  }
  public void setCodOperacaoNeurotech(String codOperacaoNeurotech) {
    this.codOperacaoNeurotech = codOperacaoNeurotech;
  }

  
  /**
   * CNPJ ou CPF da pessoa
   **/
  @ApiModelProperty(value = "CNPJ ou CPF da pessoa")
  public String getCpfCnpj() {
    return cpfCnpj;
  }
  public void setCpfCnpj(String cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o do token
   **/
  @ApiModelProperty(value = "Data da ativa\u00E7\u00E3o do token")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * Data da expira\u00E7\u00E3o do token
   **/
  @ApiModelProperty(value = "Data da expira\u00E7\u00E3o do token")
  public String getDataExpiracao() {
    return dataExpiracao;
  }
  public void setDataExpiracao(String dataExpiracao) {
    this.dataExpiracao = dataExpiracao;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o do token
   **/
  @ApiModelProperty(value = "Data da utiliza\u00E7\u00E3o do token")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Nome do dispositivo
   **/
  @ApiModelProperty(value = "Nome do dispositivo")
  public String getDeviceName() {
    return deviceName;
  }
  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  
  /**
   * Token do dispositivo
   **/
  @ApiModelProperty(value = "Token do dispositivo")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Identificador da seguran\u00E7a mobile
   **/
  @ApiModelProperty(value = "Identificador da seguran\u00E7a mobile")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Resposta da Neurotech
   **/
  @ApiModelProperty(value = "Resposta da Neurotech")
  public String getRespostaNeurotech() {
    return respostaNeurotech;
  }
  public void setRespostaNeurotech(String respostaNeurotech) {
    this.respostaNeurotech = respostaNeurotech;
  }

  
  /**
   * Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token
   **/
  @ApiModelProperty(value = "Status da requisi\u00E7\u00E3o/solicita\u00E7\u00E3o do token")
  public StatusRequisicaoEnum getStatusRequisicao() {
    return statusRequisicao;
  }
  public void setStatusRequisicao(StatusRequisicaoEnum statusRequisicao) {
    this.statusRequisicao = statusRequisicao;
  }

  
  /**
   * Identificador do Tablet
   **/
  @ApiModelProperty(value = "Identificador do Tablet")
  public String getTablet() {
    return tablet;
  }
  public void setTablet(String tablet) {
    this.tablet = tablet;
  }

  
  /**
   * Valor do token
   **/
  @ApiModelProperty(value = "Valor do token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegurancaMobileResponse {\n");
    
    sb.append("  canal: ").append(canal).append("\n");
    sb.append("  chapaPromotor: ").append(chapaPromotor).append("\n");
    sb.append("  codOperacaoNeurotech: ").append(codOperacaoNeurotech).append("\n");
    sb.append("  cpfCnpj: ").append(cpfCnpj).append("\n");
    sb.append("  dataAtivacao: ").append(dataAtivacao).append("\n");
    sb.append("  dataExpiracao: ").append(dataExpiracao).append("\n");
    sb.append("  dataUtilizacao: ").append(dataUtilizacao).append("\n");
    sb.append("  deviceName: ").append(deviceName).append("\n");
    sb.append("  deviceToken: ").append(deviceToken).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  respostaNeurotech: ").append(respostaNeurotech).append("\n");
    sb.append("  statusRequisicao: ").append(statusRequisicao).append("\n");
    sb.append("  tablet: ").append(tablet).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
