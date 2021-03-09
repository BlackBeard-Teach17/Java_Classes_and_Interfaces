package za.co.javatraining;
import java.util.Locale;
import java.util.Scanner;

import static za.co.javatraining.MathEquation.getAverageResult;

public class Main {

    public static void main(String[] args)
    {
        //performCalculations();
        Divider divider = new Divider();
        doCalculation(divider, 10.0d, 5.0d);

        Adder adder = new Adder();
        doCalculation(adder, 30.0d, 70.0d);
        
       // performMoreCalculations();
        //executeInteractively();
        dynamicInteractivity();
    }

    private static void dynamicInteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder()
        });
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
    }

    private static CalculateBase createCalculation(MathOperation operation, double leftVal, double rightVal)
    {
        CalculateBase calculation = null;
        switch (operation)
        {
            case ADD -> calculation = new Adder(leftVal, rightVal);
            case SUBTRACT -> calculation = new Subtractor(leftVal, rightVal);
            case MULTIPLY -> calculation = new Multiplier(leftVal, rightVal);
            case DIVIDE -> calculation = new Divider(leftVal, rightVal);
            default -> System.out.println("Oops");
        }
        return calculation;
    }

    static void executeInteractively()
    {
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase calculation = createCalculation(operation, leftVal, rightVal);
        calculation.calculate();
        System.out.println("Operation performed: " + operation);
        System.out.println(calculation.getResult());
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations = {
                new Divider(100.0d, 50.0d),
                new Subtractor(100.0d, 20.0d),
                new Adder(100.0d, 25.0d),
                new Multiplier(20.0d, 5.0d)
        };
        System.out.println();
        System.out.println("Array calculations");
        for(CalculateBase calculation : calculations)
        {
            calculation.calculate();
            System.out.println("result = " + calculation.getResult());
        }
    }

    static void doCalculation(CalculateBase calculation, double leftValue, double rightVal)
    {
        calculation.setLeftVal(leftValue);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result = " + calculation.getResult());
    }
    private static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(1000.0d, 500.0d, 's');
        equations[2] = new MathEquation(10.0d, 50.0d, 'a');
        equations[3] = new MathEquation(10.0d, 5.0d, 'm');

        for (MathEquation equation : equations)
        {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
        System.out.println("Average result = " + getAverageResult());
        System.out.println();
        System.out.println("Using execute overload methods");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double ld = 9.0d;
        double rd = 4.0d;

        equationOverload.execute(ld, rd);
        System.out.println("Overloaded result with doubles = " + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overloaded result with ints = " + equationOverload.getResult());
    }
}
