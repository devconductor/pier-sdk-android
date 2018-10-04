package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PageCodigoChargebackResponse;
import br.com.conductor.pier.api.v2.model.PageGrupoChargebackResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltaggrupochagebackApi {
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
   * {{{codigo_chargeback_resource_listar}}}
   * {{{codigo_chargeback_resource_listar_notes}}}
   * @param grupoChargebackId grupoChargebackId
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id 
   * @param descricao 
   * @param flagAtm 
   * @param grupoChargebackId2 
   * @return PageCodigoChargebackResponse
   */
  public PageCodigoChargebackResponse  listarCodigosUsingGET (Long grupoChargebackId, List<String> sort, Integer page, Integer limit, Long id, String descricao, Boolean flagAtm, Long grupoChargebackId2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'grupoChargebackId' is set
    if (grupoChargebackId == null) {
       throw new ApiException(400, "Missing the required parameter 'grupoChargebackId' when calling listarCodigosUsingGET");
    }
    

    // create path and map variables
    String path = "/api/grupos-chargeback/{grupoChargebackId}/codigos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "grupoChargebackId" + "\\}", apiInvoker.escapeString(grupoChargebackId.toString()));

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtm", flagAtm));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grupoChargebackId", grupoChargebackId2));
    

    

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
        return (PageCodigoChargebackResponse) ApiInvoker.deserialize(response, "", PageCodigoChargebackResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{grupo_chargeback_resource_listar}}}
   * {{{grupo_chargeback_resource_listar_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @return PageGrupoChargebackResponse
   */
  public PageGrupoChargebackResponse  listarUsingGET24 (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/grupos-chargeback".replaceAll("\\{format\\}","json");

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
        return (PageGrupoChargebackResponse) ApiInvoker.deserialize(response, "", PageGrupoChargebackResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}