/*
Ex2: Write a program that reads an integer between 0 and 999 and adds all the digits in the
integer. For example, if an integer is 932, the sum of all its digits is 14.

Hint: Use the % operator to extract digits, and use the / operator to remove the extracted
digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

*/

package Labs.Lab_02;

import java.util.Scanner;

public class _09_Ex02_SumDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your digits(0-999): ");
        int number = input.nextInt();
        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = number % 10;
        System.out.println("  >> The Total is: " + (num1 + num2 + num3));

    }
}