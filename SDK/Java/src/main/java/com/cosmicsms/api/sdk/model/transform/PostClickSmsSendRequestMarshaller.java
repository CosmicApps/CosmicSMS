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
 * PostClickSmsSendRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostClickSmsSendRequestMarshaller {

    private static final PostClickSmsSendRequestMarshaller instance = new PostClickSmsSendRequestMarshaller();

    public static PostClickSmsSendRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostClickSmsSendRequest postClickSmsSendRequest, ProtocolMarshaller protocolMarshaller) {

        if (postClickSmsSendRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
