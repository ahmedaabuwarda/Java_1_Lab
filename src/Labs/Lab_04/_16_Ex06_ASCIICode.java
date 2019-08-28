/*
 Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
*/

package Labs.Lab_04;

import java.util.Scanner;

public class _16_Ex06_ASCIICode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your integer (0 - 127): ");
        int integer = input.nextInt();
        char ascii = (char) integer;
        System.out.println("  >> The ASCII Code for " + integer + " is: " + ascii);

    }
}