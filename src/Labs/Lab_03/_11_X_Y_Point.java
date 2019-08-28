/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _11_X_Y_Point {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n  >> Enter a point with two coordinates (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(x * x + y * y);

        if (distance <= 10) {

            System.out.println("  >> The point (" + x + "," + y + ") is in the circle.");

        } else {

            System.out.println("  >> The point (" + x + "," + y + ") is not in the circle.");

        }

    }

}