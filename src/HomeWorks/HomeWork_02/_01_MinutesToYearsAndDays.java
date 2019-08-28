/*
Write a program that prompts the user to enter the minutes (e.g., 1 billion), and
displays the number of years and days for the minutes. For simplicity, assume a year
has 365 days.
*/

package HomeWorks.HomeWork_02;

import java.util.Scanner;

public class _01_MinutesToYearsAndDays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / (60 * 24 * 365);
        int remMinutes = minutes % (60 * 24 * 365);
        int remDays = remMinutes / (60 * 24);
        System.out.println("  >> " + years + " years and " + remDays + " days");

    }
}