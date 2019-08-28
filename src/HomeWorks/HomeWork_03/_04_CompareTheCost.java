/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _04_CompareTheCost {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("  >> Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / weight1 < price2 / weight2) {

            System.out.println("  >> Package 1 has a better price.");

        } else if (price2 / weight2 < price1 / weight1) {

            System.out.println("  >> Package 2 has a better price.");

        } else {

            System.out.println("  >> The two packages have the same price.");

        }

    }

}