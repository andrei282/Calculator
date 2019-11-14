package ro.teamnet.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ro.teamnet.calculator.impl.*;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private AddOperationService addOperationService;
    @Mock
    private MultiplyOperationService multiplyOperationService;
    @Mock
    private DivideOperationService divideOperationService;
    @Mock
    private SubtractOperationService subtractOperationService;
    @Mock
    private SqrtOperationService sqrtOperationService;

    /**
     * This test will verify the following eq a + b * c
     */
    @Test
    public void eq() {
        //given
        final double a = 2;
        final double b = 3;
        final double c = 5;
        final double expected = 17;

        //when
        when(multiplyOperationService.calculate(3,5)).thenReturn(15d);
        when(addOperationService.calculate(2, 15)).thenReturn(17d);

        //a+b*c
        final double multiplication = multiplyOperationService.calculate(b, c);
        final double actual = addOperationService.calculate(a, multiplication);

        //then
        assertEquals(expected, actual, 0.0);

        //x*y+z/q
        final double x = 2;
        final double y = 9;
        final double z = 3;
        final double q = 15;
        final double expectedResult = 18.2;

        when(multiplyOperationService.calculate(2, 9)).thenReturn(18d);
        when(divideOperationService.calculate(3, 15)).thenReturn(0.2d);
        when(addOperationService.calculate(18, 0.2d)).thenReturn(18.2d);

        final double xMultipliedByY = multiplyOperationService.calculate(x, y);
        final double zDividedByQ = divideOperationService.calculate(z, q);
        final double result = addOperationService.calculate(xMultipliedByY, zDividedByQ);

        assertEquals(expectedResult, result, 0.0);
    }
}