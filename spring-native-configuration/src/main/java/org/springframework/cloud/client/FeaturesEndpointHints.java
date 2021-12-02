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

package org.springframework.cloud.client;

import org.springframework.cloud.client.actuator.FeaturesEndpoint;
import org.springframework.nativex.hint.TypeAccess;
import org.springframework.nativex.type.NativeConfiguration;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;

@NativeHint(trigger = CommonsClientAutoConfiguration.ActuatorConfiguration.class, types = {
		@TypeHint(types = FeaturesEndpoint.class, access = { TypeAccess.DECLARED_CONSTRUCTORS, TypeAccess.DECLARED_METHODS, TypeAccess.PUBLIC_METHODS }),
		@TypeHint(typeNames = {
				"org.springframework.cloud.client.actuator.FeaturesEndpoint$Features",
				"org.springframework.cloud.client.actuator.FeaturesEndpoint$Feature"
		}, access = { TypeAccess.DECLARED_CONSTRUCTORS, TypeAccess.DECLARED_METHODS}) })
public class FeaturesEndpointHints implements NativeConfiguration {
}
