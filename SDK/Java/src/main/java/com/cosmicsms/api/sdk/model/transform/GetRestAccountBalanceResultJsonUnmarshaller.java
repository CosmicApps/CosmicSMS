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
 * GetRestAccountBalanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRestAccountBalanceResultJsonUnmarshaller implements Unmarshaller<GetRestAccountBalanceResult, JsonUnmarshallerContext> {

    public GetRestAccountBalanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRestAccountBalanceResult getRestAccountBalanceResult = new GetRestAccountBalanceResult();

        return getRestAccountBalanceResult;
    }

    private static GetRestAccountBalanceResultJsonUnmarshaller instance;

    public static GetRestAccountBalanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRestAccountBalanceResultJsonUnmarshaller();
        return instance;
    }
}
