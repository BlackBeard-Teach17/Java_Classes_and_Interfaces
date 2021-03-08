package za.co.javatraining;
import static za.co.javatraining.MathEquation.getAverageResult;

public class Main {

    public static void main(String[] args)
    {
        //performCalculations();
        Divider divider = new Divider();
        doCalculation(divider, 10.0d, 5.0d);

        Adder adder = new Adder();
        doCalculation(adder, 30.0d, 70.0d);
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
