package Models;

import java.util.Scanner;

public class ForTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < number ; i++) {
            int resultSum = scanner.nextInt();
            sum += resultSum;
        }
        System.out.println(sum);
    }
}
