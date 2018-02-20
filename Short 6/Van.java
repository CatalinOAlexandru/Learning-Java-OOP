public class Van extends Vehicle
{
    protected double carryweight;
    protected double topspeed;
    public Van(double horsepower, double weight, double cweight, double speed)
    {
        super(horsepower,0.9,weight);
        carryweight = cweight;
        topspeed = speed;
    }
    
    public double getCarryweight()
    {
        return carryweight;
    }
    
    public double acceleration()
    {
        //System.out.println("Acceleration in Van class");
        double result = (100/getHorsepower())*(getAerodynamics()/2)*getWeight()/100;
        return result;
    }
    
    public double getTopspeedVan()
    {
        return topspeed;
    }
}
