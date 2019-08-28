package Labs.Lab_02;

import java.util.Scanner;

public class _02_ComputeArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter Your Radius: ");
        double radius = input.nextDouble();
        final double circumference = radius * 2 * Math.PI; // final
        System.out.println("\n >> The Circumference is: " + circumference);

    }
}