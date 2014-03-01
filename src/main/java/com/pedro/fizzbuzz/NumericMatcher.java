/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
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
package com.pedro.fizzbuzz;

/**
 * Abstract class created to avoid duplicate code in the numeric matcher that only checks if a value it's multiple of
 * other. All the numeric matchers will evaluate if the argument mod value to divide it's equals to zero and return
 * the output or an empty string.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
abstract class NumericMatcher implements Matcher {

    @Override
    public String evaluate(int value) {
        String defaultResult = "";
        String output = getOutput();
        return value % getValueToDivide() == 0 ? output : defaultResult;
    }

    protected abstract int getValueToDivide();

    protected abstract String getOutput();
}
