package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks dt = new DailyTasks();

        assertTrue(dt.checkPresence("Wipro Technologies", "Tech"));

        assertFalse(dt.checkPresence("Wipro Technologies", "Java"));
    }
}