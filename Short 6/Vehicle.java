public class Vehicle
{
    private double horsepower;
    private double aerodynamics;
    private double weight;
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

    public double acceleration()
    {
        //System.out.println("Acceleration in Vehicle method");
        double result = (100/horsepower)*aerodynamics*weight/100;
        return result;
    }
}