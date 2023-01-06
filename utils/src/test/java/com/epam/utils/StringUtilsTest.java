package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void isPositiveNumber_shouldReturnTrue_whenNumberIsPositive() {
        assertTrue(StringUtils.isPositiveNumber("23"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenNumberIsZero() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenNumberIsNegative() {
        assertFalse(StringUtils.isPositiveNumber("-5"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenArgIsNotANumber() {
        assertFalse(StringUtils.isPositiveNumber("arg"));
    }
}