package za.co.javatraining;

public class Adder extends CalculateBase{
    @Override
    public void calculate()
    {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
