/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_04;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _04_VowelOrConsonant {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

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