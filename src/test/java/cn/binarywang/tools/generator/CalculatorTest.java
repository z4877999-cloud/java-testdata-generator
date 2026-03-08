package cn.binarywang.tools.generator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(calculator.add(1.5, 2.5), 4.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(5, 3), 2.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(2, 3.5), 7.0);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(10, 4), 2.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}
