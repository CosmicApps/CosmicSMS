/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.cosmicsms.api.android.sdk;

import java.util.*;



@com.amazonaws.mobileconnectors.apigateway.annotation.Service(endpoint = "https://api.cosmicsms.com/prod")
public interface APIPRODcosmicsmsClient {


    /**
     * A generic invoker to invoke any API Gateway endpoint.
     * @param request
     * @return ApiResponse
     */
    com.amazonaws.mobileconnectors.apigateway.ApiResponse execute(com.amazonaws.mobileconnectors.apigateway.ApiRequest request);
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/click/account/balance", method = "POST")
    void clickAccountBalancePost();
    
    /**
     * 
     * 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/click/sms/send", method = "POST")
    void clickSmsSendPost();
    
    /**
     * 
     * 
     * @param authorization 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/rest/account/balance", method = "GET")
    void restAccountBalanceGet(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
    /**
     * 
     * 
     * @param authorization 
     * @return void
     */
    @com.amazonaws.mobileconnectors.apigateway.annotation.Operation(path = "/rest/sms/send", method = "POST")
    void restSmsSendPost(
            @com.amazonaws.mobileconnectors.apigateway.annotation.Parameter(name = "Authorization", location = "header")
            String authorization);
    
}

