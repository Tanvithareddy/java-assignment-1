import java.util.Scanner;
public class shoppingapp {
    public static double calculateTotal(double price) {
        return price;
    }
    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
    public static double calculateTotal(double price1, double price2, double price3) {
        return price1 + price2 + price3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a scenario for calculation:");
        System.out.println("1. Single item purchase");
        System.out.println("2. Multiple items of the same type");
        System.out.println("3. Three different items");
        int choice = scanner.nextInt();
        double total = 0;
        switch (choice) {
            case 1:
                System.out.print("Enter the price of the item: ");
                double price = scanner.nextDouble();
                total = calculateTotal(price);
                break;

            case 2:
                System.out.print("Enter the price of one item: ");
                price = scanner.nextDouble();
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();
                total = calculateTotal(price, quantity);
                break;

            case 3:
                System.out.print("Enter the price of the first item: ");
                double price1 = scanner.nextDouble();
                System.out.print("Enter the price of the second item: ");
                double price2 = scanner.nextDouble();
                System.out.print("Enter the price of the third item: ");
                double price3 = scanner.nextDouble();
                total = calculateTotal(price1, price2, price3);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        System.out.println("Total Price: " + total);
        scanner.close();
    }
}
