abstract class FoodOrder
{
    String customerName;
    int quantity;
    double price;

    FoodOrder(String customerName, int quantity, double price)
    {
        this.customerName = customerName;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill()
    {
        double total = quantity * price;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + price);
        System.out.println("Total Bill: " + total);
    }
}

class PizzaOrder extends FoodOrder
{
    PizzaOrder(String customerName, int quantity, double price)
    {
        super(customerName, quantity, price);
    }

    void orderFood()
    {
        System.out.println("Pizza Order Confirmed");
    }

    double calculateDiscount()
    {
        double total = quantity * price;
        return total * 0.20; 
    }

    double finalAmount()
    {
        double total = quantity * price;
        return total - calculateDiscount();
    }
}

class Main
{
    public static void main(String args[])
    {
        PizzaOrder p = new PizzaOrder("Harsha", 5, 119);

        p.orderFood();
        p.generateBill();

        System.out.println("Discount: " + p.calculateDiscount());
        System.out.println("Final Amount: " + p.finalAmount());
    }
}