/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _02_BodyMassIndex {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("  >> Enter height in inches: ");
        double height = input.nextDouble();
        double kilo = weight * 0.45359237;
        double meter = height * 0.0254;
        double BMI = kilo / (meter * meter);
        System.out.println("  >> Your Body Mass Index is: " + BMI);

    }

}