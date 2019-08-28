/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _05_if_else_Statements_Score {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n  >> Enter your mark: ");
        double mark = input.nextDouble();

        if (mark <= 100 && mark >= 0) {

            if (mark >= 90) {
                System.out.println("  >> Excellent !");
            } else if (mark >= 80) {
                System.out.println("  >> Very Good !");
            } else if (mark >= 70) {
                System.out.println("  >> Good !");
            } else if (mark >= 60) {
                System.out.println("  >> Medium !");
            } else {
                System.out.println("  >> Failed !");
            }

        } else {

            System.out.println("  >> Wrong mark !, Try again !");

        }

    }

}