package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void isPositiveNumber_shouldReturnTrue_whenNumberIsPositiveInt() {
        assertTrue(StringUtils.isPositiveNumber("23"));
    }

    @Test
    public void isPositiveNumber_shouldReturnTrue_whenNumberIsPositiveFractional() {
        assertTrue(StringUtils.isPositiveNumber("0.25"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenNumberIsZero() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenNumberIsNegativeInt() {
        assertFalse(StringUtils.isPositiveNumber("-5"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenNumberIsNegativeFractional() {
        assertFalse(StringUtils.isPositiveNumber("-0.01"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenArgIsNotANumber() {
        assertFalse(StringUtils.isPositiveNumber("arg"));
    }

    @Test
    public void isPositiveNumber_shouldReturnFalse_whenArgIsEmpty() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }
}