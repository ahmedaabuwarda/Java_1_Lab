/*
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
taking your weight in kilograms and dividing by the square of your height in meters.
Write a program that prompts the user to enter a weight in pounds and height in inches
and displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is
0.0254 meters.

Here is a sample run:

Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
*/

package HomeWorks.HomeWork_02;

import java.util.Scanner;

public class _02_BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("  >> Enter height in inches: ");
        double height = input.nextDouble();
        double kilo = weight * 0.45359237;
        double meter = height * 0.0254;
        double BMI = kilo / (meter * meter);
        System.out.println("  >> Your Body Mass Index is: " + BMI);

    }
}