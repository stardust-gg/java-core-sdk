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

import gg.stardust.coresdk.models.Empty;
import gg.stardust.coresdk.models.Error;
import gg.stardust.coresdk.models.SDTemplateCountResponse;
import gg.stardust.coresdk.models.SDTemplateCreateRequest;
import gg.stardust.coresdk.models.SDTemplateCreateResponse;
import gg.stardust.coresdk.models.SDTemplateGetAllResponses;
import gg.stardust.coresdk.models.SDTemplateGetResponse;
import gg.stardust.coresdk.models.SDTemplateGetTokensResponses;
import gg.stardust.coresdk.models.SDTemplateMutateRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TemplateEndpointsApi
 */
@Ignore
public class TemplateEndpointsApiTest {

    private final TemplateEndpointsApi api = new TemplateEndpointsApi();

    /**
     * Get Template Count
     *
     * Get a Template&#x27;s Count Within a Game
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateCountGetTest() throws Exception {
        String filter = null;
        SDTemplateCountResponse response = api.templateCountGet(filter);

        // TODO: test validations
    }
    /**
     * Create Template
     *
     * Adds a New Token Template that lets Players Acquire that Token using the Token/Mint Endpoint
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateCreatePostTest() throws Exception {
        SDTemplateCreateRequest body = null;
        SDTemplateCreateResponse response = api.templateCreatePost(body);

        // TODO: test validations
    }
    /**
     * Get All Templates
     *
     * Get All of the Templates Within a Game
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateGetAllGetTest() throws Exception {
        String start = null;
        String limit = null;
        String filter = null;
        SDTemplateGetAllResponses response = api.templateGetAllGet(start, limit, filter);

        // TODO: test validations
    }
    /**
     * Get Template
     *
     * Get the Details of a Template
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateGetGetTest() throws Exception {
        String templateId = null;
        SDTemplateGetResponse response = api.templateGetGet(templateId);

        // TODO: test validations
    }
    /**
     * Get Template Tokens
     *
     * Get a List of All Minted Tokens from a Given Template
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateGetTokensGetTest() throws Exception {
        String templateId = null;
        String start = null;
        String limit = null;
        String includeDeleted = null;
        SDTemplateGetTokensResponses response = api.templateGetTokensGet(templateId, start, limit, includeDeleted);

        // TODO: test validations
    }
    /**
     * Mutate Template
     *
     * Mutates a Property of a Template, Which in Turn will Affect the Inherited Property on All of the Tokens Created from this Template (via token/mint)
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateMutatePutTest() throws Exception {
        SDTemplateMutateRequest body = null;
        Empty response = api.templateMutatePut(body);

        // TODO: test validations
    }
    /**
     * Remove Template Property
     *
     * Removes a Templates Property from Your Game
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templatePropsRemoveDeleteTest() throws Exception {
        String templateId = null;
        String props = null;
        Empty response = api.templatePropsRemoveDelete(templateId, props);

        // TODO: test validations
    }
    /**
     * Remove Template
     *
     * Removes a Template from Your Game. If Players have Instances of this Template from the token/mint Command, Their Tokens will NOT be Removed
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void templateRemoveDeleteTest() throws Exception {
        String templateId = null;
        Empty response = api.templateRemoveDelete(templateId);

        // TODO: test validations
    }
}
