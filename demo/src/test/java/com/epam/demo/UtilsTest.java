package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    public void isAllPositiveNumbers_shouldReturnTrue_whenAllPositive() {
        List<String> args = Arrays.asList("1", "2", "3");

        assertTrue(Utils.isAllPositiveNumbers(args));
    }

    @Test
    public void isAllPositiveNumbers_shouldReturnFalse_whenAllZeros() {
        List<String> args = Arrays.asList("0", "0", "0");

        assertFalse(Utils.isAllPositiveNumbers(args));
    }

    @Test
    public void isAllPositiveNumbers_shouldReturnFalse_whenAllNegative() {
        List<String> args = Arrays.asList("-1", "-2", "-3");

        assertFalse(Utils.isAllPositiveNumbers(args));
    }

    @Test
    public void isAllPositiveNumbers_shouldReturnFalse_whenOnlyOneNegative() {
        List<String> args = Arrays.asList("1", "-2", "3");

        assertFalse(Utils.isAllPositiveNumbers(args));
    }

    @Test
    public void isAllPositiveNumbers_shouldReturnFalse_whenArgsAreNotNumbers() {
        List<String> args = Arrays.asList("A", "B", "C");

        assertFalse(Utils.isAllPositiveNumbers(args));
    }
}