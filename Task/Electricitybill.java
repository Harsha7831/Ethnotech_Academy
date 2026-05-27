//ELECTRICTY BILL CODE

import java.util.Scanner;
class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        System.out.println("Electricity bill " + eleBill(units));
        sc.close();
    }
    static int eleBill(int units) {
        return (units > 250) ? units - 250 : 0;
    }
}
