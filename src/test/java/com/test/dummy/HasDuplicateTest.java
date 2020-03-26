package com.test.dummy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HasDuplicateTest {

    private final int[] array;
    private final boolean expected;

    public HasDuplicateTest(final int[] array, final boolean expected) {
        this.array = array;
        this.expected = expected;
    }

    @Test
    public void testMethod() {
        assertEquals(Functions.hasDuplicate(array), expected);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] { 
            { new int[] { 1 }, false }, 
            { new int[] { 1, 1 }, true },
            { new int[] { 1, 2 }, false }, 
            { new int[] { 1, 2, 1 }, true },
            { new int[] { 1, 2, 3, 4, 5, 6, 1, 4 }, true }, 
            { new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, false } });
    }

}