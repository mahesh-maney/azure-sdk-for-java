// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.ResultType;
import com.azure.management.monitor.TimeSeriesInformation;
import java.time.Duration;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * MetricBaselines.
 */
public final class MetricBaselinesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private MetricBaselinesService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of MetricBaselinesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    MetricBaselinesInner(MonitorClientImpl client) {
        this.service = RestProxy.create(MetricBaselinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetricBaselines
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetricBaselines")
    private interface MetricBaselinesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/microsoft.insights/baseline/{metricName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<BaselineResponseInner>> get(@HostParam("$host") String host, @PathParam(value = "resourceUri", encoded = true) String resourceUri, @PathParam("metricName") String metricName, @QueryParam("timespan") String timespan, @QueryParam("interval") Duration interval, @QueryParam("aggregation") String aggregation, @QueryParam("sensitivities") String sensitivities, @QueryParam("resultType") ResultType resultType, @QueryParam("api-version") String apiVersion);

        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Post("/{resourceUri}/providers/microsoft.insights/calculatebaseline")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<CalculateBaselineResponseInner>> calculateBaseline(@HostParam("$host") String host, @PathParam(value = "resourceUri", encoded = true) String resourceUri, @QueryParam("api-version") String apiVersion, @BodyParam("application/json") TimeSeriesInformation timeSeriesInformation);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     * 
     * @param resourceUri 
     * @param metricName 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<BaselineResponseInner>> getWithResponseAsync(String resourceUri, String metricName, String timespan, Duration interval, String aggregation, String sensitivities, ResultType resultType) {
        final String apiVersion = "2017-11-01-preview";
        return service.get(this.client.getHost(), resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, apiVersion);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     * 
     * @param resourceUri 
     * @param metricName 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BaselineResponseInner> getAsync(String resourceUri, String metricName, String timespan, Duration interval, String aggregation, String sensitivities, ResultType resultType) {
        return getWithResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType)
            .flatMap((SimpleResponse<BaselineResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     * 
     * @param resourceUri 
     * @param metricName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BaselineResponseInner> getAsync(String resourceUri, String metricName) {
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final ResultType resultType = null;
        return getWithResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType)
            .flatMap((SimpleResponse<BaselineResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     * 
     * @param resourceUri 
     * @param metricName 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BaselineResponseInner get(String resourceUri, String metricName, String timespan, Duration interval, String aggregation, String sensitivities, ResultType resultType) {
        return getAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).block();
    }

    /**
     * **Gets the baseline values for a specific metric**.
     * 
     * @param resourceUri 
     * @param metricName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BaselineResponseInner get(String resourceUri, String metricName) {
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final ResultType resultType = null;
        return getAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).block();
    }

    /**
     * **Lists the baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CalculateBaselineResponseInner>> calculateBaselineWithResponseAsync(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        final String apiVersion = "2017-11-01-preview";
        return service.calculateBaseline(this.client.getHost(), resourceUri, apiVersion, timeSeriesInformation);
    }

    /**
     * **Lists the baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CalculateBaselineResponseInner> calculateBaselineAsync(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineWithResponseAsync(resourceUri, timeSeriesInformation)
            .flatMap((SimpleResponse<CalculateBaselineResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * **Lists the baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CalculateBaselineResponseInner calculateBaseline(String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineAsync(resourceUri, timeSeriesInformation).block();
    }
}