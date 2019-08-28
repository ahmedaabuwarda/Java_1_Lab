/*
An ISBN-10 (International Standard Book Number) consists of 10 digits:
d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, which is calculated from the
other nine digits using the following formula:

(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11

If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read the input
as an integer.

Here are sample runs:

Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X

Hint: use String.format("%09d", number) to print a number with leading zeros
*/

package HomeWorks.HomeWork_03;

import java.util.Scanner;

public class _02_ISBN_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();
        int num1 = number / 100000000;
        int num2 = (number % 100000000) / 10000000;
        int num3 = (number % 10000000) / 1000000;
        int num4 = (number % 1000000) / 100000;
        int num5 = (number % 100000) / 10000;
        int num6 = (number % 10000) / 1000;
        int num7 = (number % 1000) / 100;
        int num8 = (number % 100) / 10;
        int num9 = (number % 10) / 1;
        int num10= ((num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 +
                num7 * 7 + num8 * 8 + num9 * 9) % 11);
        if (num10 == 10){
            System.out.println("  >> The ISBN-10 number is: " + num1 + "" + num2 + "" + num3 +
                    "" + num4 + "" + num5 + "" + num6 + "" + num7 + "" + num8 + "" + num9 + "x");
        } else {
            System.out.println("  >> The ISBN-10 number is: " + num1 + "" + num2 + "" + num3 +
                    "" + num4 + "" + num5 + "" + num6 + "" + num7 + "" + num8 + "" + num9 + "" + num10);
        }

    }
}