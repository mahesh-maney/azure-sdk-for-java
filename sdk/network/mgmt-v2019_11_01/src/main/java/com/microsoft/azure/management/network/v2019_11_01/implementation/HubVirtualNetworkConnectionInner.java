/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * HubVirtualNetworkConnection Resource.
 */
@JsonFlatten
public class HubVirtualNetworkConnectionInner extends SubResource {
    /**
     * Reference to the remote virtual network.
     */
    @JsonProperty(value = "properties.remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /**
     * VirtualHub to RemoteVnet transit to enabled or not.
     */
    @JsonProperty(value = "properties.allowHubToRemoteVnetTransit")
    private Boolean allowHubToRemoteVnetTransit;

    /**
     * Allow RemoteVnet to use Virtual Hub's gateways.
     */
    @JsonProperty(value = "properties.allowRemoteVnetToUseHubVnetGateways")
    private Boolean allowRemoteVnetToUseHubVnetGateways;

    /**
     * Enable internet security.
     */
    @JsonProperty(value = "properties.enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /**
     * The provisioning state of the hub virtual network connection resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get reference to the remote virtual network.
     *
     * @return the remoteVirtualNetwork value
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set reference to the remote virtual network.
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get virtualHub to RemoteVnet transit to enabled or not.
     *
     * @return the allowHubToRemoteVnetTransit value
     */
    public Boolean allowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }

    /**
     * Set virtualHub to RemoteVnet transit to enabled or not.
     *
     * @param allowHubToRemoteVnetTransit the allowHubToRemoteVnetTransit value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        return this;
    }

    /**
     * Get allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @return the allowRemoteVnetToUseHubVnetGateways value
     */
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }

    /**
     * Set allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @param allowRemoteVnetToUseHubVnetGateways the allowRemoteVnetToUseHubVnetGateways value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowRemoteVnetToUseHubVnetGateways(Boolean allowRemoteVnetToUseHubVnetGateways) {
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        return this;
    }

    /**
     * Get enable internet security.
     *
     * @return the enableInternetSecurity value
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the provisioning state of the hub virtual network connection resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}