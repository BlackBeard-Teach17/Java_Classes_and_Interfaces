package za.co.javatraining;

public class MathEquation {
    double leftVal;
    double rightVal;
    public MathEquation()
    {

    }
    public  MathEquation(char opCode)
    {
        this.opCode = opCode;
    }
    public MathEquation(double leftVal, double rightVal, char opCode) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    char opCode;
    double result;

    void execute()
    {
        switch (opCode) {
            case 'a' -> result = leftVal + rightVal;
            case 's' -> result = leftVal - rightVal;
            case 'm' -> result = leftVal * rightVal;
            case 'd' -> result = rightVal != 0 ? leftVal / rightVal : 0.0d;
            default -> {
                System.out.println("Invalid op code!!" + opCode);
                result = 0.0d;
            }
        }
    }
}
