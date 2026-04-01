package org.example;

import org.junit.jupiter.api.Test;

import javax.naming.directory.InvalidAttributeIdentifierException;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    private final Validator validator = new Validator();

    @Test
    void isValidGuess_Valid() {
        assertTrue(validator.isValidGuess("1234"));
        assertTrue(validator.isValidGuess("9876"));
    }

    @Test
    void isValidGuess_WrongLength(){
        assertFalse(validator.isValidGuess(""));
        assertFalse(validator.isValidGuess("123"));
    }

    @Test
    void isValidGuess_WrongSymbols(){
        assertFalse(validator.isValidGuess("123."));
        assertFalse(validator.isValidGuess("abcd"));
    }
}