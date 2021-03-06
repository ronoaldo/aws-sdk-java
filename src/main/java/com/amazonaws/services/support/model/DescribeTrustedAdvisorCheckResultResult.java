/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the following objects or data if successful. Otherwise,
 * returns an error.
 * </p>
 */
public class DescribeTrustedAdvisorCheckResultResult implements Serializable {

    /**
     * The detailed results of the Trusted Advisor check.
     */
    private TrustedAdvisorCheckResult result;

    /**
     * The detailed results of the Trusted Advisor check.
     *
     * @return The detailed results of the Trusted Advisor check.
     */
    public TrustedAdvisorCheckResult getResult() {
        return result;
    }
    
    /**
     * The detailed results of the Trusted Advisor check.
     *
     * @param result The detailed results of the Trusted Advisor check.
     */
    public void setResult(TrustedAdvisorCheckResult result) {
        this.result = result;
    }
    
    /**
     * The detailed results of the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param result The detailed results of the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTrustedAdvisorCheckResultResult withResult(TrustedAdvisorCheckResult result) {
        this.result = result;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResult() != null) sb.append("Result: " + getResult() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTrustedAdvisorCheckResultResult == false) return false;
        DescribeTrustedAdvisorCheckResultResult other = (DescribeTrustedAdvisorCheckResultResult)obj;
        
        if (other.getResult() == null ^ this.getResult() == null) return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false) return false; 
        return true;
    }
    
}
    