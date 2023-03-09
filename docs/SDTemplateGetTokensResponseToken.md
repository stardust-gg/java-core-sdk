# SDTemplateGetTokensResponseToken

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Token ID Number (unsigned 32 bit integer) | 
**amount** | **String** | u64 Number as String, min: 0, max: 9223372036854775807 (ex. \&quot;6\&quot;) | 
**templateId** | **Integer** | Template ID Number (unsigned 32 bit integer) |  [optional]
**name** | **String** | Template Name |  [optional]
**props** | [**SDTemplateGetTokensResponseTokenProps**](SDTemplateGetTokensResponseTokenProps.md) |  |  [optional]
**publicMetadata** | **Object** | Returned to marketplaces as token metadata |  [optional]
