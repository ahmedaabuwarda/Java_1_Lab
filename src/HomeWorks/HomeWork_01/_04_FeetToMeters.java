/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _04_FeetToMeters {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter Your Number of Feet: ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println("\n >> The Number of " + feet + " Feet in Meter is: "
                + meter + " Meter");

    }

}