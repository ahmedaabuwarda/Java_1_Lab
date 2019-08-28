/*
Write a program that prompts the user to enter a character ch. If the character is 'U' or 'u' then
generate a random uppercase letter. If the character is 'L' or 'l' then generate a random
lowercase letter. Else, print the character.
*/

package Labs.Lab_04;

import java.util.Scanner;

public class _15_Ex05_GenerateRandomLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a Character: ");
        String letter = input.nextLine();
        char ch = letter.charAt(0);
        if (ch == 'U' || ch == 'u') {
            char random = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
            System.out.println("  >> Randomly generated UpperCase letter is: \"" + random + "\"");
        } else if (ch == 'L' || ch == 'l') {
            char random = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            System.out.println("  >> Randomly generated LowerCase letter is: \"" + random + "\"");
        } else {
            System.out.println("  >> The Character is: \"" + letter + "\"");
        }

    }
}