/*
 * Stardust API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2023-02-22T22:32:07Z
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package gg.stardust.coresdk.apis;

import gg.stardust.coresdk.ApiCallback;
import gg.stardust.coresdk.ApiClient;
import gg.stardust.coresdk.ApiException;
import gg.stardust.coresdk.ApiResponse;
import gg.stardust.coresdk.Configuration;
import gg.stardust.coresdk.Pair;
import gg.stardust.coresdk.ProgressRequestBody;
import gg.stardust.coresdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import gg.stardust.coresdk.models.Empty;
import gg.stardust.coresdk.models.Error;
import gg.stardust.coresdk.models.SDTokenBurnRequest;
import gg.stardust.coresdk.models.SDTokenGetResponses;
import gg.stardust.coresdk.models.SDTokenMintBulkRequest;
import gg.stardust.coresdk.models.SDTokenMintBulkResponses;
import gg.stardust.coresdk.models.SDTokenMutateRequest;
import gg.stardust.coresdk.models.SDTokenTransferRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokenEndpointsApi {
    private ApiClient apiClient;

    public TokenEndpointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenEndpointsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tokenBurnPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenBurnPostCall(SDTokenBurnRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/token/burn";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenBurnPostValidateBeforeCall(SDTokenBurnRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenBurnPost(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenBurnPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Burn Token
     * Burns token on-chain. Cannot be reversed.
     * @param body  (required)
     * @return Empty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Empty tokenBurnPost(SDTokenBurnRequest body) throws ApiException {
        ApiResponse<Empty> resp = tokenBurnPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Burn Token
     * Burns token on-chain. Cannot be reversed.
     * @param body  (required)
     * @return ApiResponse&lt;Empty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Empty> tokenBurnPostWithHttpInfo(SDTokenBurnRequest body) throws ApiException {
        com.squareup.okhttp.Call call = tokenBurnPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Burn Token (asynchronously)
     * Burns token on-chain. Cannot be reversed.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenBurnPostAsync(SDTokenBurnRequest body, final ApiCallback<Empty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenBurnPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenGetGet
     * @param tokenIds Stringify Array of token ids (ex. &#x27;[3589, 3580]&#x27;) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenGetGetCall(String tokenIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/token/get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tokenIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tokenIds", tokenIds));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenGetGetValidateBeforeCall(String tokenIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'tokenIds' is set
        if (tokenIds == null) {
            throw new ApiException("Missing the required parameter 'tokenIds' when calling tokenGetGet(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenGetGetCall(tokenIds, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Token
     * Some of the details of this token are based upon the Template that it was created from (using token/mint)
     * @param tokenIds Stringify Array of token ids (ex. &#x27;[3589, 3580]&#x27;) (required)
     * @return SDTokenGetResponses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SDTokenGetResponses tokenGetGet(String tokenIds) throws ApiException {
        ApiResponse<SDTokenGetResponses> resp = tokenGetGetWithHttpInfo(tokenIds);
        return resp.getData();
    }

    /**
     * Get Token
     * Some of the details of this token are based upon the Template that it was created from (using token/mint)
     * @param tokenIds Stringify Array of token ids (ex. &#x27;[3589, 3580]&#x27;) (required)
     * @return ApiResponse&lt;SDTokenGetResponses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SDTokenGetResponses> tokenGetGetWithHttpInfo(String tokenIds) throws ApiException {
        com.squareup.okhttp.Call call = tokenGetGetValidateBeforeCall(tokenIds, null, null);
        Type localVarReturnType = new TypeToken<SDTokenGetResponses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Token (asynchronously)
     * Some of the details of this token are based upon the Template that it was created from (using token/mint)
     * @param tokenIds Stringify Array of token ids (ex. &#x27;[3589, 3580]&#x27;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenGetGetAsync(String tokenIds, final ApiCallback<SDTokenGetResponses> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenGetGetValidateBeforeCall(tokenIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SDTokenGetResponses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenMintBulkPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenMintBulkPostCall(SDTokenMintBulkRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/token/mint-bulk";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenMintBulkPostValidateBeforeCall(SDTokenMintBulkRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenMintBulkPost(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenMintBulkPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Mint Tokens
     * Mint tokens to a player.
     * @param body  (required)
     * @return SDTokenMintBulkResponses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SDTokenMintBulkResponses tokenMintBulkPost(SDTokenMintBulkRequest body) throws ApiException {
        ApiResponse<SDTokenMintBulkResponses> resp = tokenMintBulkPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Mint Tokens
     * Mint tokens to a player.
     * @param body  (required)
     * @return ApiResponse&lt;SDTokenMintBulkResponses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SDTokenMintBulkResponses> tokenMintBulkPostWithHttpInfo(SDTokenMintBulkRequest body) throws ApiException {
        com.squareup.okhttp.Call call = tokenMintBulkPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SDTokenMintBulkResponses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mint Tokens (asynchronously)
     * Mint tokens to a player.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenMintBulkPostAsync(SDTokenMintBulkRequest body, final ApiCallback<SDTokenMintBulkResponses> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenMintBulkPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SDTokenMintBulkResponses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenMutatePut
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenMutatePutCall(SDTokenMutateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/token/mutate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenMutatePutValidateBeforeCall(SDTokenMutateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenMutatePut(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenMutatePutCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Mutate Token
     * Mutates a Property of a Token
     * @param body  (required)
     * @return Empty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Empty tokenMutatePut(SDTokenMutateRequest body) throws ApiException {
        ApiResponse<Empty> resp = tokenMutatePutWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Mutate Token
     * Mutates a Property of a Token
     * @param body  (required)
     * @return ApiResponse&lt;Empty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Empty> tokenMutatePutWithHttpInfo(SDTokenMutateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = tokenMutatePutValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mutate Token (asynchronously)
     * Mutates a Property of a Token
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenMutatePutAsync(SDTokenMutateRequest body, final ApiCallback<Empty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenMutatePutValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenPropsRemoveDelete
     * @param tokenId Token Id returned from token/create (ex. 5) (required)
     * @param props Stringify Array of token mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenPropsRemoveDeleteCall(String tokenId, String props, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/token/props-remove";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tokenId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tokenId", tokenId));
        if (props != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("props", props));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenPropsRemoveDeleteValidateBeforeCall(String tokenId, String props, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new ApiException("Missing the required parameter 'tokenId' when calling tokenPropsRemoveDelete(Async)");
        }
        // verify the required parameter 'props' is set
        if (props == null) {
            throw new ApiException("Missing the required parameter 'props' when calling tokenPropsRemoveDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenPropsRemoveDeleteCall(tokenId, props, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Remove Token Property
     * Removes a Tokens Property from Your Game
     * @param tokenId Token Id returned from token/create (ex. 5) (required)
     * @param props Stringify Array of token mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } (required)
     * @return Empty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Empty tokenPropsRemoveDelete(String tokenId, String props) throws ApiException {
        ApiResponse<Empty> resp = tokenPropsRemoveDeleteWithHttpInfo(tokenId, props);
        return resp.getData();
    }

    /**
     * Remove Token Property
     * Removes a Tokens Property from Your Game
     * @param tokenId Token Id returned from token/create (ex. 5) (required)
     * @param props Stringify Array of token mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } (required)
     * @return ApiResponse&lt;Empty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Empty> tokenPropsRemoveDeleteWithHttpInfo(String tokenId, String props) throws ApiException {
        com.squareup.okhttp.Call call = tokenPropsRemoveDeleteValidateBeforeCall(tokenId, props, null, null);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Remove Token Property (asynchronously)
     * Removes a Tokens Property from Your Game
     * @param tokenId Token Id returned from token/create (ex. 5) (required)
     * @param props Stringify Array of token mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenPropsRemoveDeleteAsync(String tokenId, String props, final ApiCallback<Empty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenPropsRemoveDeleteValidateBeforeCall(tokenId, props, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tokenTransferPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tokenTransferPostCall(SDTokenTransferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/token/transfer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tokenTransferPostValidateBeforeCall(SDTokenTransferRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tokenTransferPost(Async)");
        }
        
        com.squareup.okhttp.Call call = tokenTransferPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Transfer Tokens
     * Use this Endpoint to Facilitate Moving Tokens from one Player to Another
     * @param body  (required)
     * @return Empty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Empty tokenTransferPost(SDTokenTransferRequest body) throws ApiException {
        ApiResponse<Empty> resp = tokenTransferPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Transfer Tokens
     * Use this Endpoint to Facilitate Moving Tokens from one Player to Another
     * @param body  (required)
     * @return ApiResponse&lt;Empty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Empty> tokenTransferPostWithHttpInfo(SDTokenTransferRequest body) throws ApiException {
        com.squareup.okhttp.Call call = tokenTransferPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Transfer Tokens (asynchronously)
     * Use this Endpoint to Facilitate Moving Tokens from one Player to Another
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tokenTransferPostAsync(SDTokenTransferRequest body, final ApiCallback<Empty> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tokenTransferPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Empty>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
