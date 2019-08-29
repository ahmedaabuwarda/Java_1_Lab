/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _15_Ex05_GenerateRandomLetter {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

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