/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.inject.visitor;

import javax.annotation.Nullable;

/**
 * A property element represents a JavaBean property on a {@link ClassElement}.
 *
 * @author graemerocher
 * @since 1.0
 */
public interface PropertyElement extends Element {
    /**
     * @return The type of the property
     */
    @Nullable
    ClassElement getType();

    /**
     * Return true only if the property has a getter but no setter.
     *
     * @return True if the property is read only.
     */
    boolean isReadOnly();
}