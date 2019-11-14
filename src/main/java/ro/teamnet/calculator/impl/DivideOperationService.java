package ro.teamnet.calculator.impl;

import ro.teamnet.calculator.interfaces.OperationService;

public class DivideOperationService implements OperationService {
    @Override
    public double calculate(double operatorOne, double operatorTwo) {
        return operatorOne/operatorTwo;
    }
}
