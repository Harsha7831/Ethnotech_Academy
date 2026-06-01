import java.util.*;

class FoodOrder {
    HashMap<String, Integer> menu = new HashMap<>();
    ArrayList<String> orders = new ArrayList<>();

    FoodOrder() {
        menu.put("Chicken Biryani", 120);
        menu.put("Egg Biryani", 100);
        menu.put("Veg Biryani", 90);
        menu.put("Pizza", 250);
        menu.put("Ice Cream", 60);
    }

    void displayMenu() {
        System.out.println("----- MENU -----");
        for (Map.Entry<String, Integer> item : menu.entrySet()) {
            System.out.println(item.getKey() + " : Rs." + item.getValue());
        }
    }

    void addItem(String item) {
        if (menu.containsKey(item)) {
            orders.add(item);
            System.out.println(item + " added successfully.");
        } else {
            System.out.println("Item not available.");
        }
    }

    void removeItem(String item) {
        if (orders.remove(item)) {
            System.out.println(item + " removed successfully.");
        } else {
            System.out.println("Item not found in your order.");
        }
    }

    void generateBill() {
        int total = 0;

        System.out.println("\n----- BILL -----");
        for (String item : orders) {
            System.out.println(item + " : Rs." + menu.get(item));
            total += menu.get(item);
        }

        System.out.println("Total Amount = Rs." + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodOrder order = new FoodOrder();

        order.displayMenu();

        while (true) {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String addItem = sc.nextLine();
                    order.addItem(addItem);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.nextLine();
                    order.removeItem(removeItem);
                    break;

                case 3:
                    order.generateBill();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}