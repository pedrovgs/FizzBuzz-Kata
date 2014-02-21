package com.pedro.fizzbuzz;

/**
 * Matcher implementation created to return the "Buzz" value if the value passed as argument in the evaluate method
 * is 5 or multiple of 5.
 * <p/>
 * This implementation it's based in a NumericMatcher.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
class BuzzMatcher extends NumericMatcher {

     /*
     * Constants
     */

    private final static int VALUE_TO_DIVIDE = 5;
    private final static String BUZZ = "BUZZ";


    /*
     * Implemented methods
     */

    @Override
    protected int getValueToDivide() {
        return VALUE_TO_DIVIDE;
    }

    @Override
    protected String getOutput() {
        return BUZZ;
    }
}
