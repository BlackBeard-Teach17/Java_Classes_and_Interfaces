package za.co.javatraining;

public class Subtractor extends CalculateBase{
    @Override
    public void calculate()
    {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
