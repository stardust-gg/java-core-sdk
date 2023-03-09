# SDTemplateCreateBulk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the template (ex. Bronze Axe) | 
**cap** | **String** | u96 Number as String (ex. 200000000), default 39614081257132168796771975168  |  [optional]
**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The type of custom contract to use for this template. Default will use a shared contract. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT) |  [optional]
**image** | **String** | image url | 
**description** | **String** | Description of template |  [optional]
**activeListing** | **Boolean** | Set if the Template is active or not |  [optional]
**ownerAddress** | **String** | Blockchain address to set as owner of the custom contract, if contractType is passed in. |  [optional]
**props** | [**SDTemplateCreateBulkProps**](SDTemplateCreateBulkProps.md) |  |  [optional]
**publicContractMetadata** | **Object** | Returned to marketplaces as contract metadata |  [optional]
**publicTokenMetadata** | **Object** | Inherited by tokens, and returned to marketplaces as token metadata |  [optional]

<a name="ContractTypeEnum"></a>
## Enum: ContractTypeEnum
Name | Value
---- | -----
ERC721 | &quot;ERC721&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FT | &quot;FT&quot;
NFT | &quot;NFT&quot;
