import java.util.*;
class Order {
    String customerName, cakeType;
    int quantity;
    double pricePerCake;
    Order(String customerName, String cakeType, int quantity) {
        this.customerName = customerName;
        this.cakeType = cakeType;
        this.quantity = quantity;
        pricePerCake = cakeType.equalsIgnoreCase("Chocolate") ? 350 : cakeType.equalsIgnoreCase("Vanilla") ? 300 : 250;
    }
    void displayOrderDetails() {
        System.out.println("Order Details:\nCustomer Name: " + customerName + "\nCake Type: " + cakeType + 
                           "\nQuantity: " + quantity + "\nPrice per Cake: ₹" + pricePerCake + 
                           "\nTotal Price: ₹" + (quantity * pricePerCake));
    }
}
public class CakeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cake type: ");
        String cake = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        new Order(name, cake, qty).displayOrderDetails();
        scanner.close();
    }
}
