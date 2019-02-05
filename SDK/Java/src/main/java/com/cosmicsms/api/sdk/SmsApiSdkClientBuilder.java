/**
 * null
 */
package com.cosmicsms.api.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link com.cosmicsms.api.sdk.SmsApiSdk}.
 * 
 * @see com.cosmicsms.api.sdk.SmsApiSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class SmsApiSdkClientBuilder extends SdkSyncClientBuilder<SmsApiSdkClientBuilder, SmsApiSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("api.cosmicsms.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-west-1";

    /**
     * Package private constructor - builder should be created via {@link SmsApiSdk#builder()}
     */
    SmsApiSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of SmsApiSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of SmsApiSdk.
     */
    @Override
    protected SmsApiSdk build(AwsSyncClientParams params) {
        return new SmsApiSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
