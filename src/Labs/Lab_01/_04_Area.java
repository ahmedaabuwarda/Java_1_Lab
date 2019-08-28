/*
* Write a program that asks the user to enter a number (radius of a circle) and the program
* calculates the area of the circle and print the result to the console.
*/

package Labs.Lab_01;

import java.util.Scanner;

public class _04_Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n Enter Your Radius: ");
        double radius = input.nextDouble();
        double Area = radius * radius * Math.PI;
        System.out.println("\n The Area: " + Area);

    }
}