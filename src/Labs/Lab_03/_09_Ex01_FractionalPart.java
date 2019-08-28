/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

public class _09_Ex01_FractionalPart {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a number: ");
        double number = input.nextInt();
        if (number % 1 == 0) {
            System.out.println("  >> fractional part is zero");
        } else {
            System.out.println("  >> fractional part is not zero");
        }

    }
}