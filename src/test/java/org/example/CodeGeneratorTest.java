package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CodeGeneratorTest {

    private final CodeGenerator codeGenerator = new CodeGenerator();

    @Test
    void shouldNotReturnNull(){
        assertNotNull(CodeGenerator.createSecretCode());
    }

    @Test
    void shouldNotReturnEmptyString(){
        String code = CodeGenerator.createSecretCode();
        assertFalse(code.isEmpty());
    }

    @Test
    void shouldHaveLengthFour(){
        String code = CodeGenerator.createSecretCode();
        assertEquals(4, code.length());
    }

    @Test
    void shouldContainOnlyDigits(){
        String code = CodeGenerator.createSecretCode();
        assertTrue(code.matches("\\d+"));
    }

    @Test
    void shouldHaveUniqueChars(){
        String code = CodeGenerator.createSecretCode();
        Set<Character> uniqueChars = new HashSet<>();
        for(char c : code.toCharArray()){
            uniqueChars.add(c);
        }
        assertEquals(4, uniqueChars.size());
    }
}














