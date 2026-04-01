package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private final GradeCalculator gradeCalculator = new GradeCalculator();

    @Test
    void shouldReturnFourBulls() {
        Grade grade = gradeCalculator.calculateBullsAndCows("1234", "1234");
        assertEquals(4, grade.getBulls());
        assertEquals(0, grade.getCows());
    }

    @Test
    void shouldReturnFourCows() {
        Grade grade = gradeCalculator.calculateBullsAndCows("1234", "4321");
        assertEquals(0, grade.getBulls());
        assertEquals(4, grade.getCows());
    }

    @Test
    void shouldReturnTwoCowsTwoBulls() {
        Grade grade = gradeCalculator.calculateBullsAndCows("1234", "1243");
        assertEquals(2, grade.getBulls());
        assertEquals(2, grade.getCows());
    }

    @Test
    void shouldReturnZero() {
        Grade grade = gradeCalculator.calculateBullsAndCows("1234", "5678");
        assertEquals(0, grade.getBulls());
        assertEquals(0, grade.getCows());
    }

    @Test
    void shouldReturnTwoBulls() {
        Grade grade = gradeCalculator.calculateBullsAndCows("1234", "1222");
        assertEquals(2, grade.getBulls());
        assertEquals(0, grade.getCows());
    }
}