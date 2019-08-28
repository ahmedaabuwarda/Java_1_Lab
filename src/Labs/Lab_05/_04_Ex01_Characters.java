/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_05;

import java.util.Scanner;

public class _04_Ex01_Characters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a string: ");
        String str = input.nextLine();
        if (str.length() >= 5) {
            System.out.println("\n >> The fifth character: " + str.charAt(4));
        } else {
            System.out.println("\n >> The fifth character: does not exist.");
        }
        System.out.println(" >> How many characters in the line?: " + str.length() +
                "\n >> All characters in uppercase: " + str.toUpperCase() +
                "\n >> All characters in lowercase: " + str.toLowerCase());

    }
}