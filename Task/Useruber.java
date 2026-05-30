import java.util.Scanner;
class Customer 
{
    void booking() 
	{
        System.out.println("Customer is trying to book...");
    }
}

class Auto extends Customer 
{
    @Override
    void booking()
	{
        System.out.println("Auto Booked");
    }
}

class Car extends Customer 
{
    @Override
    void booking() 
	{
        System.out.println("Car Booked");
    }
}

class Bike extends Customer 
{
    @Override
    void booking()
	{
        System.out.println("Bike Booked");
    }
}

class Useruber 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Charge: ");
        int charge = sc.nextInt();
        Customer c;
        if (charge == 50) 
		{
           c = new Bike();
        }
        else if (charge == 150) 
		{
            c = new Auto();
        }
        else if (charge == 250) 
		{
            c = new Car();
        }
        else
		{
            System.out.println("No vehicle available for this charge.");
            sc.close();
            return;
        }
        c.booking();
        sc.close();
    }
}