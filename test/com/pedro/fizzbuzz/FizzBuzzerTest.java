package com.pedro.fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test created to check the correctness of FizzBuzzer class. This class has been created to evaluate if the matcher
 * passed as parameters in the constructions match with the main evaluate parameter.
 */
public class FizzBuzzerTest {

    /*
     * Constants
     */

    private static final Integer ANY_INTEGER = 0;
    private static final int ONE = 1;
    private static final String MATCHER_ONE_RESULT = "one";
    private static final String MATCHER_TWO_RESULT = "two";
    public static final String EMPTY_RESULT = "";

    /*
     * Test data
     */

    private FizzBuzzer fizzBuzzer;

    /*
     * Mocks
     */

    @Mock
    private Matcher mockedMatcherOne;
    @Mock
    private Matcher mockedMatcherTwo;

    /*
     * Before and after methods
     */

    @Before
    public void setUp() {
        initializeAnnotations();
        initializeFizzBuzzer();
    }


    /*
     * Test methods
     */

    @Test
    public void shouldEvaluateEveryMatcherPasedInConstructor() {
        fizzBuzzer.execute(ANY_INTEGER);

        verify(mockedMatcherOne).evaluate(ANY_INTEGER);
        verify(mockedMatcherTwo).evaluate(ANY_INTEGER);
    }


    @Test
    public void shouldReturnNotNullResult() {
        when(mockedMatcherOne.evaluate(anyInt())).thenReturn(EMPTY_RESULT);
        when(mockedMatcherTwo.evaluate(anyInt())).thenReturn(EMPTY_RESULT);

        String fizzResult = fizzBuzzer.execute(ONE);

        assertEquals(EMPTY_RESULT, fizzResult);
    }

    @Test
    public void shouldReturnTheConcatenationOfTwoMatcherHits() {
        when(mockedMatcherOne.evaluate(ONE)).thenReturn(MATCHER_ONE_RESULT);
        when(mockedMatcherTwo.evaluate(ONE)).thenReturn(MATCHER_TWO_RESULT);

        String fizzResult = fizzBuzzer.execute(ONE);

        String expectedResult = MATCHER_ONE_RESULT + MATCHER_TWO_RESULT;
        assertEquals(expectedResult, fizzResult);
    }

    @Test
    public void shouldReturnOnlyOneMatcherHit() {
        when(mockedMatcherOne.evaluate(ONE)).thenReturn(MATCHER_ONE_RESULT);
        when(mockedMatcherTwo.evaluate(anyInt())).thenReturn("");

        String fizzResult = fizzBuzzer.execute(ONE);

        assertEquals(MATCHER_ONE_RESULT, fizzResult);
    }


    /*
     * Auxiliary methods
     */

    private void initializeAnnotations() {
        MockitoAnnotations.initMocks(this);
    }

    private void initializeFizzBuzzer() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(mockedMatcherOne);
        matchers.add(mockedMatcherTwo);
        fizzBuzzer = new FizzBuzzer(matchers);
    }

}
