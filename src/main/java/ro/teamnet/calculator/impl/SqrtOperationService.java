package ro.teamnet.calculator.impl;

import ro.teamnet.calculator.interfaces.OperationService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SqrtOperationService implements OperationService {
    @Override
    public double calculate(double operatorOne, double operatorTwo) {
        return Math.pow(operatorOne, 1d/operatorTwo);
    }
}
