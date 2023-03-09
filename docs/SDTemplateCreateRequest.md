# SDTemplateCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the template (ex. Bronze Axe) | 
**cap** | **String** | u96 Number as String (ex. 200000000)  | 
**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The type of custom contract to use for this template. Default will use a shared contract. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | FT is a currency where every instance is the same, NFT is where every token instance differes (ex. FT) | 
**ownerAddress** | **String** | Blockchain address to set as owner of the custom contract. Required if contractType is set. |  [optional]
**props** | [**SDTemplateCreateRequestProps**](SDTemplateCreateRequestProps.md) |  | 
**publicContractMetadata** | **Object** | Returned to marketplaces as contract metadata |  [optional]

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
