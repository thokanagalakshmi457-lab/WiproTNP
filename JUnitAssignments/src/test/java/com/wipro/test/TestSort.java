package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks dt = new DailyTasks();

        int[] input = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};

        assertArrayEquals(expected, dt.sortValues(input));
    }
}