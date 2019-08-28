/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

import java.util.Scanner;

public class _11_Ex02_CapitalOrSmalLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your letter: ");
        String letter = input.nextLine();
        char ch = letter.charAt(0);
        if ('0' <= ch && ch <= '9') {
            System.out.println("  >> The letter " + letter + " is Digit.");
        } else if ('A' <= ch && ch <= 'Z') {
            System.out.println("  >> The letter " + letter + " is Capital Letter.");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.println("  >> The letter " + letter + " is Small Letter.");
        } else {
            System.out.println("  >> Invalid Letter!");
        }

    }
}