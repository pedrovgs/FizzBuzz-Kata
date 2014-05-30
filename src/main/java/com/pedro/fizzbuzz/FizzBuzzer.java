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

import java.util.List;

/**
 * Main business logic class created to represent an entity created with a matcher list that are going to evaluate all the params
 * passed in the execute method. The result of the execute method will be the string concatenation of the matcher's
 * result. This entity never return a null value in the execute method. If there is no any matching this class return
 * an empty response.
 */
public class FizzBuzzer {

    private List<Matcher> matcherList;

    public FizzBuzzer(List<Matcher> matcherList) {
        this.matcherList = matcherList;
    }

    /**
     * Use the value passed as argument as argument of the evaluate method for all the matchers stored in matcherList.
     *
     * @param value to evaluate
     * @return the concatenation of all the matcher's evaluate result.
     */
    public String execute(Integer value) {
        return executeMatchers(value);
    }

    private String executeMatchers(Integer value) {
        String result = "";
        for (Matcher matcher : matcherList) {
            result += matcher.evaluate(value);
        }
        return result;
    }
}