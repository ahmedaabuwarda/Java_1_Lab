/*
Write a program that prompts the user to enter the distance to drive, the fuel
efficiency of the car in miles per gallon, and the price per gallon, and displays the cost
of the trip.

Here is a sample run:

Enter the driving distance: 900.5
Enter miles per gallon: 25.5
Enter price per gallon: 3.55
The cost of driving is $125.36
*/

package HomeWorks.HomeWork_02;

import java.util.Scanner;

public class _03_FuelEfficiency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("  >> Enter miles per gallon: ");
        double miles = input.nextDouble();
        System.out.print("  >> Enter price per gallon: ");
        double price = input.nextDouble();
        double cost = (distance / miles) * price;
        System.out.println("  >> The cost of driving is: $" + cost);

    }
}