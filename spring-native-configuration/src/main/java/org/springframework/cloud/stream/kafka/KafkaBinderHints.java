/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.kafka;

import org.springframework.cloud.stream.binder.kafka.config.KafkaBinderConfiguration;
import org.springframework.cloud.stream.binder.kafka.config.KafkaBinderHealthIndicatorConfiguration;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaBindingProperties;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaExtendedBindingProperties;
import org.springframework.cloud.stream.function.FunctionConfiguration;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.ResourceHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;

@NativeHint(trigger = FunctionConfiguration.class,
		types = {
				@TypeHint(types = {
						KafkaBinderConfiguration.class,
						KafkaBinderHealthIndicatorConfiguration.class,
						KafkaExtendedBindingProperties.class,
						KafkaBindingProperties.class
				}, access = AccessBits.FULL_REFLECTION)
		})
@TypeHint(typeNames = {
		"org.springframework.cloud.stream.function.BindableFunctionProxyFactory",
})
@ResourceHint(patterns = "META-INF/spring.binders")
public class KafkaBinderHints implements NativeConfiguration {
}
