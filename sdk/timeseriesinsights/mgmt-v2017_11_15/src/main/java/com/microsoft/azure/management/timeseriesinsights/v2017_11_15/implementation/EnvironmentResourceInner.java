/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.Sku;
import org.joda.time.Period;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.StorageLimitExceededBehavior;
import java.util.List;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.PartitionKeyProperty;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.ProvisioningState;
import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.EnvironmentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An environment is a set of time-series data available for query, and is the
 * top level Azure Time Series Insights resource.
 */
@JsonFlatten
public class EnvironmentResourceInner extends Resource {
    /**
     * The sku determines the capacity of the environment, the SLA (in
     * queries-per-minute and total capacity), and the billing rate.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     */
    @JsonProperty(value = "properties.dataRetentionTime", required = true)
    private Period dataRetentionTime;

    /**
     * The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is
     * specified, new events will not be read from the event source. If
     * "PurgeOldData" is specified, new events will continue to be read and old
     * events will be deleted from the environment. The default behavior is
     * PurgeOldData. Possible values include: 'PurgeOldData', 'PauseIngress'.
     */
    @JsonProperty(value = "properties.storageLimitExceededBehavior")
    private StorageLimitExceededBehavior storageLimitExceededBehavior;

    /**
     * The list of partition keys according to which the data in the
     * environment will be ordered.
     */
    @JsonProperty(value = "properties.partitionKeyProperties")
    private List<PartitionKeyProperty> partitionKeyProperties;

    /**
     * Provisioning state of the resource. Possible values include: 'Accepted',
     * 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * An id used to access the environment data, e.g. to query the
     * environment's events or upload reference data for the environment.
     */
    @JsonProperty(value = "properties.dataAccessId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataAccessId;

    /**
     * The fully qualified domain name used to access the environment data,
     * e.g. to query the environment's events or upload reference data for the
     * environment.
     */
    @JsonProperty(value = "properties.dataAccessFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dataAccessFqdn;

    /**
     * An object that represents the status of the environment, and its
     * internal state in the Time Series Insights service.
     */
    @JsonProperty(value = "properties.status")
    private EnvironmentStatus status;

    /**
     * Get the sku determines the capacity of the environment, the SLA (in queries-per-minute and total capacity), and the billing rate.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku determines the capacity of the environment, the SLA (in queries-per-minute and total capacity), and the billing rate.
     *
     * @param sku the sku value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get iSO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     *
     * @return the dataRetentionTime value
     */
    public Period dataRetentionTime() {
        return this.dataRetentionTime;
    }

    /**
     * Set iSO8601 timespan specifying the minimum number of days the environment's events will be available for query.
     *
     * @param dataRetentionTime the dataRetentionTime value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withDataRetentionTime(Period dataRetentionTime) {
        this.dataRetentionTime = dataRetentionTime;
        return this;
    }

    /**
     * Get the behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData. Possible values include: 'PurgeOldData', 'PauseIngress'.
     *
     * @return the storageLimitExceededBehavior value
     */
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior;
    }

    /**
     * Set the behavior the Time Series Insights service should take when the environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted from the environment. The default behavior is PurgeOldData. Possible values include: 'PurgeOldData', 'PauseIngress'.
     *
     * @param storageLimitExceededBehavior the storageLimitExceededBehavior value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withStorageLimitExceededBehavior(StorageLimitExceededBehavior storageLimitExceededBehavior) {
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        return this;
    }

    /**
     * Get the list of partition keys according to which the data in the environment will be ordered.
     *
     * @return the partitionKeyProperties value
     */
    public List<PartitionKeyProperty> partitionKeyProperties() {
        return this.partitionKeyProperties;
    }

    /**
     * Set the list of partition keys according to which the data in the environment will be ordered.
     *
     * @param partitionKeyProperties the partitionKeyProperties value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withPartitionKeyProperties(List<PartitionKeyProperty> partitionKeyProperties) {
        this.partitionKeyProperties = partitionKeyProperties;
        return this;
    }

    /**
     * Get provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the resource. Possible values include: 'Accepted', 'Creating', 'Updating', 'Succeeded', 'Failed', 'Deleting'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the time the resource was created.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get an id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     *
     * @return the dataAccessId value
     */
    public UUID dataAccessId() {
        return this.dataAccessId;
    }

    /**
     * Get the fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     *
     * @return the dataAccessFqdn value
     */
    public String dataAccessFqdn() {
        return this.dataAccessFqdn;
    }

    /**
     * Get an object that represents the status of the environment, and its internal state in the Time Series Insights service.
     *
     * @return the status value
     */
    public EnvironmentStatus status() {
        return this.status;
    }

    /**
     * Set an object that represents the status of the environment, and its internal state in the Time Series Insights service.
     *
     * @param status the status value to set
     * @return the EnvironmentResourceInner object itself.
     */
    public EnvironmentResourceInner withStatus(EnvironmentStatus status) {
        this.status = status;
        return this;
    }

}