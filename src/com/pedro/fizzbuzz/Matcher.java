package com.pedro.fizzbuzz;

/**
 * Interface created to represent a Matcher. An entity that implements this interface will have to implements one method
 * to evaluate an integer and return a string value with the result of the
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
interface Matcher {

    public String evaluate(final int value);
}
