package ro.teamnet.calculator.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstractOperationServiceTest {
    private SubtractOperationService subjectUnderTest;

    @Before
    public void setUp() {
        subjectUnderTest = new SubtractOperationService();
    }

    @Test
    public void calculate() {
        double actual = subjectUnderTest.calculate(10, 2);
        double expected = 8;
        assertEquals(actual, expected, 0.0);
    }
}