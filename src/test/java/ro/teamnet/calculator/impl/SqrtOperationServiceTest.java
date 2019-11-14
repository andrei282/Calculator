package ro.teamnet.calculator.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtOperationServiceTest {
    private SqrtOperationService subjectUnderTest;

    @Before
    public void setUp() {
        subjectUnderTest = new SqrtOperationService();
    }

    @Test
    public void calculateSqrt2() {
        double actual = subjectUnderTest.calculate(64, 2);
        double expected = 8;
        assertEquals(actual, expected, 0.0);
    }

    @Test
    public void calculateSqrt3() {
        double actual = subjectUnderTest.calculate(64, 3);
        double expected = 4;
        assertEquals(actual, expected, 0.000001);
    }
}