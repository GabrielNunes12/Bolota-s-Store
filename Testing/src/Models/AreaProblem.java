package Models;

import java.util.Scanner;

public class AreaProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter te measures of triangle X:");
        double area1 = scanner.nextDouble();
        double area2 = scanner.nextDouble();
        double area3 = scanner.nextDouble();

        System.out.println("Enter te measures of triangle Y:");
        double area4 = scanner.nextDouble();
        double area5 = scanner.nextDouble();
        double area6 = scanner.nextDouble();

        //calculating the x area
        double resultXArea = Math.sqrt(
                triangle.getResultArea(area1,area2,area3)
                        * (triangle.getResultArea(area1,area2,area3) - area1)
                        * (triangle.getResultArea(area1,area2,area3) - area2)
                        * (triangle.getResultArea(area1,area2,area3) - area3)
        );

        //calculating the Y area
        double resultYArea = Math.sqrt(
                triangle.getResultArea(area4,area5,area6)
                        * (triangle.getResultArea(area4,area5,area6) - area4)
                        * (triangle.getResultArea(area4,area5,area6) - area5)
                        * (triangle.getResultArea(area4,area5,area6) - area6)
        );
        System.out.printf("Triangle X area: %.4f%n", resultXArea);
        System.out.printf("Triangle X area: %.4f%n", resultYArea);
    }


}
