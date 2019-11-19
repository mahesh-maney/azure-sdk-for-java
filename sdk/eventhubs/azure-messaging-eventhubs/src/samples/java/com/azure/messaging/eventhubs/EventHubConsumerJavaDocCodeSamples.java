// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.util.IterableStream;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.PartitionEvent;

import java.time.Duration;
import java.time.Instant;

/**
 * Code snippets demonstrating various {@link EventHubConsumerClient} scenarios.
 */
public class EventHubConsumerJavaDocCodeSamples {
    /**
     * Code snippet for creating an EventHubConsumer
     *
     */
    public void instantiate() {
        // BEGIN: com.azure.messaging.eventhubs.eventhubconsumerclient.instantiation
        // The required parameters are `consumerGroup` and a way to authenticate with Event Hubs using credentials.
        EventHubConsumerClient consumer = new EventHubClientBuilder()
            .connectionString("event-hub-instance-connection-string")
            .consumerGroup("$DEFAULT")
            .buildConsumer();
        // END: com.azure.messaging.eventhubs.eventhubconsumerclient.instantiation

        consumer.close();
    }

    /**
     * Receives event data from a single partition.
     */
    public void receive() {
        EventHubConsumerClient consumer = new EventHubClientBuilder()
            .connectionString("event-hub-instance-connection-string")
            .consumerGroup(EventHubClientBuilder.DEFAULT_CONSUMER_GROUP_NAME)
            .buildConsumer();

        // BEGIN: com.azure.messaging.eventhubs.eventhubconsumerclient.receive#string-int-eventposition-duration
        Instant twelveHoursAgo = Instant.now().minus(Duration.ofHours(12));
        EventPosition startingPosition = EventPosition.fromEnqueuedTime(twelveHoursAgo);

        // Obtain partitionId from EventHubConsumerClient.getPartitionIds().
        String partitionId = "0";

        // Begins reading events from partition '0' and returns the first 100 received or until the wait time of 30
        // seconds has elapsed.
        IterableStream<PartitionEvent> events = consumer.receiveFromPartition(partitionId, 100,
            startingPosition, Duration.ofSeconds(30));

        for (PartitionEvent partitionEvent : events) {
            // For each event, perform some sort of processing.
            System.out.print("Event received: " + partitionEvent.getData().getSequenceNumber());
        }

        // Gets the next set of events from partition '0' to consume and process.
        IterableStream<PartitionEvent> nextEvents = consumer.receiveFromPartition(partitionId, 100,
            startingPosition, Duration.ofSeconds(30));
        // END: com.azure.messaging.eventhubs.eventhubconsumerclient.receive#string-int-eventposition-duration

        for (PartitionEvent partitionEvent : nextEvents) {
            // For each event, perform some sort of processing.
            System.out.print("Event received: " + partitionEvent.getData().getSequenceNumber());
        }
    }
}
