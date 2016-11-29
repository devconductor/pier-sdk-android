package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Status Conta
 **/
@ApiModel(description = "Status Conta")
public class StatusConta  {
  
  @SerializedName("flagAlteraLimite")
  private Integer flagAlteraLimite = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("mensagemConsultaNegada")
  private String mensagemConsultaNegada = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.
   **/
  @ApiModelProperty(required = true, value = "Par\u00C3\u00A2metro que define se o Status da Conta permite realizar a Altera\u00C3\u00A7\u00C3\u00A3o de Limites do Portador, sendo: 0: Inativo e 1: Ativo.")
  public Integer getFlagAlteraLimite() {
    return flagAlteraLimite;
  }
  public void setFlagAlteraLimite(Integer flagAlteraLimite) {
    this.flagAlteraLimite = flagAlteraLimite;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status da Conta (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.
   **/
  @ApiModelProperty(value = "Apresenta o texto com o motivo que ser\u00C3\u00A1 apresentado na resposta as opera\u00C3\u00A7\u00C3\u00B5es de Listar e Consultar LimitesDisponibilidades.")
  public String getMensagemConsultaNegada() {
    return mensagemConsultaNegada;
  }
  public void setMensagemConsultaNegada(String mensagemConsultaNegada) {
    this.mensagemConsultaNegada = mensagemConsultaNegada;
  }

  
  /**
   * Nome atribu\u00C3\u00ADdo ao Status da Conta.
   **/
  @ApiModelProperty(required = true, value = "Nome atribu\u00C3\u00ADdo ao Status da Conta.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusConta {\n");
    
    sb.append("  flagAlteraLimite: ").append(flagAlteraLimite).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  mensagemConsultaNegada: ").append(mensagemConsultaNegada).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


