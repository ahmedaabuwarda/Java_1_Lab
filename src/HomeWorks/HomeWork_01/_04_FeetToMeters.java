/*
Write a program that reads a number in feet, converts it to meters, and displays
the result. One foot is 0.305 meter.
*/

package HomeWorks.HomeWork_01;

import java.util.Scanner;

public class _04_FeetToMeters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter Your Number of Feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println("\n >> The Number of " + feet + " Feet in Meter is: "
                + meter + " Meter");

    }
}