public class Vehicle
{
    protected double horsepower;
    protected double aerodynamics;
    protected double weight;
    public Vehicle(double hp, double aero,double weightt)
    {
        horsepower = hp;
        aerodynamics =aero;
        weight = weightt;
    }
    public double getHorsepower()
    {
        return horsepower;
    }
    public double getAerodynamics()
    {
        return aerodynamics;
    }
    public double getWeight()
    {
        return weight;
    }
}