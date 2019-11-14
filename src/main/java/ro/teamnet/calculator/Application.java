package ro.teamnet.calculator;

import ro.teamnet.calculator.impl.*;
import ro.teamnet.calculator.interfaces.OperationService;

public class Application {
    public static void main(String[] args) {
        final OperationService addService = new AddOperationService();
        final OperationService subtractService = new SubtractOperationService();
        final OperationService multiplyService = new MultiplyOperationService();
        final OperationService divideService = new DivideOperationService();
        final OperationService sqrtOperationService = new SqrtOperationService();

        Calculator calculator = new Calculator(
                addService,
                subtractService,
                multiplyService,
                divideService,
                sqrtOperationService
        );

        /*System.out.println(calculator.add(1d, 1d));
        System.out.println(calculator.sqrt(64d, 3d));*/

        //calculator.equationCalculator("5/4+2*3-1");
    }
}
