/**
 * null
 */
package com.cosmicsms.api.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.cosmicsms.api.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PostClickSmsSendResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostClickSmsSendResultJsonUnmarshaller implements Unmarshaller<PostClickSmsSendResult, JsonUnmarshallerContext> {

    public PostClickSmsSendResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostClickSmsSendResult postClickSmsSendResult = new PostClickSmsSendResult();

        return postClickSmsSendResult;
    }

    private static PostClickSmsSendResultJsonUnmarshaller instance;

    public static PostClickSmsSendResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostClickSmsSendResultJsonUnmarshaller();
        return instance;
    }
}
