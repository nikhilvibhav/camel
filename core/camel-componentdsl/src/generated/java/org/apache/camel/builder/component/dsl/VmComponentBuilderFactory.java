/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.vm.VmComponent;

/**
 * Call another endpoint in the same CamelContext asynchronously.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface VmComponentBuilderFactory {

    /**
     * VM (camel-vm)
     * Call another endpoint in the same CamelContext asynchronously.
     * 
     * Category: core,endpoint
     * Since: 1.1
     * Maven coordinates: org.apache.camel:camel-vm
     */
    static VmComponentBuilder vm() {
        return new VmComponentBuilderImpl();
    }

    /**
     * Builder for the VM component.
     */
    interface VmComponentBuilder extends ComponentBuilder<VmComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default VmComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Sets the default number of concurrent threads processing exchanges.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default VmComponentBuilder concurrentConsumers(int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmComponentBuilder defaultBlockWhenFull(
                boolean defaultBlockWhenFull) {
            doSetProperty("defaultBlockWhenFull", defaultBlockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will be
         * discarded. By default, an exception will be thrown stating that the
         * queue is full. By enabling this option, the calling thread will give
         * up sending and continue, meaning that the message was not sent to the
         * SEDA queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmComponentBuilder defaultDiscardWhenFull(
                boolean defaultDiscardWhenFull) {
            doSetProperty("defaultDiscardWhenFull", defaultDiscardWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, where a configured timeout can be added to the block
         * case. Utilizing the .offer(timeout) method of the underlining java
         * queue.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default VmComponentBuilder defaultOfferTimeout(long defaultOfferTimeout) {
            doSetProperty("defaultOfferTimeout", defaultOfferTimeout);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default VmComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default VmComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the default queue factory.
         * 
         * The option is a:
         * <code>org.apache.camel.component.seda.BlockingQueueFactory<org.apache.camel.Exchange></code> type.
         * 
         * Group: advanced
         */
        default VmComponentBuilder defaultQueueFactory(
                org.apache.camel.component.seda.BlockingQueueFactory<org.apache.camel.Exchange> defaultQueueFactory) {
            doSetProperty("defaultQueueFactory", defaultQueueFactory);
            return this;
        }
        /**
         * Sets the default maximum capacity of the SEDA queue (i.e., the number
         * of messages it can hold).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: advanced
         */
        default VmComponentBuilder queueSize(int queueSize) {
            doSetProperty("queueSize", queueSize);
            return this;
        }
    }

    class VmComponentBuilderImpl
            extends
                AbstractComponentBuilder<VmComponent>
            implements
                VmComponentBuilder {
        @Override
        protected VmComponent buildConcreteComponent() {
            return new VmComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((VmComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "concurrentConsumers": ((VmComponent) component).setConcurrentConsumers((int) value); return true;
            case "defaultBlockWhenFull": ((VmComponent) component).setDefaultBlockWhenFull((boolean) value); return true;
            case "defaultDiscardWhenFull": ((VmComponent) component).setDefaultDiscardWhenFull((boolean) value); return true;
            case "defaultOfferTimeout": ((VmComponent) component).setDefaultOfferTimeout((long) value); return true;
            case "lazyStartProducer": ((VmComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((VmComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "defaultQueueFactory": ((VmComponent) component).setDefaultQueueFactory((org.apache.camel.component.seda.BlockingQueueFactory) value); return true;
            case "queueSize": ((VmComponent) component).setQueueSize((int) value); return true;
            default: return false;
            }
        }
    }
}