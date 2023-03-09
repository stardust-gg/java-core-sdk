# GameEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gameGetGet**](GameEndpointsApi.md#gameGetGet) | **GET** /game/get | Get Game
[**gameMutatePut**](GameEndpointsApi.md#gameMutatePut) | **PUT** /game/mutate | Mutate Game

<a name="gameGetGet"></a>
# **gameGetGet**
> SDGameGetResponse gameGetGet()

Get Game

Get the Details of Your Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.GameEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GameEndpointsApi apiInstance = new GameEndpointsApi();
try {
    SDGameGetResponse result = apiInstance.gameGetGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameEndpointsApi#gameGetGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDGameGetResponse**](SDGameGetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gameMutatePut"></a>
# **gameMutatePut**
> Empty gameMutatePut(body)

Mutate Game

Change a games data

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.GameEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GameEndpointsApi apiInstance = new GameEndpointsApi();
SDGameMutateRequest body = new SDGameMutateRequest(); // SDGameMutateRequest | 
try {
    Empty result = apiInstance.gameMutatePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GameEndpointsApi#gameMutatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDGameMutateRequest**](SDGameMutateRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

