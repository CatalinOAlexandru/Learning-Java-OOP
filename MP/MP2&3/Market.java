
public class Market
{
    protected double Value;
    protected double HighestValue;
    protected double Volume;
    protected double M24High;
    protected double M24Low;
    
    public Market(double value, double HighestValue, double Volume, double M24High, double M24Low)
    {
        Value = value;
        HighestValue = HighestValue;
        Volume = Volume;
        M24High = M24High;
        M24Low = M24Low;
    }
    public double getValue()
    {
        return Value;
    }
    public double getHighestValue()
    {
        return HighestValue;
    }
    public double getVolume()
    {
        return Volume;
    }
    public double getM24High()
    {
        return M24High;
    }
    public double getM24Low()
    {
        return M24Low;
    }
}
