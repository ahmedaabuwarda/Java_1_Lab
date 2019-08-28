/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
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