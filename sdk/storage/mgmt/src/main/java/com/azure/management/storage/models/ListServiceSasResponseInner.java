// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ListServiceSasResponse model. */
@Immutable
public final class ListServiceSasResponseInner {
    /*
     * List service SAS credentials of specific resource.
     */
    @JsonProperty(value = "serviceSasToken", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceSasToken;

    /**
     * Get the serviceSasToken property: List service SAS credentials of specific resource.
     *
     * @return the serviceSasToken value.
     */
    public String serviceSasToken() {
        return this.serviceSasToken;
    }
}