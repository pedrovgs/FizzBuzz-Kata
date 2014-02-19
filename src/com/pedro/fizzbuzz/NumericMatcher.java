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
        return value % getValueToDivide() == 0 ? output : "";
    }

    protected abstract int getValueToDivide();

    protected abstract String getOutput();
}
