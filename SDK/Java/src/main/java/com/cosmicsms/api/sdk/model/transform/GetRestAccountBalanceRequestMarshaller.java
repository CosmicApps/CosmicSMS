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
 * GetRestAccountBalanceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetRestAccountBalanceRequestMarshaller {

    private static final GetRestAccountBalanceRequestMarshaller instance = new GetRestAccountBalanceRequestMarshaller();

    public static GetRestAccountBalanceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetRestAccountBalanceRequest getRestAccountBalanceRequest, ProtocolMarshaller protocolMarshaller) {

        if (getRestAccountBalanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
