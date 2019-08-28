/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_04;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _01_MaximumNumber {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double max = Math.max(Math.max(num1, num2), num3);
        System.out.println("  >> " + max);

    }

}