package com.pedro.fizzbuzz;

/**
 * Matcher implementation created to return the "Fizz" value if the value passed as argument in the evaluate method
 * is 3 or multiple of 3.
 * <p/>
 * This implementation it's based in a NumericMatcher.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
class FizzMatcher extends NumericMatcher {

    /*
     * Constants
     */

    private final static int VALUE_TO_DIVIDE = 3;
    private final static String FIZZ = "FIZZ";


    /*
     * Implemented methods
     */

    @Override
    protected int getValueToDivide() {
        return VALUE_TO_DIVIDE;
    }

    @Override
    protected String getOutput() {
        return FIZZ;
    }
}
