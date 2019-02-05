/**
 * null
 */
package com.cosmicsms.api.sdk.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotFoundException extends com.cosmicsms.api.sdk.model.SmsApiSdkException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotFoundException(String message) {
        super(message);
    }

}
