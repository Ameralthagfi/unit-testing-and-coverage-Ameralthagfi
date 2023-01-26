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
        assertEquals(4,calc.add(2,2));
        assertEquals(5,calc.add(2,3));
    }
    @Test
    void shouldReturnGradeLetters(){
        // TODO
        assertEquals("F",calc.getGradeLetter(0));
        assertEquals("D",calc.getGradeLetter(60));
        assertEquals("D+",calc.getGradeLetter(65));
        assertEquals("C",calc.getGradeLetter(70));
        assertEquals("C+",calc.getGradeLetter(75));
        assertEquals("B",calc.getGradeLetter(80));
        assertEquals("B+",calc.getGradeLetter(85));
        assertEquals("A",calc.getGradeLetter(90));
        assertEquals("A+",calc.getGradeLetter(95));

    }

    @Test
    void shouldTestNegativeGrade(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(-10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.getGradeLetter(101);
        });
    }
}