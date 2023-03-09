# PlayerEndpointsApi

All URIs are relative to *https://core-api.stardust.gg/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playerCountGet**](PlayerEndpointsApi.md#playerCountGet) | **GET** /player/count | Get Player Count
[**playerCreatePost**](PlayerEndpointsApi.md#playerCreatePost) | **POST** /player/create | Create Player
[**playerGetAllGet**](PlayerEndpointsApi.md#playerGetAllGet) | **GET** /player/get-all | Get All Players
[**playerGetGet**](PlayerEndpointsApi.md#playerGetGet) | **GET** /player/get | Get Player
[**playerGetIdGet**](PlayerEndpointsApi.md#playerGetIdGet) | **GET** /player/get-id | Get Player ID
[**playerGetIdsGet**](PlayerEndpointsApi.md#playerGetIdsGet) | **GET** /player/get-ids | Get All Player IDs
[**playerGetInventoryGet**](PlayerEndpointsApi.md#playerGetInventoryGet) | **GET** /player/get-inventory | Get Player Inventory
[**playerMutatePut**](PlayerEndpointsApi.md#playerMutatePut) | **PUT** /player/mutate | Mutate Player
[**playerRemoveDelete**](PlayerEndpointsApi.md#playerRemoveDelete) | **DELETE** /player/remove | Remove Player
[**playerWalletGetGet**](PlayerEndpointsApi.md#playerWalletGetGet) | **GET** /player/wallet-get | Get Player Wallet
[**playerWithdrawPost**](PlayerEndpointsApi.md#playerWithdrawPost) | **POST** /player/withdraw | Withdraw From Player

<a name="playerCountGet"></a>
# **playerCountGet**
> SDPlayerCountResponse playerCountGet()

Get Player Count

Get Player count within a game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
try {
    SDPlayerCountResponse result = apiInstance.playerCountGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerCountGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDPlayerCountResponse**](SDPlayerCountResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerCreatePost"></a>
# **playerCreatePost**
> SDPlayerCreateResponse playerCreatePost(body)

Create Player

Create a Player for a game. Returns their player id which can be used to reference them later in Stardust&#x27;s system

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
SDPlayerCreateRequest body = new SDPlayerCreateRequest(); // SDPlayerCreateRequest | 
try {
    SDPlayerCreateResponse result = apiInstance.playerCreatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDPlayerCreateRequest**](SDPlayerCreateRequest.md)|  |

### Return type

[**SDPlayerCreateResponse**](SDPlayerCreateResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playerGetAllGet"></a>
# **playerGetAllGet**
> SDPlayerGetAllResponses playerGetAllGet(start, filter, limit)

Get All Players

Get the List of All Players in Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String start = "start_example"; // String | position in list
String filter = "filter_example"; // String | Find a substring within the Player unique ID field
String limit = "limit_example"; // String | maximum items returned in list
try {
    SDPlayerGetAllResponses result = apiInstance.playerGetAllGet(start, filter, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerGetAllGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **String**| position in list | [optional]
 **filter** | **String**| Find a substring within the Player unique ID field | [optional]
 **limit** | **String**| maximum items returned in list | [optional]

### Return type

[**SDPlayerGetAllResponses**](SDPlayerGetAllResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetGet"></a>
# **playerGetGet**
> SDPlayerGetResponse playerGetGet(playerId)

Get Player

Get Details of a Player Within a Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String playerId = "playerId_example"; // String | Player id
try {
    SDPlayerGetResponse result = apiInstance.playerGetGet(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Player id |

### Return type

[**SDPlayerGetResponse**](SDPlayerGetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetIdGet"></a>
# **playerGetIdGet**
> SDPlayerGetIdResponse playerGetIdGet(uniqueId)

Get Player ID

Get a Player&#x27;s ID via their Unique ID

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String uniqueId = "uniqueId_example"; // String | Player's Unique ID
try {
    SDPlayerGetIdResponse result = apiInstance.playerGetIdGet(uniqueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerGetIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueId** | **String**| Player&#x27;s Unique ID |

### Return type

[**SDPlayerGetIdResponse**](SDPlayerGetIdResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetIdsGet"></a>
# **playerGetIdsGet**
> SDPlayerGetIdsResponses playerGetIdsGet()

Get All Player IDs

Get All Player IDs for a Given Game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
try {
    SDPlayerGetIdsResponses result = apiInstance.playerGetIdsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerGetIdsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SDPlayerGetIdsResponses**](SDPlayerGetIdsResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerGetInventoryGet"></a>
# **playerGetInventoryGet**
> SDPlayerGetInventoryResponses playerGetInventoryGet(playerId, start, tokenIds, limit)

Get Player Inventory

Get a players inventory and all the items it holds

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String playerId = "playerId_example"; // String | Player id
String start = "start_example"; // String | position in list
String tokenIds = "tokenIds_example"; // String | Comma-Separated String of token ids (ex. '3589, 3580')
String limit = "limit_example"; // String | maximum items returned in list
try {
    SDPlayerGetInventoryResponses result = apiInstance.playerGetInventoryGet(playerId, start, tokenIds, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerGetInventoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Player id |
 **start** | **String**| position in list | [optional]
 **tokenIds** | **String**| Comma-Separated String of token ids (ex. &#x27;3589, 3580&#x27;) | [optional]
 **limit** | **String**| maximum items returned in list | [optional]

### Return type

[**SDPlayerGetInventoryResponses**](SDPlayerGetInventoryResponses.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerMutatePut"></a>
# **playerMutatePut**
> Empty playerMutatePut(body)

Mutate Player

Change player data

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
SDPlayerMutateRequest body = new SDPlayerMutateRequest(); // SDPlayerMutateRequest | 
try {
    Empty result = apiInstance.playerMutatePut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerMutatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDPlayerMutateRequest**](SDPlayerMutateRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playerRemoveDelete"></a>
# **playerRemoveDelete**
> Empty playerRemoveDelete(playerId)

Remove Player

Removes (hides) a player from your game. This is not permanent.

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String playerId = "playerId_example"; // String | Player Id returned from player/create a UUID, i.e. 802760b0-2bb5-4fba-9237-895ed02cf8d8
try {
    Empty result = apiInstance.playerRemoveDelete(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerRemoveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Player Id returned from player/create a UUID, i.e. 802760b0-2bb5-4fba-9237-895ed02cf8d8 |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerWalletGetGet"></a>
# **playerWalletGetGet**
> SDPlayerWalletGetResponse playerWalletGetGet(playerId)

Get Player Wallet

Get player&#x27;s wallet within a game

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
String playerId = "playerId_example"; // String | Player id
try {
    SDPlayerWalletGetResponse result = apiInstance.playerWalletGetGet(playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerWalletGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | **String**| Player id |

### Return type

[**SDPlayerWalletGetResponse**](SDPlayerWalletGetResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playerWithdrawPost"></a>
# **playerWithdrawPost**
> Empty playerWithdrawPost(body)

Withdraw From Player

Withdraw a Player&#x27;s Tokens from their Stardust Wallet

### Example
```java
// Import classes:
//import gg.stardust.coresdk.ApiClient;
//import gg.stardust.coresdk.ApiException;
//import gg.stardust.coresdk.Configuration;
//import gg.stardust.coresdk.auth.*;
//import gg.stardust.coresdk.apis.PlayerEndpointsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PlayerEndpointsApi apiInstance = new PlayerEndpointsApi();
SDPlayerWithdrawRequest body = new SDPlayerWithdrawRequest(); // SDPlayerWithdrawRequest | 
try {
    Empty result = apiInstance.playerWithdrawPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerEndpointsApi#playerWithdrawPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SDPlayerWithdrawRequest**](SDPlayerWithdrawRequest.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

