package com.pedro.fizzbuzz;

/**
 *
 * Matcher implementation created to return the "Fizz" value if the value passed as argument in the evaluate method
 * is 3 or multiple of 3.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
class FizzMatcher implements Matcher {

    /*
     * Constants
     */
    private final static String FIZZ = "FIZZ";

    /*
     * Implemented methods
     */

    @Override
    public String evaluate(int value) {
        return value % 3 == 0 ? FIZZ : "";
    }
}
