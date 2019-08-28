/*
Write a program that receives a character and displays its Unicode.
*/

package HomeWorks.HomeWork_04;

import java.util.Scanner;

public class _05_Unicode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your Character: ");
        String cha = input.nextLine();
        char letter = cha.charAt(0);
        System.out.println("  >> The Unicode for " + cha + " is: " + ((int) letter));

    }
}