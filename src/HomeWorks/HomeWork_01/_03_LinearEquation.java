/*
Use Cramer’s rule to solve the following 2 * 2 system of linear equation:

ax + by = e         x = ((e * d) - (b * f)) / ((a * d) - (b * c))
cx + dy = f         Y = ((a * f) - (e * c)) / ((a * d) - (b * c))

Write a program that solves the following equation and displays the value for x and y:

3.4x + 50.2y = 44.5
2.1x + 0.55y = 5.9
*/

package HomeWorks.HomeWork_01;

import java.util.Scanner;

public class _03_LinearEquation {
    public static void main(String[] args) {

        System.out.println("\n Example: " +
                "\n >> ax + by = e  >>>  5x + 3y = 7" +
                "\n >> cx + dy = f  >>>  3x + 4y = 14 \n" +
                "\n   >> a = 5 , b = 3 , e = 7" +
                "\n   >> c = 3 , d = 4 , f = 14" +
                "\n ----------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter Your (a , b , e): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();

        System.out.print(" >> Enter Your (c , d , f): ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("\n >> x = " + x +
                "\n >> y = " + y);

    }
}