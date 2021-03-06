/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2019_08_01.AppServiceEnvironmentResource;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2019_08_01.HostingEnvironmentDiagnostics;
import com.microsoft.azure.management.appservice.v2019_08_01.InboundEnvironmentEndpoint;
import com.microsoft.azure.management.appservice.v2019_08_01.MultiRolePools;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.WorkerPoolResourceInner;
import com.microsoft.azure.management.appservice.v2019_08_01.ResourceMetricDefinition;
import com.microsoft.azure.management.appservice.v2019_08_01.Operation;
import com.microsoft.azure.management.appservice.v2019_08_01.OutboundEnvironmentEndpoint;
import com.microsoft.azure.management.appservice.v2019_08_01.HostingEnvironmentAppServicePlan;
import com.microsoft.azure.management.appservice.v2019_08_01.HostingEnvironmentSite;
import com.microsoft.azure.management.appservice.v2019_08_01.WorkerPools;

/**
 * Type representing AppServiceEnvironments.
 */
public interface AppServiceEnvironments {
    /**
     * Begins definition for a new HostingEnvironment resource.
     * @param name resource name.
     * @return the first stage of the new HostingEnvironment definition.
     */
    AppServiceEnvironmentResource.DefinitionStages.Blank defineHostingEnvironment(String name);

    /**
     * Begins definition for a new WorkerPool resource.
     * @param name resource name.
     * @return the first stage of the new WorkerPool definition.
     */
    WorkerPools.DefinitionStages.Blank defineWorkerPool(String name);

    /**
     * Get the properties of an App Service Environment.
     * Description for Get the properties of an App Service Environment.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceEnvironmentResource> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get all App Service Environments in a resource group.
     * Description for Get all App Service Environments in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceEnvironmentResource> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get all App Service Environments for a subscription.
     * Description for Get all App Service Environments for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServiceEnvironmentResource> listAsync();

    /**
     * Delete an App Service Environment.
     * Description for Delete an App Service Environment.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Move an App Service Environment to a different VNET.
     * Description for Move an App Service Environment to a different VNET.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param vnetInfo Details for the new virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Sites> changeVnetAsync(final String resourceGroupName, final String name, final VirtualNetworkProfile vnetInfo);

    /**
     * Reboot all machines in an App Service Environment.
     * Description for Reboot all machines in an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable rebootAsync(String resourceGroupName, String name);

    /**
     * Resume an App Service Environment.
     * Description for Resume an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Sites> resumeAsync(final String resourceGroupName, final String name);

    /**
     * Suspend an App Service Environment.
     * Description for Suspend an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Sites> suspendAsync(final String resourceGroupName, final String name);

    /**
     * Get the used, available, and total worker capacity an App Service Environment.
     * Description for Get the used, available, and total worker capacity an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<StampCapacity> listCapacitiesAsync(final String resourceGroupName, final String name);

    /**
     * Get IP addresses assigned to an App Service Environment.
     * Description for Get IP addresses assigned to an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddressResponse> getVipInfoAsync(String resourceGroupName, String name);

    /**
     * Get a diagnostics item for an App Service Environment.
     * Description for Get a diagnostics item for an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param diagnosticsName Name of the diagnostics item.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HostingEnvironmentDiagnostics> getDiagnosticsItemAsync(String resourceGroupName, String name, String diagnosticsName);

    /**
     * Get diagnostic information for an App Service Environment.
     * Description for Get diagnostic information for an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HostingEnvironmentDiagnostics> listDiagnosticsAsync(String resourceGroupName, String name);

    /**
     * Get the network endpoints of all inbound dependencies of an App Service Environment.
     * Description for Get the network endpoints of all inbound dependencies of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<InboundEnvironmentEndpoint> getInboundNetworkDependenciesEndpointsAsync(final String resourceGroupName, final String name);

    /**
     * Get all multi-role pools.
     * Description for Get all multi-role pools.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MultiRolePools> listMultiRolePoolsAsync(final String resourceGroupName, final String name);

    /**
     * Get properties of a multi-role pool.
     * Description for Get properties of a multi-role pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MultiRolePools> getMultiRolePoolAsync(String resourceGroupName, String name);

    /**
     * Create or update a multi-role pool.
     * Description for Create or update a multi-role pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param multiRolePoolEnvelope Properties of the multi-role pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MultiRolePools> createOrUpdateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope);

    /**
     * Create or update a multi-role pool.
     * Description for Create or update a multi-role pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param multiRolePoolEnvelope Properties of the multi-role pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MultiRolePools> updateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope);

    /**
     * Get metric definitions for a specific instance of a multi-role pool of an App Service Environment.
     * Description for Get metric definitions for a specific instance of a multi-role pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param instance Name of the instance in the multi-role pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceMetricDefinition> listMultiRolePoolInstanceMetricDefinitionsAsync(final String resourceGroupName, final String name, final String instance);

    /**
     * Get metric definitions for a multi-role pool of an App Service Environment.
     * Description for Get metric definitions for a multi-role pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceMetricDefinition> listMultiRoleMetricDefinitionsAsync(final String resourceGroupName, final String name);

    /**
     * Get metric definitions for a specific instance of a worker pool of an App Service Environment.
     * Description for Get metric definitions for a specific instance of a worker pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param workerPoolName Name of the worker pool.
     * @param instance Name of the instance in the worker pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceMetricDefinition> listWorkerPoolInstanceMetricDefinitionsAsync(final String resourceGroupName, final String name, final String workerPoolName, final String instance);

    /**
     * Get metric definitions for a worker pool of an App Service Environment.
     * Description for Get metric definitions for a worker pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param workerPoolName Name of the worker pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceMetricDefinition> listWebWorkerMetricDefinitionsAsync(final String resourceGroupName, final String name, final String workerPoolName);

    /**
     * Get available SKUs for scaling a multi-role pool.
     * Description for Get available SKUs for scaling a multi-role pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SkuInfo> listMultiRolePoolSkusAsync(final String resourceGroupName, final String name);

    /**
     * Get available SKUs for scaling a worker pool.
     * Description for Get available SKUs for scaling a worker pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param workerPoolName Name of the worker pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SkuInfo> listWorkerPoolSkusAsync(final String resourceGroupName, final String name, final String workerPoolName);

    /**
     * Get usage metrics for a multi-role pool of an App Service Environment.
     * Description for Get usage metrics for a multi-role pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listMultiRoleUsagesAsync(final String resourceGroupName, final String name);

    /**
     * Get global usage metrics of an App Service Environment.
     * Description for Get global usage metrics of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SiteCsmUsageQuota> listUsagesAsync(final String resourceGroupName, final String name);

    /**
     * Get usage metrics for a worker pool of an App Service Environment.
     * Description for Get usage metrics for a worker pool of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param workerPoolName Name of the worker pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listWebWorkerUsagesAsync(final String resourceGroupName, final String name, final String workerPoolName);

    /**
     * List all currently running operations on the App Service Environment.
     * Description for List all currently running operations on the App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Operation> listOperationsAsync(String resourceGroupName, String name);

    /**
     * Get the network endpoints of all outbound dependencies of an App Service Environment.
     * Description for Get the network endpoints of all outbound dependencies of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OutboundEnvironmentEndpoint> getOutboundNetworkDependenciesEndpointsAsync(final String resourceGroupName, final String name);

    /**
     * Get all App Service plans in an App Service Environment.
     * Description for Get all App Service plans in an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HostingEnvironmentAppServicePlan> listAppServicePlansAsync(final String resourceGroupName, final String name);

    /**
     * Get all apps in an App Service Environment.
     * Description for Get all apps in an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HostingEnvironmentSite> listWebAppsAsync(final String resourceGroupName, final String name);

    /**
     * Get properties of a worker pool.
     * Description for Get properties of a worker pool.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @param workerPoolName Name of the worker pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkerPools> getWorkerPoolAsync(String resourceGroupName, String name, String workerPoolName);

    /**
     * Get all worker pools of an App Service Environment.
     * Description for Get all worker pools of an App Service Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkerPools> listWorkerPoolsAsync(final String resourceGroupName, final String name);

}
