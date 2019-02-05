/**
 * null
 */
package com.cosmicsms.api.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.cosmicsms.api.sdk.model.*;

/**
 * Interface for accessing SmsApiSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface SmsApiSdk {

    /**
     * @param getRestAccountBalanceRequest
     * @return Result of the GetRestAccountBalance operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws PaymentRequiredException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws MethodNotAllowedException
     * @sample SmsApiSdk.GetRestAccountBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/GetRestAccountBalance"
     *      target="_top">AWS API Documentation</a>
     */
    GetRestAccountBalanceResult getRestAccountBalance(GetRestAccountBalanceRequest getRestAccountBalanceRequest);

    /**
     * @param postClickAccountBalanceRequest
     * @return Result of the PostClickAccountBalance operation returned by the service.
     * @sample SmsApiSdk.PostClickAccountBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/PostClickAccountBalance"
     *      target="_top">AWS API Documentation</a>
     */
    PostClickAccountBalanceResult postClickAccountBalance(PostClickAccountBalanceRequest postClickAccountBalanceRequest);

    /**
     * @param postClickSmsSendRequest
     * @return Result of the PostClickSmsSend operation returned by the service.
     * @sample SmsApiSdk.PostClickSmsSend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/PostClickSmsSend" target="_top">AWS
     *      API Documentation</a>
     */
    PostClickSmsSendResult postClickSmsSend(PostClickSmsSendRequest postClickSmsSendRequest);

    /**
     * @param postRestSmsSendRequest
     * @return Result of the PostRestSmsSend operation returned by the service.
     * @throws BadRequestException
     * @throws UnauthorizedException
     * @throws InternalServerErrorException
     * @throws PaymentRequiredException
     * @throws NotFoundException
     * @throws ServiceUnavailableException
     * @throws MethodNotAllowedException
     * @sample SmsApiSdk.PostRestSmsSend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/PostRestSmsSend" target="_top">AWS
     *      API Documentation</a>
     */
    PostRestSmsSendResult postRestSmsSend(PostRestSmsSendRequest postRestSmsSendRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static SmsApiSdkClientBuilder builder() {
        return new SmsApiSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
