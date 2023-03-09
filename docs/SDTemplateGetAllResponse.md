# SDTemplateGetAllResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gameId** | **Integer** | Game ID Number (unsigned 32 bit integer) | 
**_id** | **Integer** |  | 
**cap** | **String** | u96 Number as String, min: 0, max: 39614081257132168796771975167 | 
**contractType** | [**ContractTypeEnum**](#ContractTypeEnum) | The type of custom contract bieng used for this template. |  [optional]
**totalSupply** | **String** | u96 Number as String, min: 0, max: 39614081257132168796771975167 | 
**name** | **String** | The name of the template | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**props** | [**SDTemplateGetAllResponseProps**](SDTemplateGetAllResponseProps.md) |  | 
**publicContractMetadata** | **Object** | Returned to marketplaces as contract metadata |  [optional]
**publicTokenMetadata** | **Object** | Inherited by tokens, and returned to marketplaces as token metadata |  [optional]

<a name="ContractTypeEnum"></a>
## Enum: ContractTypeEnum
Name | Value
---- | -----
ERC721 | &quot;ERC721&quot;
INTERNAL_MINT | &quot;internal-mint&quot;
EXTERNAL_NO_MINT | &quot;external-no-mint&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FT | &quot;FT&quot;
NFT | &quot;NFT&quot;
