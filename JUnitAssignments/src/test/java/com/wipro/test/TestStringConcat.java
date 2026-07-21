package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks dt = new DailyTasks();

        String actual = dt.doStringConcat("Hello", "World");

        assertEquals("Hello World", actual);
    }
}