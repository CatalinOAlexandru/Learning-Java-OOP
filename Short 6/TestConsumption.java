public class TestConsumption
{
    public static void main(String[]args)
    {
        Vehicle scar1 = new SportCar(200,220,1500);
        Vehicle scar2 = new SportCar(100,170,1000);
        Vehicle scar3 = new SportCar(135,173,1100.2);
        
        Vehicle van1 = new Van(100, 3500, 160.4);
     
        System.out.println("The Acceleration for the 1st car is: "+scar1.acceleration());
        System.out.println("The Acceleration for the 2nd car is: "+scar3.acceleration());
        System.out.println("The Acceleration for the 3rd car is: "+scar3.acceleration());
        System.out.println("The Acceleration for the 3rd car is:"+van1.acceleration());
    }
}