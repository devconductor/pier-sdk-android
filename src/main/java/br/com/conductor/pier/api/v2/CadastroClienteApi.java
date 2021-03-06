package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AdicionalDetalheResponse;
import br.com.conductor.pier.api.v2.model.AdicionalUpdate;
import br.com.conductor.pier.api.v2.model.BeneficioResponse;
import br.com.conductor.pier.api.v2.model.BeneficioUpdate;
import br.com.conductor.pier.api.v2.model.EnderecoResponse;
import br.com.conductor.pier.api.v2.model.PessoaResponse;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import br.com.conductor.pier.api.v2.model.AtribuirAssinaturaClientePersist;
import br.com.conductor.pier.api.v2.model.IndicacaoAmigoResponse;
import br.com.conductor.pier.api.v2.model.IndicacaoAmigoUpdate;
import br.com.conductor.pier.api.v2.model.PessoaDetalhePartialUpdate;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorResponse;
import br.com.conductor.pier.api.v2.model.BeneficioPersist;
import br.com.conductor.pier.api.v2.model.IndicacaoAmigoPersist;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaPersist;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaResponse;
import br.com.conductor.pier.api.v2.model.TipoBeneficioResponse;
import br.com.conductor.pier.api.v2.model.AdicionalResponse;
import br.com.conductor.pier.api.v2.model.PageBeneficioResponse;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoEnderecoResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageIndicacaoAmigoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaDetalheResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBeneficioResponse;
import br.com.conductor.pier.api.v2.model.AdicionalContaPersist;
import br.com.conductor.pier.api.v2.model.AdicionalContaResponse;
import br.com.conductor.pier.api.v2.model.ObjetoPessoaFsicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.ObjetoPessoaFsicaAprovada;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class CadastroClienteApi {
  String basePath = "http://localhost/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Altera Adicional de uma Conta
   * Este m\u00E9todo permite que seja alterado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @param adicionalUpdate adicionalUpdate
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  alterarAdicionalConta (Long id, Long idPessoa, AdicionalUpdate adicionalUpdate) throws ApiException {
    Object postBody = adicionalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarAdicionalConta");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarAdicionalConta");
    }
    
    // verify the required parameter 'adicionalUpdate' is set
    if (adicionalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalUpdate' when calling alterarAdicionalConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Altera um benef\u00EDcio existente
   * Este recurso permite a altera\u00E7\u00E3o de um benef\u00EDcio ativo existente em uma conta
   * @param id Identificador do benef\u00EDcio
   * @param beneficioUpdate beneficioUpdate
   * @return BeneficioResponse
   */
  public BeneficioResponse  alterarBeneficio (Long id, BeneficioUpdate beneficioUpdate) throws ApiException {
    Object postBody = beneficioUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarBeneficio");
    }
    
    // verify the required parameter 'beneficioUpdate' is set
    if (beneficioUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'beneficioUpdate' when calling alterarBeneficio");
    }
    

    // create path and map variables
    String path = "/api/contas/beneficios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BeneficioResponse) ApiInvoker.deserialize(response, "", BeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza os dados de um determinado Endere\u00E7o
   * Este m\u00E9todo permite que seja alterado na base do emissor um ou mais registros ligados a um determinado Endere\u00E7o
   * @param id id
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep CEP do endere\u00E7o
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @param aplicativoAlteracao Apresenta a aplica\u00E7\u00E3o respons\u00E1vel por alterar o endere\u00E7o
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @return EnderecoResponse
   */
  public EnderecoResponse  alterarEndereco (Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao, String usuarioAlteracao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarEndereco");
    }
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza os dados de uma determinada Pessoa
   * Este m\u00E9todo permite que seja alterado na base do emissor um registro de determinada Pessoa
   * @param id ID da Pessoa
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo Tipo de Pessoa (PF ou PJ)
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   * @param cpf N\u00FAmero do CPF, quando PF
   * @param cnpj N\u00FAmero do CNPJ, quando PJ
   * @param sexo Sexo da Pessoa
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do Identidade
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da Identidade
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @param flagDeficienteVisual Flag que identifica uma pessoa como deficiente visual
   * @return PessoaResponse
   */
  public PessoaResponse  alterarPessoa (Long id, String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade, String usuarioAlteracao, Boolean flagDeficienteVisual) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarPessoa");
    }
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling alterarPessoa");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling alterarPessoa");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling alterarPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagDeficienteVisual", flagDeficienteVisual));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite que seja alterado na base do emissor os detalhes de uma determinada Pessoa
   * @param id ID da Pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param nomeReferencia1 Nome de refer\u00EAncia 1
   * @param enderecoReferencia1 Endere\u00E7o de refer\u00EAncia 1
   * @param nomeReferencia2 Nome de refer\u00EAncia 2
   * @param enderecoReferencia2 Endere\u00E7o de refer\u00EAncia 2
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @param numeroCnh N\u00FAmero da CNH da pessoa
   * @param pessoaPoliticamenteExposta Flag para identificar se a pessoa \u00E9 politicamente exposta
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @param flagNomePaiNaoInformado Flag que indica se a pessoa informou nome do pai
   * @param flagSemEnderecoComercialFixo Flag que indica se a pessoa possui endere\u00E7o comercial fixo
   * @param dataEmissaoCnh Data emiss\u00E3o CNH 
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  alterarPessoaDetalhe (Long id, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, Boolean impedidoFinanciamento, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, String numeroCnh, Boolean pessoaPoliticamenteExposta, String usuarioAlteracao, Boolean flagNomePaiNaoInformado, Boolean flagSemEnderecoComercialFixo, String dataEmissaoCnh) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarPessoaDetalhe");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCnh", numeroCnh));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pessoaPoliticamenteExposta", pessoaPoliticamenteExposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagNomePaiNaoInformado", flagNomePaiNaoInformado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSemEnderecoComercialFixo", flagSemEnderecoComercialFixo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoCnh", dataEmissaoCnh));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a altera\u00E7\u00E3o de um determinado Telefone
   * Este m\u00E9todo permite que seja alterado um determinado Telefone na base de dados do Emissor
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param ddd DDD do n\u00FAmero do telfone
   * @param telefone N\u00FAmero do telefone
   * @param ramal Ramal do telefone
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @return TelefoneResponse
   */
  public TelefoneResponse  alterarTelefone (Long id, Long idTipoTelefone, String ddd, String telefone, String ramal, String usuarioAlteracao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTelefone");
    }
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite atribuir um documento para uma Conta
   * Este m\u00E9todo permite que seja atribu\u00EDdo a uma determinada Conta um documento que esteja armazenado no PIER Cloud, informando qual o tipo do documento e o seu respectivo id
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param body C\u00F3digo de Identifica\u00E7\u00E3o do Arquivo
   * @return Object
   */
  public Object  atribuirAssinaturaCliente (Long id, AtribuirAssinaturaClientePersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirAssinaturaCliente");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling atribuirAssinaturaCliente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atribuir-assinatura-cliente".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza o endere\u00E7o de correspond\u00EAncia, para o endere\u00E7o informado
   * Este m\u00E9todo permite que o endere\u00E7o de correspond\u00EAncia de uma determinada conta, seja atualizado para o endere\u00E7o de correspond\u00EAncia informado
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @return EnderecoResponse
   */
  public EnderecoResponse  atribuirEnderecoCorrespondenciaConta (Long id, Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirEnderecoCorrespondenciaConta");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling atribuirEnderecoCorrespondenciaConta");
    }
    

    // create path and map variables
    String path = "/api/enderecos/{id}/alterar-endereco-correspondencia".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualizar indica\u00E7\u00E3o de amigos
   * Atualiza a indica\u00E7\u00E3o de amigo uma pessoa
   * @param id C\u00F3digo idenficador da pessoa
   * @param idIndicacao C\u00F3difo identificador da indica\u00E7\u00E3o
   * @param update update
   * @return IndicacaoAmigoResponse
   */
  public IndicacaoAmigoResponse  atualizarIndicacaoAmigo (Long id, Long idIndicacao, IndicacaoAmigoUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarIndicacaoAmigo");
    }
    
    // verify the required parameter 'idIndicacao' is set
    if (idIndicacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idIndicacao' when calling atualizarIndicacaoAmigo");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling atualizarIndicacaoAmigo");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}/indicacoes-amigos/{idIndicacao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idIndicacao" + "\\}", apiInvoker.escapeString(idIndicacao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (IndicacaoAmigoResponse) ApiInvoker.deserialize(response, "", IndicacaoAmigoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza\u00E7\u00E3o parcial do detalhe da pessoa
   * Este recurso permite realizar uma atualiza\u00E7\u00E3o parcial dos detalhes da pessoa
   * @param id Identificador da pessoa
   * @param pessoaDetalhePartialUpdate pessoaDetalhePartialUpdate
   * @return Object
   */
  public Object  atualizarParcialPessoaDetalhe (Long id, PessoaDetalhePartialUpdate pessoaDetalhePartialUpdate) throws ApiException {
    Object postBody = pessoaDetalhePartialUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialPessoaDetalhe");
    }
    
    // verify the required parameter 'pessoaDetalhePartialUpdate' is set
    if (pessoaDetalhePartialUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaDetalhePartialUpdate' when calling atualizarParcialPessoaDetalhe");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}/detalhes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualiza conta integrada com o emissor
   * Este recurso permite a atualiza\u00E7\u00E3o de uma conta integrada com o emissor
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param body Descri\u00E7\u00E3o do canal de entrada
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  atualizarRegistroIntegracaoConta (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarRegistroIntegracaoConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atualizar-registro-integracao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (IntegracaoEmissorResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra um benef\u00EDcio em uma conta espec\u00EDfica
   * Este recurso permite cadastrar um benef\u00EDcio de uma pessoa em uma conta espec\u00EDfica, com cardinalidade n para n
   * @param id Identificador da conta
   * @param beneficioPersist beneficioPersist
   * @return BeneficioResponse
   */
  public BeneficioResponse  cadastrarBeneficio (Long id, BeneficioPersist beneficioPersist) throws ApiException {
    Object postBody = beneficioPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarBeneficio");
    }
    
    // verify the required parameter 'beneficioPersist' is set
    if (beneficioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'beneficioPersist' when calling cadastrarBeneficio");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/beneficios".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BeneficioResponse) ApiInvoker.deserialize(response, "", BeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra uma indica\u00E7\u00E3o de amigo
   * Cadastra uma indica\u00E7\u00E3o de amigo
   * @param id C\u00F3digo idenficador da pessoa
   * @param persist persist
   * @return IndicacaoAmigoResponse
   */
  public IndicacaoAmigoResponse  cadastrarIndicacaoAmigo (Long id, IndicacaoAmigoPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarIndicacaoAmigo");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarIndicacaoAmigo");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}/indicacoes-amigos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (IndicacaoAmigoResponse) ApiInvoker.deserialize(response, "", IndicacaoAmigoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastro da recarga programada
   * Este recurso permite cadastrar uma nova recarga programada na base do emissor
   * @param persistencia persistencia
   * @return CelularRecargaProgramadaResponse
   */
  public CelularRecargaProgramadaResponse  cadastrarRecargaProgramadaCelular (CelularRecargaProgramadaPersist persistencia) throws ApiException {
    Object postBody = persistencia;
    
    // verify the required parameter 'persistencia' is set
    if (persistencia == null) {
       throw new ApiException(400, "Missing the required parameter 'persistencia' when calling cadastrarRecargaProgramadaCelular");
    }
    

    // create path and map variables
    String path = "/api/celulares/recargas-programadas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CelularRecargaProgramadaResponse) ApiInvoker.deserialize(response, "", CelularRecargaProgramadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta um benef\u00EDcio
   * Este recurso permite consultar um benef\u00EDcio espec\u00EDfico
   * @param id Identificador do benef\u00EDcio
   * @return BeneficioResponse
   */
  public BeneficioResponse  consultarBeneficio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarBeneficio");
    }
    

    // create path and map variables
    String path = "/api/contas/beneficios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BeneficioResponse) ApiInvoker.deserialize(response, "", BeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Endere\u00E7o
   * Este m\u00E9todo permite consultar um determinado Endere\u00E7o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @return EnderecoResponse
   */
  public EnderecoResponse  consultarEndereco (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEndereco");
    }
    

    // create path and map variables
    String path = "/api/enderecos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de uma determinada Pessoa
   * Este m\u00E9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor
   * @param id ID da Pessoa
   * @return PessoaResponse
   */
  public PessoaResponse  consultarPessoa (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta Adicional de uma Conta
   * Este m\u00E9todo permite que seja consultado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  consultarPessoaAdicionalDaConta (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPessoaAdicionalDaConta");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling consultarPessoaAdicionalDaConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite a consulta dos detalhes de uma Pessoa existentes na base de dados do Emissor
   * @param id ID da Pessoa
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  consultarPessoaDetalhe (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPessoaDetalhe");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Telefone
   * Este m\u00E9todo permite consultar um determinado Telefone a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @return TelefoneResponse
   */
  public TelefoneResponse  consultarTelefone (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTelefone");
    }
    

    // create path and map variables
    String path = "/api/telefones/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consulta um tipo de benef\u00EDcio
   * Este recurso permite consultar um tipo de benef\u00EDcio
   * @param id Identificador do tipo de benef\u00EDcio
   * @return TipoBeneficioResponse
   */
  public TipoBeneficioResponse  consultarTipoBeneficio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoBeneficio");
    }
    

    // create path and map variables
    String path = "/api/contas/beneficios/tipos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TipoBeneficioResponse) ApiInvoker.deserialize(response, "", TipoBeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Inativa Adicional de uma Conta
   * Este m\u00E9todo permite que seja inativado um portador Adicional de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return String
   */
  public String  inativarAdicionalConta (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling inativarAdicionalConta");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling inativarAdicionalConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}/inativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Adicionais de uma Conta
   * Este m\u00E9todo permite que sejam listados portadores Adicionais de uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return AdicionalResponse
   */
  public AdicionalResponse  listarAdicionaisConta (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarAdicionaisConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdicionalResponse) ApiInvoker.deserialize(response, "", AdicionalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os benef\u00EDcios existentes
   * Este recurso permite listar os benef\u00EDcios existentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta Identificador da conta
   * @param tipoBeneficio Tipo do benef\u00EDcio
   * @param numeroBeneficio N\u00FAmero do benef\u00EDcio
   * @param mesProvaVida M\u00EAs de prova de vida do benefici\u00E1rio
   * @param status Status do benef\u00EDcio(1 = ATIVO, 0 = INATIVO)
   * @return PageBeneficioResponse
   */
  public PageBeneficioResponse  listarBeneficios (List<String> sort, Integer page, Integer limit, Long idConta, String tipoBeneficio, String numeroBeneficio, Integer mesProvaVida, Boolean status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/beneficios".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoBeneficio", tipoBeneficio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBeneficio", numeroBeneficio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "mesProvaVida", mesProvaVida));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageBeneficioResponse) ApiInvoker.deserialize(response, "", PageBeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as contas da pessoa
   * Permite listar as contas de um pessoa a partir do seu numero na receita federal
   * @param numeroReceitaFederal N\u00FAmero de identifica\u00E7\u00E3o do cliente na Receita Federal (CPF ou CNPJ)
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse  listarContasPessoa (String numeroReceitaFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroReceitaFederal' is set
    if (numeroReceitaFederal == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas/listar-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageContaDetalheResponse) ApiInvoker.deserialize(response, "", PageContaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Endere\u00E7os cadastrados para o Emissor
   * Este m\u00E9todo permite que sejam listados os Endere\u00E7os existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep List os CEPs
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param dataInclusao Apresenta a data em que fora cadastrado o Endere\u00E7o
   * @param dataUltimaAtualizacao Data em que fora realizada a \u00FAltima mudan\u00E7a neste registro de endere\u00E7o. Quando n\u00E3o tiver ocorrido mudan\u00E7a, conter\u00E1 a mesma informa\u00E7\u00E3o que o campo dataInclusao
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @return PageEnderecoResponse
   */
  public PageEnderecoResponse  listarEnderecos (List<String> sort, Integer page, Integer limit, Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, String dataInclusao, String dataUltimaAtualizacao, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUltimaAtualizacao", dataUltimaAtualizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageEnderecoResponse) ApiInvoker.deserialize(response, "", PageEnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o hist\u00F3rico de altera\u00E7\u00E3o do endereco
   * Este m\u00E9todo permite que sejam listados o historico de altera\u00E7\u00E3o dos Endere\u00E7os existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataAlteracaoInicio Data de in\u00EDcio
   * @param dataAlteracaoFim Data fim
   * @param cpf Cpf da pessoa relacionada ao endere\u00E7o
   * @param idConta Conta relacionada ao endere\u00E7o
   * @param canalAlteracao Aplicativo Respons\u00E1vel por alterar o endere\u00E7o
   * @return PageHistoricoEnderecoResponse
   */
  public PageHistoricoEnderecoResponse  listarHistoricoEndereco (List<String> sort, Integer page, Integer limit, String dataAlteracaoInicio, String dataAlteracaoFim, String cpf, Long idConta, String canalAlteracao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/enderecos/historicos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "canalAlteracao", canalAlteracao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageHistoricoEnderecoResponse) ApiInvoker.deserialize(response, "", PageHistoricoEnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar altera\u00E7\u00F5es de telefones realizadas nos \u00FAltimos 60 dias
   * Este m\u00E9todo permite verificar quais os telefones de um determinado que cliente que sofreram altera\u00E7\u00E3o nos \u00FAltimos 60 dias
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da pessoa (id)
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse  listarHistoricoTelefonesPessoa (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefonesPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}/historico-telefones".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (HistoricoTelefoneResponse) ApiInvoker.deserialize(response, "", HistoricoTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar indica\u00E7\u00F5es de amigos
   * Lista as indica\u00E7\u00F5es de amigos uma pessoa
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param dataIndicacao Data da indica\u00E7\u00E3o
   * @param dataUtilizacao Data da utiliza\u00E7\u00E3o da indica\u00E7\u00E3o
   * @param dataValidade Data de validade da indica\u00E7\u00E3o
   * @param cpfIndicado N\u00FAmero do CPF do amigo indicado
   * @param emailIndicado Email do amigo indicado
   * @param codigoIndicacao C\u00F3digo da indica\u00E7\u00E3o
   * @param idPessoa C\u00F3digo identificador da pessoa
   * @param status Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   * @return PageIndicacaoAmigoResponse
   */
  public PageIndicacaoAmigoResponse  listarIndicacaoAmigo (List<String> sort, Integer page, Integer limit, String dataIndicacao, String dataUtilizacao, String dataValidade, String cpfIndicado, String emailIndicado, Long codigoIndicacao, Integer idPessoa, Integer status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas/indicacoes-amigos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataIndicacao", dataIndicacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUtilizacao", dataUtilizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpfIndicado", cpfIndicado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "emailIndicado", emailIndicado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoIndicacao", codigoIndicacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageIndicacaoAmigoResponse) ApiInvoker.deserialize(response, "", PageIndicacaoAmigoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as Pessoas cadastradas no Emissor
   * Este m\u00E9todo permite que sejam listadas as Pessoas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id)
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa F\u00EDsica, sendo: (&#39;PF&#39;: Pessoa F\u00EDsica), (&#39;PJ&#39;: Pessoa Jur\u00EDdica)
   * @param cpf Quando uma pessoa f\u00EDsica preencha com o CPF
   * @param cnpj Quando um pessoa jur\u00EDdica preencha o CNPJ
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ
   * @param sexo C\u00F3digo de Identifica\u00E7\u00E3o do sexo da pessoa, quando \u00E9 PF, sendo: (&#39;M&#39;: Masculino), (&#39;F&#39;: Feminino), (&#39;O&#39;: Outro), (&#39;N&#39;: N\u00E3o especificado)
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do RG
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da identidade no formato aaaa-MM-dd
   * @param flagDeficienteVisual Flag que identifica uma pessoa como deficiente visual
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listarPessoas (List<String> sort, Integer page, Integer limit, Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade, Boolean flagDeficienteVisual) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagDeficienteVisual", flagDeficienteVisual));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PagePessoaResponse) ApiInvoker.deserialize(response, "", PagePessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Detalhes das Pessoas cadastradas no Emissor
   * Este m\u00E9todo permite que sejam listadas od detalhes das Pessoas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idPessoa C\u00F3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do Banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5esde cr\u00E9dito(Lei n. 4.595/64)
   * @param numeroCnh N\u00FAmero da CNH da pessoa
   * @param patrimonioTotal Patrim\u00F4nio total da pessoa
   * @param salario Sal\u00E1rio da pessoa
   * @param nomeConjuge Nome do c\u00F4njuge da pessoa
   * @param flagNomePaiNaoInformado Flag que indica se a pessoa informou nome do pai
   * @param flagSemEnderecoComercialFixo Flag que indica se a pessoa possui endere\u00E7o comercial fixo
   * @param dataEmissaoCnh Data emiss\u00E3o CNH 
   * @return PagePessoaDetalheResponse
   */
  public PagePessoaDetalheResponse  listarPessoasDetalhes (List<String> sort, Integer page, Integer limit, Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento, String numeroCnh, BigDecimal patrimonioTotal, BigDecimal salario, String nomeConjuge, Boolean flagNomePaiNaoInformado, Boolean flagSemEnderecoComercialFixo, String dataEmissaoCnh) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCnh", numeroCnh));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "patrimonioTotal", patrimonioTotal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "salario", salario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeConjuge", nomeConjuge));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagNomePaiNaoInformado", flagNomePaiNaoInformado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSemEnderecoComercialFixo", flagSemEnderecoComercialFixo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoCnh", dataEmissaoCnh));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PagePessoaDetalheResponse) ApiInvoker.deserialize(response, "", PagePessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar s\u00F3cios de uma pessoa jur\u00EDdica
   * Lista os s\u00F3cios vinculados \u00E0 uma Pessoa Jur\u00EDdica cadastrada
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa Jur\u00EDdica
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listarSocios (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarSocios");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas/{id}/socios".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PagePessoaResponse) ApiInvoker.deserialize(response, "", PagePessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Telefones cadastrados no Emissor
   * Este m\u00E9todo permite que sejam listados os Telefones existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Telefone (id)
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) a qual o telefone pertence
   * @param ddd Telefone DDD
   * @param telefone Telefone n\u00FAmero
   * @param ramal N\u00FAmero do ramal
   * @param status Apresenta o Status do Telefone, onde: &#39;0&#39;: Inativo e &#39;1&#39;: Ativo
   * @return PageTelefoneResponse
   */
  public PageTelefoneResponse  listarTelefones (List<String> sort, Integer page, Integer limit, Long id, Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal, Integer status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTelefoneResponse) ApiInvoker.deserialize(response, "", PageTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos de benef\u00EDcios existentes
   * Este recurso permite listar os tipos de benef\u00EDcios existentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo do benef\u00EDcio
   * @return PageTipoBeneficioResponse
   */
  public PageTipoBeneficioResponse  listarTiposBeneficios (List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/beneficios/tipos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageTipoBeneficioResponse) ApiInvoker.deserialize(response, "", PageTipoBeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Desativa um benef\u00EDcio
   * Este recurso permite a desativa\u00E7\u00E3o de um benef\u00EDcio, tornando seu status = 0
   * @param id Identificador do benef\u00EDcio
   * @return BeneficioResponse
   */
  public BeneficioResponse  removerBeneficio (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling removerBeneficio");
    }
    

    // create path and map variables
    String path = "/api/contas/beneficios/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (BeneficioResponse) ApiInvoker.deserialize(response, "", BeneficioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de Adicionais para uma Conta
   * Este m\u00E9todo permite que uma pessoa existente na base possa ser um adicional na conta informada
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param adicionalContaPersist adicionalContaPersist
   * @return AdicionalContaResponse
   */
  public AdicionalContaResponse  salvarAdicionalConta (Long id, AdicionalContaPersist adicionalContaPersist) throws ApiException {
    Object postBody = adicionalContaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAdicionalConta");
    }
    
    // verify the required parameter 'adicionalContaPersist' is set
    if (adicionalContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalContaPersist' when calling salvarAdicionalConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdicionalContaResponse) ApiInvoker.deserialize(response, "", AdicionalContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo Endere\u00E7o
   * Este m\u00E9todo permite que seja cadastrado um novo Endere\u00E7o na base de dados do Emissor
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o endere\u00E7o pertence (id)
   * @param idTipoEndereco C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   * @param cep CEP do endere\u00E7o
   * @param logradouro Apresenta o nome do Logradouro
   * @param numero Apresenta o n\u00FAmero do endere\u00E7o
   * @param complemento Apresenta descri\u00E7oes complementares referente ao endere\u00E7o
   * @param pontoReferencia Apresenta a descri\u00E7\u00E3o de ponto de refer\u00EAncia do endere\u00E7o
   * @param bairro Apresenta nome do bairro
   * @param cidade Apresenta nome da cidade
   * @param uf Apresenta sigla da Unidade Federativa
   * @param pais Apresenta nome do Pa\u00EDs
   * @param tempoResidenciaAnos Apresenta a quantidade de anos em que habita na resid\u00EAncia
   * @param tempoResidenciaMeses Apresenta a quantidade de meses que habita na resid\u00EAncia
   * @param aplicativoAlteracao Apresenta a aplica\u00E7\u00E3o respons\u00E1vel por alterar o endere\u00E7o
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @return EnderecoResponse
   */
  public EnderecoResponse  salvarEndereco (Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao, String usuarioAlteracao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um nova Pessoa
   * Este m\u00E9todo permite que seja cadastrado uma nova Pessoa na base de dados do Emissor
   * @param nome Apresenta o &#39;Nome Completo da PF&#39; ou o &#39;Nome Completo da Raz\u00E3o Social (Nome Empresarial)&#39;
   * @param tipo Tipo de Pessoa (PF ou PJ)
   * @param dataNascimento Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   * @param cpf N\u00FAmero do CPF, quando PF
   * @param cnpj N\u00FAmero do CNPJ, quando PJ
   * @param sexo Sexo da Pessoa
   * @param numeroIdentidade N\u00FAmero da Identidade
   * @param orgaoExpedidorIdentidade Org\u00E3o expedidor do Identidade
   * @param unidadeFederativaIdentidade Sigla da Unidade Federativa de onde foi expedido a Identidade
   * @param dataEmissaoIdentidade Data emiss\u00E3o da Identidade
   * @param usuarioAlteracao Usu\u00E1rio respons\u00E1vel pela altera\u00E7\u00E3o
   * @param flagDeficienteVisual Flag que identifica uma pessoa como deficiente visual
   * @return PessoaResponse
   */
  public PessoaResponse  salvarPessoa (String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade, String usuarioAlteracao, Boolean flagDeficienteVisual) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling salvarPessoa");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling salvarPessoa");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling salvarPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "usuarioAlteracao", usuarioAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagDeficienteVisual", flagDeficienteVisual));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salvar os detalhes de uma determinada Pessoa
   * Este m\u00E9todo permite que seja incluido na base do emissor os detalhes de uma determinada Pessoa
   * @param idPessoa Apresenta o c\u00F3digo identificador da pessoa
   * @param nomeMae Apresenta o nome da m\u00E3e da pessoa fisica
   * @param idEstadoCivil Id Estado civil da pessoa fisica
   * @param idProfissao Profiss\u00E3o da pessoa fisica
   * @param idNaturezaOcupacao Id Natureza Ocupa\u00E7\u00E3o da pessoa fisica
   * @param idNacionalidade Id Nacionalidade da pessoa fisica
   * @param numeroBanco N\u00FAmero do banco
   * @param numeroAgencia N\u00FAmero da ag\u00EAncia
   * @param numeroContaCorrente N\u00FAmero da conta corrente
   * @param email Email da pessoa fisica
   * @param nomeEmpresa Nome que deve ser impresso no cart\u00E3o
   * @param nomeReferencia1 Nome de refer\u00EAncia 1
   * @param enderecoReferencia1 Endere\u00E7o de refer\u00EAncia 1
   * @param nomeReferencia2 Nome de refer\u00EAncia 2
   * @param enderecoReferencia2 Endere\u00E7o de refer\u00EAncia 2
   * @param naturalidadeCidade Apresenta o nome da cidade de nascimento da pessoa f\u00EDsica
   * @param naturalidadeEstado Apresenta a sigla do estado de nascimento da pessoa f\u00EDsica
   * @param grauInstrucao Apresenta o grau de instru\u00E7\u00E3o da pessoa f\u00EDsica
   * @param numeroDependentes Apresenta o n\u00FAmero de dependentes da pessoa f\u00EDsica
   * @param nomePai Apresenta o nome do pai da pessoa f\u00EDsica
   * @param chequeEspecial Indica se pessoa f\u00EDsica aderir ao cheque especial
   * @param impedidoFinanciamento Flag para s\u00F3cios do banco que s\u00E3o portadores do cart\u00E3o, mas n\u00E3o podem operar transa\u00E7\u00F5es de cr\u00E9dito(Lei n. 4.595/64)
   * @param numeroCnh N\u00FAmero da CNH da pessoa
   * @param pessoaPoliticamenteExposta Flag para identificar se a pessoa \u00E9 politicamente exposta
   * @param patrimonioTotal Patrim\u00F4nio total da pessoa
   * @param salario Sal\u00E1rio da pessoa
   * @param nomeConjuge Nome do c\u00F4njuge da pessoa
   * @param flagNomePaiNaoInformado Flag que indica se a pessoa informou nome do pai
   * @param flagSemEnderecoComercialFixo Flag que indica se a pessoa possui endere\u00E7o comercial fixo
   * @param dataEmissaoCnh Data emiss\u00E3o CNH
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  salvarPessoaDetalhe (Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento, String numeroCnh, Boolean pessoaPoliticamenteExposta, BigDecimal patrimonioTotal, BigDecimal salario, String nomeConjuge, Boolean flagNomePaiNaoInformado, Boolean flagSemEnderecoComercialFixo, String dataEmissaoCnh) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling salvarPessoaDetalhe");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCnh", numeroCnh));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pessoaPoliticamenteExposta", pessoaPoliticamenteExposta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "patrimonioTotal", patrimonioTotal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "salario", salario));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeConjuge", nomeConjuge));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagNomePaiNaoInformado", flagNomePaiNaoInformado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSemEnderecoComercialFixo", flagSemEnderecoComercialFixo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoCnh", dataEmissaoCnh));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastro de Conta e Pessoa Fisica
   * Permite realizar o cadastro de uma Conta para um cliente do tipo Pessoa F\u00EDsica, recebendo nesta opera\u00E7\u00E3o todos os dados cadastrais que se fazem necess\u00E1rios para isso. Uma vez criado, poder\u00E1 ser acionado o m\u00E9todo de &#39;Gera\u00E7\u00E3o de Cart\u00E3o&#39; para o cliente e seus adicionais
   * @param pessoaPersist pessoaPersist
   * @return ObjetoPessoaFsicaAprovadaResponse
   */
  public ObjetoPessoaFsicaAprovadaResponse  salvarPessoaFisicaAprovada (ObjetoPessoaFsicaAprovada pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaFisicaAprovada");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-fisicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ObjetoPessoaFsicaAprovadaResponse) ApiInvoker.deserialize(response, "", ObjetoPessoaFsicaAprovadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar conta de Pessoa Jur\u00EDdica
   * Realiza os procedimentos necess\u00E1rios de cria\u00E7\u00E3o de conta para pessoa jur\u00EDdica incluindo os cadastros de telefones, endere\u00E7os, limites e s\u00F3cios.
   * @param pessoaPersist pessoaPersist
   * @return PessoaJuridicaAprovadaResponse
   */
  public PessoaJuridicaAprovadaResponse  salvarPessoaJuridicaAprovada (PessoaJuridicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaJuridicaAprovada");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PessoaJuridicaAprovadaResponse) ApiInvoker.deserialize(response, "", PessoaJuridicaAprovadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Inclui a conta como registro para integra\u00E7\u00E3o
   * Este recurso permite incluir uma conta como registro para integra\u00E7\u00E3o
   * @param id idConta
   * @param body IntegracaoEmissorPersist
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  salvarRegistroIntegracaoConta (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarRegistroIntegracaoConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/incluir-registro-integracao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (IntegracaoEmissorResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Inclui registro de integra\u00E7\u00E3o
   * Este recurso permite incluir um registro de integra\u00E7\u00E3o
   * @param id Identificador da conta
   * @param integracaoEmissorPropostaPersist integracaoEmissorPropostaPersist
   * @return IntegracaoEmissorPropostaResponse
   */
  public IntegracaoEmissorPropostaResponse  salvarRegistroIntegracaoManagerConta (Long id, IntegracaoEmissorPropostaPersist integracaoEmissorPropostaPersist) throws ApiException {
    Object postBody = integracaoEmissorPropostaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarRegistroIntegracaoManagerConta");
    }
    
    // verify the required parameter 'integracaoEmissorPropostaPersist' is set
    if (integracaoEmissorPropostaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'integracaoEmissorPropostaPersist' when calling salvarRegistroIntegracaoManagerConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/registros-integracao-manager".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (IntegracaoEmissorPropostaResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorPropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de um novo Telefone
   * Este m\u00E9todo permite que seja cadastrado um novo Telefone na base de dados do Emissor
   * @param idTipoTelefone C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   * @param idPessoa C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) a qual o telefone pertence
   * @param ddd C\u00F3digo DDD do telefone (id)
   * @param telefone N\u00FAmero do telefone
   * @param ramal N\u00FAmero do ramal
   * @return TelefoneResponse
   */
  public TelefoneResponse  salvarTelefone (Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro de Adicionais para uma Conta
   * Este m\u00E9todo permite que sejam cadastrados um portador Adicional para uma determinada Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param persist persist
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  vincularAdicionalConta (Long id, AdicionalPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling vincularAdicionalConta");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling vincularAdicionalConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/cadastrar-adicional".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
