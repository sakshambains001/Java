import java.util.Scanner;

public class SimpleInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String product = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter price per unit: $");
        double price = sc.nextDouble();
        
        double totalValue = quantity * price;
        System.out.println("Product: " + product);
        System.out.println("Total Inventory Value: $" + totalValue);
    }
}
