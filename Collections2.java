import java.util.ArrayList;
import java.util.Scanner;

public class Collections2{
    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Shopping Cart ---");
            System.out.println("1. Add Products");
            System.out.println("2. Display Products");
            System.out.println("3. Search Products");
            System.out.println("4. Remove Products");
            System.out.println("5. Display Number of Products");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    products.add(name);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.println("Products :");
                    for (String product : products) {
                        System.out.println(product);
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String searchName = sc.nextLine();

                    if (products.contains(searchName)) {
                        System.out.println("Product is present.");
                    } else {
                        System.out.println("Product is not present.");
                    }
                    break;

                case 4:
                    System.out.print("Enter product name to remove: ");
                    String removeName = sc.nextLine();

                    if (products.remove(removeName)) {
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Number of products present: " + products.size());
                    break;

                case 6:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}