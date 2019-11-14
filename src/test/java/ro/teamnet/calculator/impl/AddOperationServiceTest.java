package ro.teamnet.calculator.impl;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddOperationServiceTest {

    private AddOperationService subjectUnderTest;

    @Before
    public void setUp() {
        subjectUnderTest = new AddOperationService();
    }

    @Test
    public void calculate() {
        double actual = subjectUnderTest.calculate(2, 4);
        double expected = 6;
        assertEquals(actual, expected, 0.0);
    }
}