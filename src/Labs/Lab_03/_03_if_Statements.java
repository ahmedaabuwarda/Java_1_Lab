/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _03_if_Statements {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n  >> Enter radius: ");
        double radius = input.nextDouble();

        if (radius >= 0) {

            double area = 2 * radius * Math.PI;
            System.out.println("  >> The area is: " + area);

        } else {

            System.out.println("  >> radius cannot be negative !!");

        }

    }

}