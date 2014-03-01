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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class created to check the correct behaviour of FizzBuzzMachine program. FuzzBuzzMachine it's a little program
 * created to return some console output when some of the next conditions appears in a set of integers. The behaviour
 * it's described in the class javadoc.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
public class FizzBuzzMachineTest {

    /*
     * Constants
     */

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final String FIZZBUZZ = "FIZZBUZZ";

    /*
     * Test data
     */

    private FizzBuzzMachine fizzBuzzMachine;

    /*
     * Before and after methods
     */

    @Before
    public void setUp() throws Exception {
        fizzBuzzMachine = new FizzBuzzMachine();
    }

    /*
     * Test methods
     */

    @Test
    public void shouldReturnFizzWithTheValueThree() {
        assertEquals(FIZZ, fizzBuzzMachine.execute(3));
    }

    @Test
    public void shouldReturnBuzzWithTheValueFive() {
        assertEquals(BUZZ, fizzBuzzMachine.execute(5));
    }

    @Test
    public void shouldReturnFizzBuzzWithTheValueFifteen() {
        assertEquals(FIZZBUZZ, fizzBuzzMachine.execute(15));
    }

    @Test
    public void shouldReturnTheValueWithNoMultipleValue() {
        assertEquals("7", fizzBuzzMachine.execute(7));
    }

    @Test
    public void shouldReturnFizzWithAMultipleOfThree() {
        assertEquals(FIZZ, fizzBuzzMachine.execute(9));
    }

    @Test
    public void shouldReturnBuzzWithAMultipleOfFive() {
        assertEquals(BUZZ, fizzBuzzMachine.execute(50));
    }

    @Test
    public void shouldReturnFizzBuzzWithAMultipleOfThreeAndFive() {
        assertEquals(FIZZBUZZ, fizzBuzzMachine.execute(90));
    }


}
