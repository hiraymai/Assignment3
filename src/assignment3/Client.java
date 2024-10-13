package assignment3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online cosmetics store 'Kyoto'!");

        while (true) {
            System.out.println("Enter the product name ('exit' to exit): ");
            String product = scanner.nextLine();

            if (product.equalsIgnoreCase("exit")) {
                System.out.println("See you again! Goodbye.");
                break;
            }

            System.out.println("Enter payment type (Kaspi Gold, Kaspi Red, Halyk, PayPal): ");
            String paymentType = scanner.nextLine();

            shoppingFacade.placeOrder(product, paymentType);
            System.out.println();
        }

        scanner.close();
    }
}