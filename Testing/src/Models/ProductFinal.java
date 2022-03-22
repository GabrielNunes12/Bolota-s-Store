package Models;

import java.util.Scanner;

public class ProductFinal {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        product.setName(scanner.nextLine());
        System.out.print("Price: ");
        product.setPrice(Integer.parseInt(scanner.nextLine()));
        System.out.print("Quantity in stock: ");
        int stock = scanner.nextInt();
        product.setQuantity(stock);
        System.out.println(product.totalValueInStock());

        scanner.close();
    }
}
