/*
Write a program that prompts the user to enter a single character. Print whether the character
Vowel or Consonant, depending on the user input.
*/

package HomeWorks.HomeWork_04;

import java.util.Scanner;

public class _04_VowelOrConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a Character: ");
        String letter = input.nextLine();
        String toLowerCase = letter.toLowerCase();
        char ch = toLowerCase.charAt(0);
        if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'e') {
            System.out.println("  >> The Character is Vowel.");
        } else {
            System.out.println("  >> The Character is Consonant.");
        }

    }
}