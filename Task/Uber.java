class Customer 
{

    void booking() 
	{
        System.out.println("Customer is trying to book..");
    }
}
class Auto extends Customer
{
    @Override
    void booking() 
	{
        double charge = 150;
        System.out.println("Charge for Auto is: $" + charge);
    }
}
class Car extends Customer
{
    @Override
    void booking() 
	{
        double charge = 250;
        System.out.println("Charge for Car is: $" + charge);
    }
}
class Bike extends Customer 
{
    @Override
    void booking()
	{
        double charge = 50;
        System.out.println("Charge for Bike is: $" + charge);
    }
}
public class Uber 
{
    public static void main(String[] args) 
	{
        Auto a = new Auto();
        Car c = new Car();
        Bike b = new Bike();
        a.booking();
		c.booking();
		b.booking();
    }
}