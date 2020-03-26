package com.test.dummy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HasPairTest {

    private final int[] array;
    private final int sum;
    private final boolean expected;

    public HasPairTest(final int[] array, final int sum, final boolean expected) {
        this.array = array;
        this.sum = sum;
        this.expected = expected;
    }

    @Test
    public void testMethod() {
        assertEquals(Functions.hasPair(array, sum), expected);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] { 
            { new int[] { 1 }, 10, false }, 
            { new int[] { 1, 1 }, 10, false },                
            { new int[] { 1, 9 }, 10, true }, 
            { new int[] { 1, 2, 1 }, 10, false },
            { new int[] { 1, 2, 3, 7, 8, 9 }, 10, true }, 
            { new int[] { 1, 2, 3, 4, 5 }, 10, false }, 
            { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 10, true } });
    }

}