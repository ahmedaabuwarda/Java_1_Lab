/*
Write a program that reads three numbers and prints the maximum number. (Use Math class).
*/

package HomeWorks.HomeWork_04;

import java.util.Scanner;

public class _01_MaximumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double max = Math.max(Math.max(num1 , num2) , num3);
        System.out.println("  >> " + max);

    }
}