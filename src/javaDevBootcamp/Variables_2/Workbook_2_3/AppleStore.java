package javaDevBootcamp.Variables_2.Workbook_2_3;

public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");

        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.4;
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfCustomers = 1;
        double profit1 = 4 * price;
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfCustomers = 2;
        double profit2 = 20 * price;
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfCustomers = 3;
        double profit3 = 200 * price;

        profit = profit1 + profit2 + profit3;
        numOfApples = 500 - 4 - 20 - 200;
        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");
    }
}