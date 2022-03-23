package Models;

import util.Calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typer your radius: ");
        radius = scanner.nextDouble();
        System.out.printf("Your circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Your volume: %.2f%n", Calculator.volume(radius));
        System.out.println("PI: " + Calculator.PI);

    }
}
