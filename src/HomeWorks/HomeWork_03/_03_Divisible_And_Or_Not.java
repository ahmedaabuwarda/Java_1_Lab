/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _03_Divisible_And_Or_Not {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n  >> Enter an integer: ");
        int integer = input.nextInt();

        System.out.println("  >> Is 10 divisible by 5 and 6? " +
                ((integer % 6 == 0) && (integer % 5) == 0) +
                "\n  >> Is 10 divisible by 5 or 6? " +
                ((integer % 6 == 0) || (integer % 5) == 0) +
                "\n  >> Is 10 divisible by 5 or 6, but not both? " +
                ((integer % 6 == 0) ^ (integer % 5) == 0));

    }

}