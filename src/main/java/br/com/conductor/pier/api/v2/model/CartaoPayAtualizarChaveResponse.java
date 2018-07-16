package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{cartao_pay_atualizar_chave_response_description}}}
 **/
@ApiModel(description = "{{{cartao_pay_atualizar_chave_response_description}}}")
public class CartaoPayAtualizarChaveResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idEntidade")
  private Long idEntidade = null;
  @SerializedName("nomeEntidade")
  private String nomeEntidade = null;
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("chaveCriptograma")
  private String chaveCriptograma = null;

  
  /**
   * {{{cartao_pay_base_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{cartao_pay_base_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_pay_base_response_data_validade_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_data_validade_cartao_value}}}")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * {{{cartao_pay_base_response_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{cartao_pay_base_response_id_entidade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_id_entidade_value}}}")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * {{{cartao_pay_base_response_nome_entidade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_nome_entidade_value}}}")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * {{{cartao_pay_base_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_base_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{cartao_pay_atualizar_chave_response_chave_criptograma_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_pay_atualizar_chave_response_chave_criptograma_value}}}")
  public String getChaveCriptograma() {
    return chaveCriptograma;
  }
  public void setChaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayAtualizarChaveResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idEntidade: ").append(idEntidade).append("\n");
    sb.append("  nomeEntidade: ").append(nomeEntidade).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  chaveCriptograma: ").append(chaveCriptograma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


