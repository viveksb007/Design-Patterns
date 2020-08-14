package com.thoughtworks.galaxy.converters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void shouldConvertRomanNumberToInteger() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertEquals(10, romanToInteger.convertRomanToInteger("X"));
        assertEquals(2, romanToInteger.convertRomanToInteger("II"));
        assertEquals(4, romanToInteger.convertRomanToInteger("IV"));
        assertEquals(9, romanToInteger.convertRomanToInteger("IX"));
        assertEquals(95, romanToInteger.convertRomanToInteger("XCV"));
        assertEquals(900, romanToInteger.convertRomanToInteger("CM"));
        assertEquals(80, romanToInteger.convertRomanToInteger("LXXX"));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenInvalidRomanNumber() {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.convertRomanToInteger("IL"));
    }

}
