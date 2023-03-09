# TokenEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenBurnPost**](TokenEndpointsApi.md#tokenBurnPost) | **POST** /token/burn | Burn Token
[**tokenGetGet**](TokenEndpointsApi.md#tokenGetGet) | **GET** /token/get | Get Token
[**tokenMintBulkPost**](TokenEndpointsApi.md#tokenMintBulkPost) | **POST** /token/mint-bulk | Mint Tokens
[**tokenMutatePut**](TokenEndpointsApi.md#tokenMutatePut) | **PUT** /token/mutate | Mutate Token
[**tokenPropsRemoveDelete**](TokenEndpointsApi.md#tokenPropsRemoveDelete) | **DELETE** /token/props-remove | Remove Token Property
[**tokenTransferPost**](TokenEndpointsApi.md#tokenTransferPost) | **POST** /token/transfer | Transfer Tokens

<a name="tokenBurnPost"></a>
# **tokenBurnPost**
> Empty tokenBurnPost(body)

Burn Token

Burns token on-chain. Cannot be reversed.

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
SDTokenBurnRequest body = new SDTokenBurnRequest(); // SDTokenBurnRequest | 
try {
    Empty result = apiInstance.tokenBurnPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenBurnPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTokenBurnRequest**](SDTokenBurnRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenGetGet"></a>
# **tokenGetGet**
> SDTokenGetResponses tokenGetGet(tokenIds)

Get Token

Some of the details of this token are based upon the Template that it was created from (using token/mint)

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
String tokenIds = "tokenIds_example"; // String | Stringify Array of token ids (ex. '[3589, 3580]')
try {
    SDTokenGetResponses result = apiInstance.tokenGetGet(tokenIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenIds** | **String**| Stringify Array of token ids (ex. &#x27;[3589, 3580]&#x27;) |

### Return type

[**SDTokenGetResponses**](SDTokenGetResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tokenMintBulkPost"></a>
# **tokenMintBulkPost**
> SDTokenMintBulkResponses tokenMintBulkPost(body)

Mint Tokens

Mint tokens to a player.

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
SDTokenMintBulkRequest body = new SDTokenMintBulkRequest(); // SDTokenMintBulkRequest | 
try {
    SDTokenMintBulkResponses result = apiInstance.tokenMintBulkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenMintBulkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTokenMintBulkRequest**](SDTokenMintBulkRequest.md)|  |

### Return type

[**SDTokenMintBulkResponses**](SDTokenMintBulkResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenMutatePut"></a>
# **tokenMutatePut**
> Empty tokenMutatePut(body)

Mutate Token

Mutates a Property of a Token

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
SDTokenMutateRequest body = new SDTokenMutateRequest(); // SDTokenMutateRequest | 
try {
    Empty result = apiInstance.tokenMutatePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenMutatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTokenMutateRequest**](SDTokenMutateRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tokenPropsRemoveDelete"></a>
# **tokenPropsRemoveDelete**
> Empty tokenPropsRemoveDelete(tokenId, props)

Remove Token Property

Removes a Tokens Property from Your Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
String tokenId = "tokenId_example"; // String | Token Id returned from token/create (ex. 5)
String props = "props_example"; // String | Stringify Array of token mutable property names ex: '[\"exp\", \"health\"]' }
try {
    Empty result = apiInstance.tokenPropsRemoveDelete(tokenId, props);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenPropsRemoveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **String**| Token Id returned from token/create (ex. 5) |
 **props** | **String**| Stringify Array of token mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tokenTransferPost"></a>
# **tokenTransferPost**
> Empty tokenTransferPost(body)

Transfer Tokens

Use this Endpoint to Facilitate Moving Tokens from one Player to Another

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TokenEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TokenEndpointsApi apiInstance = new TokenEndpointsApi();
SDTokenTransferRequest body = new SDTokenTransferRequest(); // SDTokenTransferRequest | 
try {
    Empty result = apiInstance.tokenTransferPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenEndpointsApi#tokenTransferPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTokenTransferRequest**](SDTokenTransferRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

