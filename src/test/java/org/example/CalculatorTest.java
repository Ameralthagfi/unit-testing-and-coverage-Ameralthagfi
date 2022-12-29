package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CalculatorTest
{
    private final Calculator calc = new Calculator();
    @Test
    void shouldAddTwoNumbers(){
        // TODO
        assertEquals(2,2);
    }
    @Test
    void shouldReturnGradeLetters(){
        // TODO
        assertEquals(2,2);
    }

    @Test
    void shouldTestNegativeGrade(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(-10);
        });
    }
}
