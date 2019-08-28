/*
Write a program that prompts the user to enter an integer and determines
whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is
divisible by 5 or 6, but not both.

Here is a sample run:

Enter an integer: 10
Is 10 divisible by 5 and 6?               false
Is 10 divisible by 5 or 6?                true
Is 10 divisible by 5 or 6, but not both?  true
*/

package HomeWorks.HomeWork_03;

import java.util.Scanner;

public class _03_Divisible_And_Or_Not {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter an integer: ");
        int integer = input.nextInt();
        System.out.println("  >> Is 10 divisible by 5 and 6? " +
                ((integer % 6 == 0) && (integer % 5) == 0) +
                "\n  >> Is 10 divisible by 5 or 6? " +
                ((integer % 6 == 0) || (integer % 5) == 0) +
                "\n  >> Is 10 divisible by 5 or 6, but not both? " +
                ((integer % 6 == 0) ^ (integer % 5) == 0));

    }
}