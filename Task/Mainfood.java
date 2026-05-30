import java.util.*;

class Food 
{
    private String name;
    private int price;

    Food(String name, int price) 
	{
        this.name = name;
        this.price = price;
    }

    String getName() 
	{
        return name;
    }

    int getPrice() 
	{
        return price;
    }
}

class Restaurant 
{
    void generateBill() 
	{
        System.out.println("Generating Bill...");
    }
}

class FoodOrder extends Restaurant 
{

    HashMap<String, Food> menu = new HashMap<>();
    ArrayList<String> orders = new ArrayList<>();

    FoodOrder() 
	{
        menu.put("Chicken Biryani", new Food("Chicken Biryani", 120));
        menu.put("Egg Biryani", new Food("Egg Biryani", 100));
        menu.put("Veg Biryani", new Food("Veg Biryani", 90));
        menu.put("Mutton Biryani", new Food("Mutton Biryani", 180));
        menu.put("Pizza", new Food("Pizza", 250));
        menu.put("Burger", new Food("Burger", 150));
        menu.put("Fried Rice", new Food("Fried Rice", 130));
        menu.put("Chicken Mandi", new Food("Chicken Mandi", 500));
        menu.put("Ice Cream", new Food("Ice Cream", 60));
        menu.put("Cool Drinks", new Food("Cool Drinks", 40));
    }

    void displayMenu() 
	{
        System.out.println("....MENU....");
        for (Food food : menu.values()) 
		{
            System.out.println(food.getName() + " : Rs." + food.getPrice());
        }
    }

    void addItem(String item) 
	{
        if (menu.containsKey(item)) 
		{
            orders.add(item);
            System.out.println(item + " added successfully.");
        } 
		else 
		{
            System.out.println("Item not available.");
        }
    }

    void calculateDiscount(int total) 
	{
        if (total > 500) 
		{
            double discount = total * 0.10;
            double finalAmount = total - discount;

            System.out.println("Discount : Rs." + discount);
            System.out.println("Final Amount : Rs." + finalAmount);
        } 
		else 
		{
            System.out.println("No Discount Applied");
            System.out.println("Final Amount : Rs." + total);
        }
    }

    @Override
    void generateBill() 
	{
        int total = 0;

        System.out.println("....TOTAL BILL ....");

        for (String item : orders) 
		{
            Food food = menu.get(item);
            System.out.println(food.getName() + " : Rs." + food.getPrice());
            total += food.getPrice();
        }

        System.out.println("Total Amount : Rs." + total);

        calculateDiscount(total);
    }
}
class Mainfood 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        FoodOrder order = new FoodOrder();
        order.displayMenu();
        System.out.print("How many items do you want to order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) 
		{
            System.out.print("Enter item " + i + ": ");
            String item = sc.nextLine();
            order.addItem(item);
        }
        order.generateBill();
        sc.close();
    }
}