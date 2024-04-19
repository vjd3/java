package basics;

import java.util.Scanner;

public class ControlStatements {

    public static void main(String[] args) {

        boolean isAuthenticated = true;
        Scanner scanner = new Scanner(System.in);

        if (isAuthenticated) {
            System.out.println("Welcome");
        } else {
            System.out.println("Please login");
        }

        if (isAuthenticated) 
            System.out.println("Welcome");
        if (!isAuthenticated)
            System.out.println("Please login");

        float sellingPrice = 100.0f, costPrice = 200.0f;

        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("Neither profit nor loss");
        }

        System.out.println("admin - Gets full access");
        System.out.println("user - Gets limited access");
        System.out.println("guest - No access");
        System.out.println("Enter your choice: ");
        String user = scanner.nextLine();

        switch (user) {
            case "admin":
                System.out.println("Full access");
                break;
            case "user":
                System.out.println("Limited access");
                break;
            case "guest":
                System.out.println("No access as guest");
                break;
            default:
                System.out.println("No access");
                break;
        }

        scanner.close();

    }
}
