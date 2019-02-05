/**
 * null
 */
package com.cosmicsms.api.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import com.cosmicsms.api.sdk.model.*;
import com.cosmicsms.api.sdk.model.transform.*;

/**
 * Client for accessing SmsApiSdk. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class SmsApiSdkClient implements SmsApiSdk {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MethodNotAllowedException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.MethodNotAllowedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PaymentRequiredException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.PaymentRequiredException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.cosmicsms.api.sdk.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.cosmicsms.api.sdk.model.SmsApiSdkException.class));

    /**
     * Constructs a new client to invoke service methods on SmsApiSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    SmsApiSdkClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

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
    @Override
    public GetRestAccountBalanceResult getRestAccountBalance(GetRestAccountBalanceRequest getRestAccountBalanceRequest) {
        HttpResponseHandler<GetRestAccountBalanceResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRestAccountBalanceResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(UnauthorizedException.class).withHttpStatusCode(401),
                new JsonErrorShapeMetadata().withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500), new JsonErrorShapeMetadata()
                        .withModeledClass(PaymentRequiredException.class).withHttpStatusCode(402),
                new JsonErrorShapeMetadata().withModeledClass(NotFoundException.class).withHttpStatusCode(404),
                new JsonErrorShapeMetadata().withModeledClass(ServiceUnavailableException.class).withHttpStatusCode(503), new JsonErrorShapeMetadata()
                        .withModeledClass(MethodNotAllowedException.class).withHttpStatusCode(405));

        return clientHandler.execute(new ClientExecutionParams<GetRestAccountBalanceRequest, GetRestAccountBalanceResult>()
                .withMarshaller(new GetRestAccountBalanceRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getRestAccountBalanceRequest));
    }

    /**
     * @param postClickAccountBalanceRequest
     * @return Result of the PostClickAccountBalance operation returned by the service.
     * @sample SmsApiSdk.PostClickAccountBalance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/PostClickAccountBalance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostClickAccountBalanceResult postClickAccountBalance(PostClickAccountBalanceRequest postClickAccountBalanceRequest) {
        HttpResponseHandler<PostClickAccountBalanceResult> responseHandler = protocolFactory.createResponseHandler(
                new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PostClickAccountBalanceResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostClickAccountBalanceRequest, PostClickAccountBalanceResult>()
                .withMarshaller(new PostClickAccountBalanceRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postClickAccountBalanceRequest));
    }

    /**
     * @param postClickSmsSendRequest
     * @return Result of the PostClickSmsSend operation returned by the service.
     * @sample SmsApiSdk.PostClickSmsSend
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/api-2018-08-12T22:20:27Z/PostClickSmsSend" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PostClickSmsSendResult postClickSmsSend(PostClickSmsSendRequest postClickSmsSendRequest) {
        HttpResponseHandler<PostClickSmsSendResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostClickSmsSendResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostClickSmsSendRequest, PostClickSmsSendResult>()
                .withMarshaller(new PostClickSmsSendRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postClickSmsSendRequest));
    }

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
    @Override
    public PostRestSmsSendResult postRestSmsSend(PostRestSmsSendRequest postRestSmsSendRequest) {
        HttpResponseHandler<PostRestSmsSendResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostRestSmsSendResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(
                new JsonErrorShapeMetadata().withModeledClass(BadRequestException.class).withHttpStatusCode(400), new JsonErrorShapeMetadata()
                        .withModeledClass(UnauthorizedException.class).withHttpStatusCode(401),
                new JsonErrorShapeMetadata().withModeledClass(InternalServerErrorException.class).withHttpStatusCode(500), new JsonErrorShapeMetadata()
                        .withModeledClass(PaymentRequiredException.class).withHttpStatusCode(402),
                new JsonErrorShapeMetadata().withModeledClass(NotFoundException.class).withHttpStatusCode(404),
                new JsonErrorShapeMetadata().withModeledClass(ServiceUnavailableException.class).withHttpStatusCode(503), new JsonErrorShapeMetadata()
                        .withModeledClass(MethodNotAllowedException.class).withHttpStatusCode(405));

        return clientHandler.execute(new ClientExecutionParams<PostRestSmsSendRequest, PostRestSmsSendResult>()
                .withMarshaller(new PostRestSmsSendRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postRestSmsSendRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
