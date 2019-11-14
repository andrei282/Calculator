package ro.teamnet.calculator;

import ro.teamnet.calculator.interfaces.OperationService;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final OperationService addService;
    private final OperationService subtractService;
    private final OperationService multiplyService;
    private final OperationService divideService;
    private final OperationService sqrtOperationService;

    Calculator(final OperationService addService,
               final OperationService subtractService,
               final OperationService multiplyService,
               final OperationService divideService,
               final OperationService sqrtOperationService) {
        this.addService = addService;
        this.subtractService = subtractService;
        this.multiplyService = multiplyService;
        this.divideService = divideService;
        this.sqrtOperationService = sqrtOperationService;
    }

    public double add(final double operatorOne, final double operatorTwo){
        return addService.calculate(operatorOne,operatorTwo);
    }

    public double subtract(final double operatorOne, final double operatorTwo){
        return subtractService.calculate(operatorOne,operatorTwo);
    }

    public double multiply(final double operatorOne, final double operatorTwo){
        return multiplyService.calculate(operatorOne,operatorTwo);
    }

    public double divide(final double operatorOne, final double operatorTwo){
        return divideService.calculate(operatorOne,operatorTwo);
    }

    public double sqrt(final double operatorOne, final double operatorTwo){
        return sqrtOperationService.calculate(operatorOne, operatorTwo);
    }

    /*public void equationCalculator(String equation){
        double finalResult = 0;
        List<Double> values = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        for(char c : equation.toCharArray()){
            if(Character.isDigit(c)){
                values.add((double) (c-'0'));
            }
            else{
                operators.add(c);
            }
        }
        double operatorOne, operatorTwo;
        int valuesLimit = values.size();
        int operatorsLimit = operators.size();
        for(int i=0; i<valuesLimit; i++){
            if(i+1<valuesLimit){
                operatorOne = values.get(i);
                operatorTwo = values.get(i+1);
            }
            switch(operators.get(i)) {
                case '*':
                    if (i + 1 < operatorsLimit)
                        if (operators.get(i + 1).compareTo('/') || operators.get(i + 1).compareTo('*'))
            }
        }
    }*/
}
