package services;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void calc() {
        calculator.calc("DODAWANIE", 1, 2, 3);
        assertEquals(2, calculator.getNumbers().get(1));
    }

    @Test
    void calcSumTrue() {
        ArrayList testNumbers = new ArrayList();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        assertEquals(6, calculator.calcSum(testNumbers));
    }

    @Test
    void onlyIntsTrue(){
        assertTrue(calculator.onlyInts(1,2,78));
    }

    @Test
    void onlyIntsFalse(){
        assertFalse(calculator.onlyInts(1,2,null));
    }
}
