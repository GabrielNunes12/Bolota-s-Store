package Models;

import java.util.Scanner;

public class ExercicioMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value1, value2, result;
        System.out.println("Type your first number: ");
        value1 = input.nextInt();
        System.out.println("Type your second number: ");
        value2 = input.nextInt();
        result = value1 + value2;
        System.out.println("Your result is: " + result);
    }

    private static void testing() {
        // initialize variable
        int price, amount;
        System.out.println(price,amount);
    }
}
