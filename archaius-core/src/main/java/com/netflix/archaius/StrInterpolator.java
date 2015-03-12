/**
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.archaius;

/**
 * API for interpolating a string.  
 * 
 * For example,
 * 
 * foo=abc
 * 
 * resolve("123-$foo") -> 123-abc
 * 
 * @author elandau
 *
 */
public interface StrInterpolator {
    /**
     * Resolve a string with replaceable variables using the provided map to lookup replacement
     * values.  The implementation should deal with nested replacements and throw an exception
     * for infinite recursion. 
     * 
     * @param key
     * @param lookup
     * @return
     */
    Object resolve(String key);
}
