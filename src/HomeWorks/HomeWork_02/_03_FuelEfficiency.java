/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _03_FuelEfficiency {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("  >> Enter miles per gallon: ");
        double miles = input.nextDouble();

        System.out.print("  >> Enter price per gallon: ");
        double price = input.nextDouble();

        double cost = (distance / miles) * price;
        System.out.println("  >> The cost of driving is: $" + cost);

    }

}