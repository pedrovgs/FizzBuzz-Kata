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

import java.util.LinkedList;
import java.util.List;

/**
 * FizzBuzzMachine it's a little piece of software created to return a String value if some of the next conditions
 * occurs.
 * <p/>
 * If the integer passed as argument isn't multiple of 3 or 5 returns the number.
 * If the integer passed as argument it's equals to 3 or multiple of 3 FizzBuzzMachine returns Fizz.
 * If the integer passed as argument it's equals to 5 or multiple of 5 FizzBuzzMachine returns Buzz.
 * If the integer passed as argument it's multiple of 3 and 5 FizzBuzzMachine returns FizzBuzz.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class FizzBuzzMachine {

    private final FizzBuzzer fizzBuzzer;

    public FizzBuzzMachine() {
        List<Matcher> fizzBuzzMatchers = new LinkedList<Matcher>();
        fizzBuzzMatchers.add(new FizzMatcher());
        fizzBuzzMatchers.add(new BuzzMatcher());
        fizzBuzzer = new FizzBuzzer(fizzBuzzMatchers);
    }

    /**
     * Main FizzBuzzMachine method. This method will check if the number passed as parameter is fulfilling the condition
     * and will return the Fizz, Buzz or FizzBuzz value.
     *
     * @param value to analyze.
     * @return Fizz if the value is multiple of 3
     * Buzz if the value is multiple of 5
     * FizzBuzz if the value is multiple of 3 and 5
     * the value if the parameter isn't multiple of 3 or 5
     */
    public String execute(Integer value) {
        String result = fizzBuzzer.execute(value);
        return result.isEmpty() ? value.toString() : result;
    }

}
