package Bill;

import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double getTotalPrice() {
        return quantity * price;
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            products.add(new Product(id, name, quantity, price));
        }

        System.out.println("\n------ BILL ------");
        System.out.printf("%-12s %-15s %-10s %-15s %-15s\n",
                "Product ID", "Name", "Quantity", "Price", "Total");

        double grandTotal = 0;

        for (Product p : products) {
            double total = p.getTotalPrice();
            grandTotal += total;

            System.out.printf("%-12d %-15s %-10d %-15.2f %-15.2f\n",
                    p.id, p.name, p.quantity, p.price, total);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("Grand Total: %.2f\n", grandTotal);

        sc.close();
    }
}
