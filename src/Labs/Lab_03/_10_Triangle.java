/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _10_Triangle {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n  >> Enter Edge1: ");
        double edge1 = input.nextDouble();

        System.out.print("  >> Enter Egde2: ");
        double edge2 = input.nextDouble();

        System.out.print("  >> Enter Edge3: ");
        double edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge3 + edge2 > edge1) {

            System.out.println("  >> The Perimeter is: " + (edge1 + edge2 + edge3));

        } else {

            System.out.println("  >> The input is invalid !");

        }

    }

}