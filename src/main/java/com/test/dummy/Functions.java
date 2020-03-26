package com.test.dummy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Functions {

    public static boolean hasDuplicate(int[] array) {

        if (array.length <= 1)
            return false;

        Set<Integer> set = new HashSet<>();

        for (int item : array) {
            if (!set.add(item))
                return true;
        }

        return false;
    }

    public static boolean hasPair(int[] array, int sum) {

        if (array.length <= 1)
            return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            int expected = sum - array[i];
            if (map.containsKey(expected))
                return true;

            map.put(array[i], expected);
        }

        return false;
    }
}