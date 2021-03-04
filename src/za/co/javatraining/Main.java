package za.co.javatraining;

public class Main {

    public static void main(String[] args)
    {
        performCalculations();
    }

    private static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(1000.0d, 500.0d, 's');
        equations[2] = create(10.0d, 50.0d, 'a');
        equations[0] = create(10.0d, 5.0d, 'm');

        for (MathEquation equation : equations)
        {
            equation.execute();
            System.out.println("result = " + equation.result);
        }
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }
}
