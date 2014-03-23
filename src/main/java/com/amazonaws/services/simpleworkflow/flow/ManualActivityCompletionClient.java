/*
 * Copyright 2012-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow;

import java.util.concurrent.CancellationException;



public abstract class ManualActivityCompletionClient {

    public abstract void complete(Object result);
    
    public abstract void fail(Throwable failure);
    
    public abstract void recordHeartbeat(String details) throws CancellationException;
    
    public abstract void reportCancellation(String details);
    
}
