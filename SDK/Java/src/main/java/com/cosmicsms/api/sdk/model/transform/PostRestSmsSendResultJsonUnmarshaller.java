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
 * PostRestSmsSendResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostRestSmsSendResultJsonUnmarshaller implements Unmarshaller<PostRestSmsSendResult, JsonUnmarshallerContext> {

    public PostRestSmsSendResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostRestSmsSendResult postRestSmsSendResult = new PostRestSmsSendResult();

        return postRestSmsSendResult;
    }

    private static PostRestSmsSendResultJsonUnmarshaller instance;

    public static PostRestSmsSendResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostRestSmsSendResultJsonUnmarshaller();
        return instance;
    }
}
