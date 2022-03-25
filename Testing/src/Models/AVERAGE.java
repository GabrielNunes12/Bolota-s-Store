package Models;

import java.util.Scanner;

public class AVERAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times;
        System.out.println("How many times do you want to add it?");
        times = scanner.nextInt();
        Double[] height = new Double[times];
        double averageHeight = 0;
        System.out.println("Inform your height");
        for(int i = 0; i < times; i++) {
            height[i] = scanner.nextDouble();
            averageHeight += height[i];
        }
        System.out.printf("%.2f%n", GetValueFormatted(averageHeight, times));
    }
    private static Double GetValueFormatted (double averageHeight, int times) {
        return averageHeight / times;
    }
}
