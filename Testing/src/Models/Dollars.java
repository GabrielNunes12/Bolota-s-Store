package Models;

import util.CurrencyConverter;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        double dollarPrice, dollarBought;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        dollarPrice = scanner.nextDouble();
        System.out.println("How many dollars will be bought? ");
        dollarBought = scanner.nextDouble();
        System.out.printf("Amount to be paid in Reais: %.2f%n", CurrencyConverter.amountToBePaid(dollarPrice, dollarBought));
    }
}
