# stardust-core-sdk

Stardust API
- API version: 2023-02-22T22:32:07Z
  - Build date: 2023-03-09T11:52:00.026066-08:00[America/Los_Angeles]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>gg.stardust.coresdk</groupId>
  <artifactId>stardust-core-sdk</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "gg.stardust.coresdk:stardust-core-sdk:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/stardust-core-sdk-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import gg.stardust.coresdk.*;
import gg.stardust.coresdk.auth.*;
import gg.stardust.coresdk.models.*;
import gg.stardust.coresdk.apis.GameEndpointsApi;

import java.io.File;
import java.util.*;

public class GameEndpointsApiExample {

    public static void main(String[] args) {
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
    }
}
import gg.stardust.coresdk.*;
import gg.stardust.coresdk.auth.*;
import gg.stardust.coresdk.models.*;
import gg.stardust.coresdk.apis.GameEndpointsApi;

import java.io.File;
import java.util.*;

public class GameEndpointsApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://core-api.stardust.gg/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GameEndpointsApi* | [**gameGetGet**](docs/GameEndpointsApi.md#gameGetGet) | **GET** /game/get | Get Game
*GameEndpointsApi* | [**gameMutatePut**](docs/GameEndpointsApi.md#gameMutatePut) | **PUT** /game/mutate | Mutate Game
*HealthEndpointsApi* | [**healthGet**](docs/HealthEndpointsApi.md#healthGet) | **GET** /health | Get Health
*PlayerEndpointsApi* | [**playerCountGet**](docs/PlayerEndpointsApi.md#playerCountGet) | **GET** /player/count | Get Player Count
*PlayerEndpointsApi* | [**playerCreatePost**](docs/PlayerEndpointsApi.md#playerCreatePost) | **POST** /player/create | Create Player
*PlayerEndpointsApi* | [**playerGetAllGet**](docs/PlayerEndpointsApi.md#playerGetAllGet) | **GET** /player/get-all | Get All Players
*PlayerEndpointsApi* | [**playerGetGet**](docs/PlayerEndpointsApi.md#playerGetGet) | **GET** /player/get | Get Player
*PlayerEndpointsApi* | [**playerGetIdGet**](docs/PlayerEndpointsApi.md#playerGetIdGet) | **GET** /player/get-id | Get Player ID
*PlayerEndpointsApi* | [**playerGetIdsGet**](docs/PlayerEndpointsApi.md#playerGetIdsGet) | **GET** /player/get-ids | Get All Player IDs
*PlayerEndpointsApi* | [**playerGetInventoryGet**](docs/PlayerEndpointsApi.md#playerGetInventoryGet) | **GET** /player/get-inventory | Get Player Inventory
*PlayerEndpointsApi* | [**playerMutatePut**](docs/PlayerEndpointsApi.md#playerMutatePut) | **PUT** /player/mutate | Mutate Player
*PlayerEndpointsApi* | [**playerRemoveDelete**](docs/PlayerEndpointsApi.md#playerRemoveDelete) | **DELETE** /player/remove | Remove Player
*PlayerEndpointsApi* | [**playerWalletGetGet**](docs/PlayerEndpointsApi.md#playerWalletGetGet) | **GET** /player/wallet-get | Get Player Wallet
*PlayerEndpointsApi* | [**playerWithdrawPost**](docs/PlayerEndpointsApi.md#playerWithdrawPost) | **POST** /player/withdraw | Withdraw From Player
*TemplateEndpointsApi* | [**templateCountGet**](docs/TemplateEndpointsApi.md#templateCountGet) | **GET** /template/count | Get Template Count
*TemplateEndpointsApi* | [**templateCreatePost**](docs/TemplateEndpointsApi.md#templateCreatePost) | **POST** /template/create | Create Template
*TemplateEndpointsApi* | [**templateGetAllGet**](docs/TemplateEndpointsApi.md#templateGetAllGet) | **GET** /template/get-all | Get All Templates
*TemplateEndpointsApi* | [**templateGetGet**](docs/TemplateEndpointsApi.md#templateGetGet) | **GET** /template/get | Get Template
*TemplateEndpointsApi* | [**templateGetTokensGet**](docs/TemplateEndpointsApi.md#templateGetTokensGet) | **GET** /template/get-tokens | Get Template Tokens
*TemplateEndpointsApi* | [**templateMutatePut**](docs/TemplateEndpointsApi.md#templateMutatePut) | **PUT** /template/mutate | Mutate Template
*TemplateEndpointsApi* | [**templatePropsRemoveDelete**](docs/TemplateEndpointsApi.md#templatePropsRemoveDelete) | **DELETE** /template/props-remove | Remove Template Property
*TemplateEndpointsApi* | [**templateRemoveDelete**](docs/TemplateEndpointsApi.md#templateRemoveDelete) | **DELETE** /template/remove | Remove Template
*TokenEndpointsApi* | [**tokenBurnPost**](docs/TokenEndpointsApi.md#tokenBurnPost) | **POST** /token/burn | Burn Token
*TokenEndpointsApi* | [**tokenGetGet**](docs/TokenEndpointsApi.md#tokenGetGet) | **GET** /token/get | Get Token
*TokenEndpointsApi* | [**tokenMintBulkPost**](docs/TokenEndpointsApi.md#tokenMintBulkPost) | **POST** /token/mint-bulk | Mint Tokens
*TokenEndpointsApi* | [**tokenMutatePut**](docs/TokenEndpointsApi.md#tokenMutatePut) | **PUT** /token/mutate | Mutate Token
*TokenEndpointsApi* | [**tokenPropsRemoveDelete**](docs/TokenEndpointsApi.md#tokenPropsRemoveDelete) | **DELETE** /token/props-remove | Remove Token Property
*TokenEndpointsApi* | [**tokenTransferPost**](docs/TokenEndpointsApi.md#tokenTransferPost) | **POST** /token/transfer | Transfer Tokens

## Documentation for Models

 - [Empty](docs/Empty.md)
 - [Error](docs/Error.md)
 - [SDGameGetResponse](docs/SDGameGetResponse.md)
 - [SDGameGetResponseFees](docs/SDGameGetResponseFees.md)
 - [SDGameMutateRequest](docs/SDGameMutateRequest.md)
 - [SDHealthResponse](docs/SDHealthResponse.md)
 - [SDPlayerCountResponse](docs/SDPlayerCountResponse.md)
 - [SDPlayerCreateJWTObject](docs/SDPlayerCreateJWTObject.md)
 - [SDPlayerCreateRequest](docs/SDPlayerCreateRequest.md)
 - [SDPlayerCreateResponse](docs/SDPlayerCreateResponse.md)
 - [SDPlayerGetAllResponse](docs/SDPlayerGetAllResponse.md)
 - [SDPlayerGetAllResponses](docs/SDPlayerGetAllResponses.md)
 - [SDPlayerGetIdResponse](docs/SDPlayerGetIdResponse.md)
 - [SDPlayerGetIdsResponse](docs/SDPlayerGetIdsResponse.md)
 - [SDPlayerGetIdsResponses](docs/SDPlayerGetIdsResponses.md)
 - [SDPlayerGetInventoryResponse](docs/SDPlayerGetInventoryResponse.md)
 - [SDPlayerGetInventoryResponses](docs/SDPlayerGetInventoryResponses.md)
 - [SDPlayerGetResponse](docs/SDPlayerGetResponse.md)
 - [SDPlayerMutateRequest](docs/SDPlayerMutateRequest.md)
 - [SDPlayerWalletGetResponse](docs/SDPlayerWalletGetResponse.md)
 - [SDPlayerWalletGetResponseMonies](docs/SDPlayerWalletGetResponseMonies.md)
 - [SDPlayerWalletGetResponseWallet](docs/SDPlayerWalletGetResponseWallet.md)
 - [SDPlayerWithdrawObject](docs/SDPlayerWithdrawObject.md)
 - [SDPlayerWithdrawRequest](docs/SDPlayerWithdrawRequest.md)
 - [SDTemplateCountResponse](docs/SDTemplateCountResponse.md)
 - [SDTemplateCreateBulk](docs/SDTemplateCreateBulk.md)
 - [SDTemplateCreateBulkProps](docs/SDTemplateCreateBulkProps.md)
 - [SDTemplateCreateRequest](docs/SDTemplateCreateRequest.md)
 - [SDTemplateCreateRequestProps](docs/SDTemplateCreateRequestProps.md)
 - [SDTemplateCreateResponse](docs/SDTemplateCreateResponse.md)
 - [SDTemplateGetAllResponse](docs/SDTemplateGetAllResponse.md)
 - [SDTemplateGetAllResponseProps](docs/SDTemplateGetAllResponseProps.md)
 - [SDTemplateGetAllResponses](docs/SDTemplateGetAllResponses.md)
 - [SDTemplateGetResponse](docs/SDTemplateGetResponse.md)
 - [SDTemplateGetTokensResponse](docs/SDTemplateGetTokensResponse.md)
 - [SDTemplateGetTokensResponsePlayer](docs/SDTemplateGetTokensResponsePlayer.md)
 - [SDTemplateGetTokensResponseToken](docs/SDTemplateGetTokensResponseToken.md)
 - [SDTemplateGetTokensResponseTokenProps](docs/SDTemplateGetTokensResponseTokenProps.md)
 - [SDTemplateGetTokensResponses](docs/SDTemplateGetTokensResponses.md)
 - [SDTemplateMutateRequest](docs/SDTemplateMutateRequest.md)
 - [SDTokenBurnRequest](docs/SDTokenBurnRequest.md)
 - [SDTokenBurnRequestTokenObjects](docs/SDTokenBurnRequestTokenObjects.md)
 - [SDTokenGetResponse](docs/SDTokenGetResponse.md)
 - [SDTokenGetResponses](docs/SDTokenGetResponses.md)
 - [SDTokenMintBulkRequest](docs/SDTokenMintBulkRequest.md)
 - [SDTokenMintBulkResponses](docs/SDTokenMintBulkResponses.md)
 - [SDTokenMintBulkTokenObject](docs/SDTokenMintBulkTokenObject.md)
 - [SDTokenMintBulkTokenObjectProps](docs/SDTokenMintBulkTokenObjectProps.md)
 - [SDTokenMutateRequest](docs/SDTokenMutateRequest.md)
 - [SDTokenTransferRequest](docs/SDTokenTransferRequest.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

