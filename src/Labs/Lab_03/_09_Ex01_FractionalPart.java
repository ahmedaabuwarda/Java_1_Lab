/*
Write a program that prompts the user to enter a decimal number and check if the fractional part
is zero or not.
*/

package Labs.Lab_03;

import java.util.Scanner;

public class _09_Ex01_FractionalPart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a number: ");
        double number = input.nextInt();
        if (number % 1 == 0) {
            System.out.println("  >> fractional part is zero");
        } else {
            System.out.println("  >> fractional part is not zero");
        }

    }
}