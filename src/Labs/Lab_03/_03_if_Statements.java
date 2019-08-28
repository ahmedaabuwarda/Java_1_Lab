package Labs.Lab_03;

import java.util.Scanner;

public class _03_if_Statements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter radius: ");
        double radius = input.nextDouble();
        if (radius >= 0) {
            double area = 2 * radius * Math.PI;
            System.out.println("  >> The area is: " + area);
        } else {
            System.out.println("  >> radius cannot be negative !!");
        }
    }
}