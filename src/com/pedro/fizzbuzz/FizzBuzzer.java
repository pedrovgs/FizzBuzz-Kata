package com.pedro.fizzbuzz;

import java.util.List;

/**
 * Main business logic class created to represent an entity created with a matcher list that are going to evaluate all the params
 * passed in the execute method. The result of the execute method will be the string concatenation of the matcher's
 * result. This entity never return a null value in the execute method. If there is no any matching this class return
 * an empty response.
 */
public class FizzBuzzer {

    /*
     * Attributes
     */

    private List<Matcher> matcherList;

    /*
     * Constructor
     */

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