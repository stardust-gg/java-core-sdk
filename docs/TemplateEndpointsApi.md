# TemplateEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templateCountGet**](TemplateEndpointsApi.md#templateCountGet) | **GET** /template/count | Get Template Count
[**templateCreatePost**](TemplateEndpointsApi.md#templateCreatePost) | **POST** /template/create | Create Template
[**templateGetAllGet**](TemplateEndpointsApi.md#templateGetAllGet) | **GET** /template/get-all | Get All Templates
[**templateGetGet**](TemplateEndpointsApi.md#templateGetGet) | **GET** /template/get | Get Template
[**templateGetTokensGet**](TemplateEndpointsApi.md#templateGetTokensGet) | **GET** /template/get-tokens | Get Template Tokens
[**templateMutatePut**](TemplateEndpointsApi.md#templateMutatePut) | **PUT** /template/mutate | Mutate Template
[**templatePropsRemoveDelete**](TemplateEndpointsApi.md#templatePropsRemoveDelete) | **DELETE** /template/props-remove | Remove Template Property
[**templateRemoveDelete**](TemplateEndpointsApi.md#templateRemoveDelete) | **DELETE** /template/remove | Remove Template

<a name="templateCountGet"></a>
# **templateCountGet**
> SDTemplateCountResponse templateCountGet(filter)

Get Template Count

Get a Template&#x27;s Count Within a Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String filter = "filter_example"; // String | Find a substring within the Template name field
try {
    SDTemplateCountResponse result = apiInstance.templateCountGet(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateCountGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Find a substring within the Template name field | [optional]

### Return type

[**SDTemplateCountResponse**](SDTemplateCountResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateCreatePost"></a>
# **templateCreatePost**
> SDTemplateCreateResponse templateCreatePost(body)

Create Template

Adds a New Token Template that lets Players Acquire that Token using the Token/Mint Endpoint

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
SDTemplateCreateRequest body = new SDTemplateCreateRequest(); // SDTemplateCreateRequest | 
try {
    SDTemplateCreateResponse result = apiInstance.templateCreatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTemplateCreateRequest**](SDTemplateCreateRequest.md)|  |

### Return type

[**SDTemplateCreateResponse**](SDTemplateCreateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templateGetAllGet"></a>
# **templateGetAllGet**
> SDTemplateGetAllResponses templateGetAllGet(start, limit, filter)

Get All Templates

Get All of the Templates Within a Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String start = "start_example"; // String | position in list
String limit = "limit_example"; // String | maximum templates returned in list
String filter = "filter_example"; // String | Find a substring within the Template name field
try {
    SDTemplateGetAllResponses result = apiInstance.templateGetAllGet(start, limit, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateGetAllGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **String**| position in list |
 **limit** | **String**| maximum templates returned in list |
 **filter** | **String**| Find a substring within the Template name field | [optional]

### Return type

[**SDTemplateGetAllResponses**](SDTemplateGetAllResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateGetGet"></a>
# **templateGetGet**
> SDTemplateGetResponse templateGetGet(templateId)

Get Template

Get the Details of a Template

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String templateId = "templateId_example"; // String | Template Id such as 3589)
try {
    SDTemplateGetResponse result = apiInstance.templateGetGet(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| Template Id such as 3589) |

### Return type

[**SDTemplateGetResponse**](SDTemplateGetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateGetTokensGet"></a>
# **templateGetTokensGet**
> SDTemplateGetTokensResponses templateGetTokensGet(templateId, start, limit, includeDeleted)

Get Template Tokens

Get a List of All Minted Tokens from a Given Template

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String templateId = "templateId_example"; // String | The ID of the Template
String start = "start_example"; // String | position in list
String limit = "limit_example"; // String | maximum templates returned in list
String includeDeleted = "includeDeleted_example"; // String | If true tokens from deleted players are included in the response
try {
    SDTemplateGetTokensResponses result = apiInstance.templateGetTokensGet(templateId, start, limit, includeDeleted);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateGetTokensGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| The ID of the Template |
 **start** | **String**| position in list | [optional]
 **limit** | **String**| maximum templates returned in list | [optional]
 **includeDeleted** | **String**| If true tokens from deleted players are included in the response | [optional]

### Return type

[**SDTemplateGetTokensResponses**](SDTemplateGetTokensResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateMutatePut"></a>
# **templateMutatePut**
> Empty templateMutatePut(body)

Mutate Template

Mutates a Property of a Template, Which in Turn will Affect the Inherited Property on All of the Tokens Created from this Template (via token/mint)

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
SDTemplateMutateRequest body = new SDTemplateMutateRequest(); // SDTemplateMutateRequest | 
try {
    Empty result = apiInstance.templateMutatePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateMutatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDTemplateMutateRequest**](SDTemplateMutateRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatePropsRemoveDelete"></a>
# **templatePropsRemoveDelete**
> Empty templatePropsRemoveDelete(templateId, props)

Remove Template Property

Removes a Templates Property from Your Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String templateId = "templateId_example"; // String | Template Id returned from template/create (ex. 5)
String props = "props_example"; // String | Stringify Array of template mutable property names ex: '[\"exp\", \"health\"]' }
try {
    Empty result = apiInstance.templatePropsRemoveDelete(templateId, props);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templatePropsRemoveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| Template Id returned from template/create (ex. 5) |
 **props** | **String**| Stringify Array of template mutable property names ex: &#x27;[\&quot;exp\&quot;, \&quot;health\&quot;]&#x27; } |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateRemoveDelete"></a>
# **templateRemoveDelete**
> Empty templateRemoveDelete(templateId)

Remove Template

Removes a Template from Your Game. If Players have Instances of this Template from the token/mint Command, Their Tokens will NOT be Removed

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.TemplateEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

TemplateEndpointsApi apiInstance = new TemplateEndpointsApi();
String templateId = "templateId_example"; // String | Template Id returned from template/create (ex. 5)
try {
    Empty result = apiInstance.templateRemoveDelete(templateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateEndpointsApi#templateRemoveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **String**| Template Id returned from template/create (ex. 5) |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

