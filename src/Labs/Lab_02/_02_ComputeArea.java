/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _02_ComputeArea {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n >> Enter Your Radius: ");
        double radius = input.nextDouble();
        final double circumference = radius * 2 * Math.PI;  // final.
        System.out.println("\n >> The Circumference is: " + circumference);

    }

}