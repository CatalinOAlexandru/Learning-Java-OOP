public class SportCar extends Vehicle
{   
    protected double topspeed;
    public SportCar(double horsepower,double tspeed, double weight)
    {
        super(horsepower,0.5,weight);
        topspeed = tspeed;
    }
    public double getHorsepower()
    {
        return horsepower;
    }
    public double getAerodynamics()
    {
        return aerodynamics;
    }
    public double getTopspeed()
    {
        return topspeed;
    }
    public double getWeight()
    {
        return weight;
    }
}