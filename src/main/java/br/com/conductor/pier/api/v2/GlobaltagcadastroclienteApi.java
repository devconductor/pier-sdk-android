package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AdicionalDetalheResponse;
import br.com.conductor.pier.api.v2.model.AdicionalUpdate;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PessoaResponse;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import br.com.conductor.pier.api.v2.model.EnderecoResponse;
import br.com.conductor.pier.api.v2.model.AtribuirAssinaturaClientePersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorResponse;
import br.com.conductor.pier.api.v2.model.AdicionalContaPersist;
import br.com.conductor.pier.api.v2.model.AdicionalContaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalPersist;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalResponse;
import br.com.conductor.pier.api.v2.model.PageEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PessoaFisicaAprovadaPersistValue;
import br.com.conductor.pier.api.v2.model.PessoaFisicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagcadastroclienteApi {
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
   * {{{adicional_resource_alterar}}}
   * {{{adicional_resource_alterar_notes}}}
   * @param id {{{adicional_resource_alterar_param_id_conta}}}
   * @param idPessoa {{{adicional_resource_alterar_param_id_pessoa}}}
   * @param adicionalUpdate adicionalUpdate
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  alterarUsingPUT (Long id, Long idPessoa, AdicionalUpdate adicionalUpdate) throws ApiException {
    Object postBody = adicionalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterarUsingPUT");
    }
    
    // verify the required parameter 'adicionalUpdate' is set
    if (adicionalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalUpdate' when calling alterarUsingPUT");
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
   * {{{pessoa_detalhe_resource_alterar}}}
   * {{{pessoa_detalhe_resource_alterar_notes}}}
   * @param id {{{pessoa_detalhe_resource_alterar_param_id}}}
   * @param nomeMae {{{pessoa_detalhe_update_nome_mae_value}}}
   * @param idEstadoCivil {{{pessoa_detalhe_update_id_estado_civil_value}}}
   * @param idProfissao {{{pessoa_detalhe_update_id_profissao_value}}}
   * @param idNaturezaOcupacao {{{pessoa_detalhe_update_id_natureza_ocupacao_value}}}
   * @param idNacionalidade {{{pessoa_detalhe_update_id_nacionalidade_value}}}
   * @param numeroBanco {{{pessoa_detalhe_update_numero_banco_value}}}
   * @param numeroAgencia {{{pessoa_detalhe_update_numero_agencia_value}}}
   * @param numeroContaCorrente {{{pessoa_detalhe_update_numero_conta_corrente_value}}}
   * @param email {{{pessoa_detalhe_update_email_value}}}
   * @param nomeEmpresa {{{pessoa_detalhe_update_nome_empresa_value}}}
   * @param nomeReferencia1 {{{pessoa_detalhe_update_nome_referencia_1_value}}}
   * @param enderecoReferencia1 {{{pessoa_detalhe_update_endereco_referencia_1_value}}}
   * @param nomeReferencia2 {{{pessoa_detalhe_update_nome_referencia_2_value}}}
   * @param enderecoReferencia2 {{{pessoa_detalhe_update_endereco_referencia_2_value}}}
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  alterarUsingPUT12 (Long id, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT12");
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
   * {{{pessoa_resource_alterar}}}
   * {{{pessoa_resource_alterar_notes}}}
   * @param id {{{pessoa_resource_alterar_param_id}}}
   * @param nome {{{pessoa_persist_nome_value}}}
   * @param tipo {{{pessoa_persist_tipo_value}}}
   * @param dataNascimento {{{pessoa_persist_data_nascimento_value}}}
   * @param cpf {{{pessoa_persist_cpf_value}}}
   * @param cnpj {{{pessoa_persist_cnpj_value}}}
   * @param sexo {{{pessoa_persist_sexo_value}}}
   * @param numeroIdentidade {{{pessoa_persist_numero_identidade_value}}}
   * @param orgaoExpedidorIdentidade {{{pessoa_persist_orgao_expedidor_identidade_value}}}
   * @param unidadeFederativaIdentidade {{{pessoa_persist_unidade_federativa_identidade_value}}}
   * @param dataEmissaoIdentidade {{{pessoa_persist_data_emissao_identidade_value}}}
   * @return PessoaResponse
   */
  public PessoaResponse  alterarUsingPUT13 (Long id, String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT13");
    }
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling alterarUsingPUT13");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling alterarUsingPUT13");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling alterarUsingPUT13");
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
   * {{{telefone_resource_alterar}}}
   * {{{telefone_resource_alterar_notes}}}
   * @param id {{{telefone_alterar_persist_id_value}}}
   * @param idTipoTelefone {{{telefone_alterar_persist_id_tipo_telefone_value}}}
   * @param ddd {{{telefone_alterar_persist_ddd_value}}}
   * @param telefone {{{telefone_alterar_persist_telefone_value}}}
   * @param ramal {{{telefone_alterar_persist_ramal_value}}}
   * @return TelefoneResponse
   */
  public TelefoneResponse  alterarUsingPUT15 (Long id, Long idTipoTelefone, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT15");
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
   * {{{endereco_resource_alterar}}}
   * {{{endereco_resource_alterar_notes}}}
   * @param id id
   * @param idPessoa {{{endereco_persist_id_pessoa_value}}}
   * @param idTipoEndereco {{{endereco_persist_id_tipo_endereco_value}}}
   * @param cep {{{endereco_persist_cep_value}}}
   * @param logradouro {{{endereco_persist_logradouro_value}}}
   * @param numero {{{endereco_persist_numero_value}}}
   * @param complemento {{{endereco_persist_complemento_value}}}
   * @param pontoReferencia {{{endereco_persist_ponto_referencia_value}}}
   * @param bairro {{{endereco_persist_bairro_value}}}
   * @param cidade {{{endereco_persist_cidade_value}}}
   * @param uf {{{endereco_persist_uf_value}}}
   * @param pais {{{endereco_persist_pais_value}}}
   * @return EnderecoResponse
   */
  public EnderecoResponse  alterarUsingPUT4 (Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarUsingPUT4");
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
   * {{{conta_pessoa_resource_atribuir_assinatura_cliente}}}
   * {{{conta_pessoa_resource_atribuir_assinatura_cliente_notes}}}
   * @param id {{{conta_pessoa_resource_atribuir_assinatura_cliente_param_id}}}
   * @param body {{{conta_pessoa_resource_atribuir_assinatura_cliente_param_body}}}
   * @return Object
   */
  public Object  atribuirAssinaturaClienteUsingPOST (Long id, AtribuirAssinaturaClientePersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirAssinaturaClienteUsingPOST");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling atribuirAssinaturaClienteUsingPOST");
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
   * {{{endereco_resource_atualizar_correspondencia}}}
   * {{{endereco_resource_atualizar_correspondencia_notes}}}
   * @param id {{{endereco_resource_atualizar_correspondencia_param_id}}}
   * @param idConta {{{endereco_resource_atualizar_correspondencia_param_idConta}}}
   * @return EnderecoResponse
   */
  public EnderecoResponse  atualizarEnderecoDeCorrespondenciaUsingPUT (Long id, Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarEnderecoDeCorrespondenciaUsingPUT");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling atualizarEnderecoDeCorrespondenciaUsingPUT");
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
   * {{{integracao_emissor_resource_atualizar}}}
   * {{{integracao_emissor_resource_atualizar_notes}}}
   * @param id {{{integracao_emissor_resource_atualizar_param_id_conta}}}
   * @param body {{{integracao_emissor_resource_atualizar_param_body}}}
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  atualizarUsingPOST (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarUsingPOST");
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
   * {{{adicional_resource_cadastrar_adicional}}}
   * {{{adicional_resource_cadastrar_adicional_notes}}}
   * @param id {{{adicional_resource_cadastrar_adicional_param_id_conta}}}
   * @param adicionalContaPersist adicionalContaPersist
   * @return AdicionalContaResponse
   */
  public AdicionalContaResponse  cadastrarAdicionalUsingPOST (Long id, AdicionalContaPersist adicionalContaPersist) throws ApiException {
    Object postBody = adicionalContaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAdicionalUsingPOST");
    }
    
    // verify the required parameter 'adicionalContaPersist' is set
    if (adicionalContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalContaPersist' when calling cadastrarAdicionalUsingPOST");
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
   * {{{adicional_resource_cadastrar}}}
   * {{{adicional_resource_cadastrar_notes}}}
   * @param id {{{adicional_resource_cadastrar_param_id_conta}}}
   * @param persist persist
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  cadastrarUsingPOST1 (Long id, AdicionalPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarUsingPOST1");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrarUsingPOST1");
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
  
  /**
   * {{{endereco_resource_consultar}}}
   * {{{endereco_resource_consultar_notes}}}
   * @param id {{{endereco_resource_consultar_param_id}}}
   * @return EnderecoResponse
   */
  public EnderecoResponse  consultarUsingGET17 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET17");
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
   * {{{adicional_resource_consultar}}}
   * {{{adicional_resource_consultar_notes}}}
   * @param id {{{adicional_resource_consultar_param_id_conta}}}
   * @param idPessoa {{{adicional_resource_consultar_param_id_pessoa}}}
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  consultarUsingGET2 (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET2");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling consultarUsingGET2");
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
   * {{{pessoa_detalhe_resource_consultar}}}
   * {{{pessoa_detalhe_resource_consultar_notes}}}
   * @param id {{{pessoa_detalhe_resource_consultar_param_id}}}
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  consultarUsingGET26 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET26");
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
   * {{{pessoa_resource_consultar}}}
   * {{{pessoa_resource_consultar_notes}}}
   * @param id {{{pessoa_resource_consultar_param_id}}}
   * @return PessoaResponse
   */
  public PessoaResponse  consultarUsingGET27 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET27");
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
   * {{{telefone_resource_consultar}}}
   * {{{telefone_resource_consultar_notes}}}
   * @param id {{{telefone_resource_consultar_param_id}}}
   * @return TelefoneResponse
   */
  public TelefoneResponse  consultarUsingGET35 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET35");
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
   * {{{adicional_resource_inativar}}}
   * {{{adicional_resource_inativar_notes}}}
   * @param id {{{adicional_resource_inativar_param_id_conta}}}
   * @param idPessoa {{{adicional_resource_inativar_param_id_pessoa}}}
   * @return String
   */
  public String  inativarUsingPOST (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling inativarUsingPOST");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling inativarUsingPOST");
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
   * {{{pessoa_resource_listar_contas_por_pessoa}}}
   * {{{pessoa_resource_listar_contas_por_pessoa_notes}}}
   * @param numeroReceitaFederal {{{pessoa_resource_listar_contas_por_pessoa_param_numero_receita_federal}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse  listarContasPorPessoaUsingGET (String numeroReceitaFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroReceitaFederal' is set
    if (numeroReceitaFederal == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPorPessoaUsingGET");
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
   * {{{pessoa_resource_listar_historico_telefones}}}
   * {{{pessoa_resource_listar_historico_telefones_notes}}}
   * @param id {{{pessoa_resource_listar_historico_telefones_param_id_pessoa}}}
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse  listarHistoricoTelefonesUsingGET (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefonesUsingGET");
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
   * {{{conta_pessoa_resource_listar_socios}}}
   * {{{conta_pessoa_resource_listar_socios_notes}}}
   * @param id {{{conta_pessoa_resource_listar_socios_param_id}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listarSociosUsingGET (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarSociosUsingGET");
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
   * {{{adicional_resource_listar}}}
   * {{{adicional_resource_listar_notes}}}
   * @param id {{{adicional_resource_listar_param_id_conta}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return AdicionalResponse
   */
  public AdicionalResponse  listarUsingGET1 (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarUsingGET1");
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
   * {{{endereco_resource_listar}}}
   * {{{endereco_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{endereco_request_id_value}}}
   * @param idPessoa {{{endereco_request_id_pessoa_value}}}
   * @param idTipoEndereco {{{endereco_request_id_tipo_endereco_value}}}
   * @param cep {{{endereco_request_cep_value}}}
   * @param logradouro {{{endereco_request_logradouro_value}}}
   * @param numero {{{endereco_request_numero_value}}}
   * @param complemento {{{endereco_request_complemento_value}}}
   * @param pontoReferencia {{{endereco_request_ponto_referencia_value}}}
   * @param bairro {{{endereco_request_bairro_value}}}
   * @param cidade {{{endereco_request_cidade_value}}}
   * @param uf {{{endereco_request_uf_value}}}
   * @param pais {{{endereco_request_pais_value}}}
   * @param dataInclusao {{{endereco_request_data_inclusao_value}}}
   * @param dataUltimaAtualizacao {{{endereco_request_data_ultima_atualizacao_value}}}
   * @return PageEnderecoResponse
   */
  public PageEnderecoResponse  listarUsingGET21 (List<String> sort, Integer page, Integer limit, Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, String dataInclusao, String dataUltimaAtualizacao) throws ApiException {
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
   * {{{pessoa_detalhe_resource_listar}}}
   * {{{pessoa_detalhe_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idPessoa {{{pessoa_detalhe_request_id_pessoa_value}}}
   * @param nomeMae {{{pessoa_detalhe_request_nome_mae_value}}}
   * @param idEstadoCivil {{{pessoa_detalhe_request_id_estado_civil_value}}}
   * @param idProfissao {{{pessoa_detalhe_request_id_profissao_value}}}
   * @param idNaturezaOcupacao {{{pessoa_detalhe_request_id_natureza_ocupacao_value}}}
   * @param idNacionalidade {{{pessoa_detalhe_request_id_nacionalidade_value}}}
   * @param numeroBanco {{{pessoa_detalhe_request_numero_banco_value}}}
   * @param numeroAgencia {{{pessoa_detalhe_request_numero_agencia_value}}}
   * @param numeroContaCorrente {{{pessoa_detalhe_request_numero_conta_corrente_value}}}
   * @param email {{{pessoa_detalhe_request_email_value}}}
   * @param nomeEmpresa {{{pessoa_detalhe_request_nome_empresa_value}}}
   * @return PagePessoaDetalheResponse
   */
  public PagePessoaDetalheResponse  listarUsingGET32 (List<String> sort, Integer page, Integer limit, Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa) throws ApiException {
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
   * {{{pessoa_resource_listar}}}
   * {{{pessoa_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{pessoa_request_id_value}}}
   * @param nome {{{pessoa_request_nome_value}}}
   * @param tipo {{{pessoa_request_tipo_value}}}
   * @param cpf {{{pessoa_request_cpf_value}}}
   * @param cnpj {{{pessoa_request_cnpj_value}}}
   * @param dataNascimento {{{pessoa_request_data_nascimento_value}}}
   * @param sexo {{{pessoa_request_sexo_value}}}
   * @param numeroIdentidade {{{pessoa_request_numero_identidade_value}}}
   * @param orgaoExpedidorIdentidade {{{pessoa_request_orgao_expedidor_identidade_value}}}
   * @param unidadeFederativaIdentidade {{{pessoa_request_unidade_federativa_identidade_value}}}
   * @param dataEmissaoIdentidade {{{pessoa_request_data_emissao_identidade_value}}}
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listarUsingGET33 (List<String> sort, Integer page, Integer limit, Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
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
   * {{{telefone_resource_listar}}}
   * {{{telefone_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{telefone_request_id_value}}}
   * @param idTipoTelefone {{{telefone_request_id_tipo_telefone_value}}}
   * @param idPessoa {{{telefone_request_id_pessoa_value}}}
   * @param ddd {{{telefone_request_ddd_value}}}
   * @param telefone {{{telefone_request_telefone_value}}}
   * @param ramal {{{telefone_request_ramal_value}}}
   * @param status {{{telefone_request_status_value}}}
   * @return PageTelefoneResponse
   */
  public PageTelefoneResponse  listarUsingGET45 (List<String> sort, Integer page, Integer limit, Long id, Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal, Integer status) throws ApiException {
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
   * {{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada}}}
   * {{{conta_pessoa_resource_salvar_pessoa_fisica_aprovada_notes}}}
   * @param pessoaPersist pessoaPersist
   * @return PessoaFisicaAprovadaResponse
   */
  public PessoaFisicaAprovadaResponse  salvarPessoaFisicaAprovadaUsingPOST (PessoaFisicaAprovadaPersistValue pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaFisicaAprovadaUsingPOST");
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
        return (PessoaFisicaAprovadaResponse) ApiInvoker.deserialize(response, "", PessoaFisicaAprovadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada}}}
   * {{{conta_pessoa_resource_salvar_pessoa_juridica_aprovada_notes}}}
   * @param pessoaPersist pessoaPersist
   * @return PessoaJuridicaAprovadaResponse
   */
  public PessoaJuridicaAprovadaResponse  salvarPessoaJuridicaAprovadaUsingPOST (PessoaJuridicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaJuridicaAprovadaUsingPOST");
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
   * {{{endereco_resource_salvar}}}
   * {{{endereco_resource_salvar_notes}}}
   * @param idPessoa {{{endereco_persist_id_pessoa_value}}}
   * @param idTipoEndereco {{{endereco_persist_id_tipo_endereco_value}}}
   * @param cep {{{endereco_persist_cep_value}}}
   * @param logradouro {{{endereco_persist_logradouro_value}}}
   * @param numero {{{endereco_persist_numero_value}}}
   * @param complemento {{{endereco_persist_complemento_value}}}
   * @param pontoReferencia {{{endereco_persist_ponto_referencia_value}}}
   * @param bairro {{{endereco_persist_bairro_value}}}
   * @param cidade {{{endereco_persist_cidade_value}}}
   * @param uf {{{endereco_persist_uf_value}}}
   * @param pais {{{endereco_persist_pais_value}}}
   * @return EnderecoResponse
   */
  public EnderecoResponse  salvarUsingPOST12 (Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais) throws ApiException {
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
   * {{{integracao_emissor_resource_salvar}}}
   * {{{integracao_emissor_resource_salvar_notes}}}
   * @param id {{{integracao_emissor_resource_salvar_param_id_conta}}}
   * @param body {{{integracao_emissor_resource_salvar_param_body}}}
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  salvarUsingPOST15 (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarUsingPOST15");
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
   * {{{pessoa_detalhe_resource_salvar}}}
   * {{{pessoa_detalhe_resource_salvar_notes}}}
   * @param idPessoa {{{pessoa_detalhe_persist_id_pessoa_value}}}
   * @param nomeMae {{{pessoa_detalhe_persist_nome_mae_value}}}
   * @param idEstadoCivil {{{pessoa_detalhe_persist_id_estado_civil_value}}}
   * @param idProfissao {{{pessoa_detalhe_persist_id_profissao_value}}}
   * @param idNaturezaOcupacao {{{pessoa_detalhe_persist_id_natureza_ocupacao_value}}}
   * @param idNacionalidade {{{pessoa_detalhe_persist_id_nacionalidade_value}}}
   * @param numeroBanco {{{pessoa_detalhe_persist_numero_banco_value}}}
   * @param numeroAgencia {{{pessoa_detalhe_persist_numero_agencia_value}}}
   * @param numeroContaCorrente {{{pessoa_detalhe_persist_numero_conta_corrente_value}}}
   * @param email {{{pessoa_detalhe_persist_email_value}}}
   * @param nomeEmpresa {{{pessoa_detalhe_persist_nome_empresa_value}}}
   * @param nomeReferencia1 {{{pessoa_detalhe_persist_nome_referencia_1_value}}}
   * @param enderecoReferencia1 {{{pessoa_detalhe_persist_endereco_referencia_1_value}}}
   * @param nomeReferencia2 {{{pessoa_detalhe_persist_nome_referencia_2_value}}}
   * @param enderecoReferencia2 {{{pessoa_detalhe_persist_endereco_referencia_2_value}}}
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  salvarUsingPOST20 (Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling salvarUsingPOST20");
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
   * {{{pessoa_resource_salvar}}}
   * {{{pessoa_resource_salvar_notes}}}
   * @param nome {{{pessoa_persist_nome_value}}}
   * @param tipo {{{pessoa_persist_tipo_value}}}
   * @param dataNascimento {{{pessoa_persist_data_nascimento_value}}}
   * @param cpf {{{pessoa_persist_cpf_value}}}
   * @param cnpj {{{pessoa_persist_cnpj_value}}}
   * @param sexo {{{pessoa_persist_sexo_value}}}
   * @param numeroIdentidade {{{pessoa_persist_numero_identidade_value}}}
   * @param orgaoExpedidorIdentidade {{{pessoa_persist_orgao_expedidor_identidade_value}}}
   * @param unidadeFederativaIdentidade {{{pessoa_persist_unidade_federativa_identidade_value}}}
   * @param dataEmissaoIdentidade {{{pessoa_persist_data_emissao_identidade_value}}}
   * @return PessoaResponse
   */
  public PessoaResponse  salvarUsingPOST21 (String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling salvarUsingPOST21");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling salvarUsingPOST21");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling salvarUsingPOST21");
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
   * {{{telefone_resource_salvar}}}
   * {{{telefone_resource_salvar_notes}}}
   * @param idTipoTelefone {{{telefone_persist_id_tipo_telefone_value}}}
   * @param idPessoa {{{telefone_persist_id_pessoa_value}}}
   * @param ddd {{{telefone_persist_ddd_value}}}
   * @param telefone {{{telefone_persist_telefone_value}}}
   * @param ramal {{{telefone_persist_ramal_value}}}
   * @return TelefoneResponse
   */
  public TelefoneResponse  salvarUsingPOST24 (Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal) throws ApiException {
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
  
}