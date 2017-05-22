package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersist;
import br.com.conductor.pier.api.v2.model.PessoaPersist;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import java.util.*;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * PessoaJuridicaAprovadaPersist
 **/
@ApiModel(description = "PessoaJuridicaAprovadaPersist")
public class PessoaJuridicaAprovadaPersist  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("dataAberturaEmpresa")
  private Date dataAberturaEmpresa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaPersist> telefones = null;
  @SerializedName("enderecos")
  private List<EnderecoAprovadoPersist> enderecos = null;
  @SerializedName("socios")
  private List<PessoaPersist> socios = null;

  
  /**
   * Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o nome completo da raz\u00C3\u00A3o social (nome empresarial)'.")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Apresenta o nome fantasia da empresa.
   **/
  @ApiModelProperty(value = "Apresenta o nome fantasia da empresa.")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero do Cadastro Nacional de Pessoa Juridica (CNPJ)")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Inscri\u00C3\u00A7\u00C3\u00A3o Estadual (IE).")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.
   **/
  @ApiModelProperty(required = true, value = "Data de abertura da empresa, essa data deve ser informada no formato: aaaa-MM-dd.")
  public Date getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(Date dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * Id da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Id da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Id do produto
   **/
  @ApiModelProperty(required = true, value = "Id do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia.")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta corrente.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da conta corrente.")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Email da empresa
   **/
  @ApiModelProperty(value = "Email da empresa")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Dia vencimento
   **/
  @ApiModelProperty(required = true, value = "Dia vencimento")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * Nome que deve ser impresso no cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Nome que deve ser impresso no cart\u00C3\u00A3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta os telefones da empresa
   **/
  @ApiModelProperty(value = "Apresenta os telefones da empresa")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros
   **/
  @ApiModelProperty(required = true, value = "Pode ser informado os seguintes tipos de endere\u00C3\u00A7o: Residencial, Comercial, e Outros")
  public List<EnderecoAprovadoPersist> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersist> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista
   **/
  @ApiModelProperty(value = "Apresenta os dados dos s\u00C3\u00B3cios da empresa, caso exista")
  public List<PessoaPersist> getSocios() {
    return socios;
  }
  public void setSocios(List<PessoaPersist> socios) {
    this.socios = socios;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaPersist {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  dataAberturaEmpresa: ").append(dataAberturaEmpresa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  socios: ").append(socios).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

