package Models;

import java.util.Scanner;

public class LearningThroughExercises {
    public static void main(String[] args) {
        int price, amount;
        double sin,cos;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your price: ");
        price = scanner.nextInt();
        System.out.println("Your bet price is: " + price);

        System.out.println("Type your amount: ");
        amount = scanner.nextInt();
        System.out.println("Your bet price is: " + amount);

        //casting to lose floating numbers
        result = (double) price * amount;
        System.out.println("Your final result is: " + result);

        System.out.println("O coseno de 45º é:" + Math.cos(45));
    }
}
