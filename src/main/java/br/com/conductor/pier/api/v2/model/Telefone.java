package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * ObjetoTelefone
 **/
@ApiModel(description = "ObjetoTelefone")
public class Telefone  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("ramal")
  private String ramal = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("telefone")
  private String telefone = null;

  
  /**
   * C\u00C3\u00B3digo DDD do telefone (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo DDD do telefone (id).")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa (id) a qual o telefone pertence.")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone (id).")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * N\u00C3\u00BAmero do ramal.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do ramal.")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  
  /**
   * Apresenta o Status do Telefone, onde: '0': Inativo e '1': Ativo
   **/
  @ApiModelProperty(value = "Apresenta o Status do Telefone, onde: '0': Inativo e '1': Ativo")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * N\u00C3\u00BAmero do telefone.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telefone {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


