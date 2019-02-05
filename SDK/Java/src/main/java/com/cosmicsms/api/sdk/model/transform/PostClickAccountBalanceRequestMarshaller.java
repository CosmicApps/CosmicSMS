/**
 * null
 */
package com.cosmicsms.api.sdk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.cosmicsms.api.sdk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostClickAccountBalanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostClickAccountBalanceRequestMarshaller {

    private static final PostClickAccountBalanceRequestMarshaller instance = new PostClickAccountBalanceRequestMarshaller();

    public static PostClickAccountBalanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostClickAccountBalanceRequest postClickAccountBalanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (postClickAccountBalanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
