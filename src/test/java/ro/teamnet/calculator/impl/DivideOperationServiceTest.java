package ro.teamnet.calculator.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideOperationServiceTest {
    private DivideOperationService subjectUnderTest;

    @Before
    public void setUp() {
        subjectUnderTest = new DivideOperationService();
    }

    @Test
    public void calculate() {
        double actual = subjectUnderTest.calculate(10, 2);
        double expected = 5;
        assertEquals(actual, expected, 0.0);
    }
}