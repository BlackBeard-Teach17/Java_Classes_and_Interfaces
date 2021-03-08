package za.co.javatraining;

public class Divider extends CalculateBase{
    @Override
    public void calculate()
    {
        double value = getRightVal() != 0 ? getLeftVal() / getRightVal() : 0.0d;
        setResult(value);
    }
}
