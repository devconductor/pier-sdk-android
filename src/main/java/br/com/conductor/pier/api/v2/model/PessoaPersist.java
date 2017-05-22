package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import java.util.*;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * PessoaPersist
 **/
@ApiModel(description = "PessoaPersist")
public class PessoaPersist  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataEmissaoIdentidade")
  private Date dataEmissaoIdentidade = null;
  @SerializedName("dataNascimento")
  private Date dataNascimento = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("nacionalidade")
  private String nacionalidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("profissao")
  private String profissao = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaPersist> telefones = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;

  
  /**
   * N\u00C3\u00BAmero do CPF, quando PF.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do CPF, quando PF.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data emiss\u00C3\u00A3o da Identidade
   **/
  @ApiModelProperty(value = "Data emiss\u00C3\u00A3o da Identidade")
  public Date getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(Date dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   **/
  @ApiModelProperty(value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.")
  public Date getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Email do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Email do s\u00C3\u00B3cio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Estado civil do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Estado civil do s\u00C3\u00B3cio")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Nacionalidade do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Nacionalidade do s\u00C3\u00B3cio")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Apresenta o Nome do Socio
   **/
  @ApiModelProperty(required = true, value = "Apresenta o Nome do Socio")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00C3\u00BAmero da Identidade.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Identidade.")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00C3\u00A3o expedidor da Identidade.
   **/
  @ApiModelProperty(value = "Org\u00C3\u00A3o expedidor da Identidade.")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Profiss\u00C3\u00A3o do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Profiss\u00C3\u00A3o do s\u00C3\u00B3cio")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino).")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Informa os telefones do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Informa os telefones do s\u00C3\u00B3cio")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  @ApiModelProperty(value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaPersist {\n");
    
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  estadoCivil: ").append(estadoCivil).append("\n");
    sb.append("  nacionalidade: ").append(nacionalidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  profissao: ").append(profissao).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

