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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#deleteTape(DeleteTapeRequest) DeleteTape operation}.
 * <p>
 * Deletes the specified virtual tape.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#deleteTape(DeleteTapeRequest)
 */
public class DeleteTapeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual
     * tape to delete is associated with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String tapeARN;

    /**
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual
     * tape to delete is associated with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The unique Amazon Resource Name (ARN) of the gateway that the virtual
     *         tape to delete is associated with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual
     * tape to delete is associated with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The unique Amazon Resource Name (ARN) of the gateway that the virtual
     *         tape to delete is associated with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The unique Amazon Resource Name (ARN) of the gateway that the virtual
     * tape to delete is associated with. Use the <a>ListGateways</a>
     * operation to return a list of gateways for your account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The unique Amazon Resource Name (ARN) of the gateway that the virtual
     *         tape to delete is associated with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTapeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the virtual tape to delete.
     */
    public String getTapeARN() {
        return tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape to delete.
     */
    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the virtual tape to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param tapeARN The Amazon Resource Name (ARN) of the virtual tape to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTapeRequest withTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getTapeARN() != null) sb.append("TapeARN: " + getTapeARN() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteTapeRequest == false) return false;
        DeleteTapeRequest other = (DeleteTapeRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getTapeARN() == null ^ this.getTapeARN() == null) return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false) return false; 
        return true;
    }
    
}
    