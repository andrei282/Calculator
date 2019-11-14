package ro.teamnet.calculator.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyOperationServiceTest {

    private MultiplyOperationService multiplyOperationService;

    @Before
    public void setUp() {
        multiplyOperationService = new MultiplyOperationService();
    }

    @Test
    public void calculate() {
        //given
        double operator1 = 3;
        double operator2 = 5;
        //when
        double actual = multiplyOperationService.calculate(operator1, operator2);
        //then
        double expected = 15;
        assertEquals(expected, actual, 0.0);
    }
}