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
 * PostClickAccountBalanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostClickAccountBalanceResultJsonUnmarshaller implements Unmarshaller<PostClickAccountBalanceResult, JsonUnmarshallerContext> {

    public PostClickAccountBalanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostClickAccountBalanceResult postClickAccountBalanceResult = new PostClickAccountBalanceResult();

        return postClickAccountBalanceResult;
    }

    private static PostClickAccountBalanceResultJsonUnmarshaller instance;

    public static PostClickAccountBalanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostClickAccountBalanceResultJsonUnmarshaller();
        return instance;
    }
}
