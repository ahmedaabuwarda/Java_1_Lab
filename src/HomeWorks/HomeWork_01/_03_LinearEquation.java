/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _03_LinearEquation {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n Example: " +
                "\n >> ax + by = e  >>>  5x + 3y = 7" +
                "\n >> cx + dy = f  >>>  3x + 4y = 14 \n" +
                "\n   >> a = 5 , b = 3 , e = 7" +
                "\n   >> c = 3 , d = 4 , f = 14" +
                "\n ----------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("\n >> Enter Your (a , b , e): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double e = input.nextDouble();

        System.out.print(" >> Enter Your (c , d , f): ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("\n >> x = " + x + "\n >> y = " + y);

    }

}