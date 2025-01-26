import java.util.*;
class Book {
    String title, author;
    double price;
    int stock;
    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;}
    Book(String title, String author) {
        this(title, author, 500.0, 10);  }
    void displayDetails() {
        System.out.printf("Book Details:\nTitle: %s, Author: %s, Price: ₹%.2f, Stock: %d\n", title, author, price, stock);}}
public class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        Book book;
        if (choice == 1) {
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            int stock = scanner.nextInt();
            book = new Book(title, author, price, stock);
        } else if (choice == 2) {
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            book = new Book(title, author);  
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;}
        book.displayDetails();
        scanner.close();
    }}
