public class TestConsumption
{
    public static void main(String[]args)
    {
        SportCar scar1 = new SportCar(200,220,1500);
        SportCar scar2 = new SportCar(100,170,1000);
        SportCar scar3 = new SportCar(135,173,1100.2);
        
        double carConsumption1=(1000+(scar1.getWeight()/5))*(scar1.getTopspeedCar()/100)*(scar1.getAerodynamics()*scar1.getHorsepower())/10000;
        double carConsumption2=(1000+(scar2.getWeight()/5))*(scar2.getTopspeedCar()/100)*(scar2.getAerodynamics()*scar2.getHorsepower())/10000;
        double carConsumption3=(1000+(scar3.getWeight()/5))*(scar3.getTopspeedCar()/100)*(scar3.getAerodynamics()*scar3.getHorsepower())/10000;
        
        System.out.println("The Fuel Consumption for the 1st car is: "+carConsumption1);
        System.out.println("The Fuel Consumption for the 2nd car is: "+carConsumption2);
        System.out.println("The Fuel Consumption for the 3rd car is: "+carConsumption3);
    }
}