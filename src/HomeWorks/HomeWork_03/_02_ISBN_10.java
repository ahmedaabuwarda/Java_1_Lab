/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _02_ISBN_10 {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int num1 = number / 100000000;
        int num2 = (number % 100000000) / 10000000;
        int num3 = (number % 10000000) / 1000000;
        int num4 = (number % 1000000) / 100000;
        int num5 = (number % 100000) / 10000;
        int num6 = (number % 10000) / 1000;
        int num7 = (number % 1000) / 100;
        int num8 = (number % 100) / 10;
        int num9 = (number % 10) / 1;
        int num10 = ((num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 +
                num7 * 7 + num8 * 8 + num9 * 9) % 11);

        if (num10 == 10) {

            System.out.println("  >> The ISBN-10 number is: " + num1 + "" + num2 + "" + num3 +
                    "" + num4 + "" + num5 + "" + num6 + "" + num7 + "" + num8 + "" + num9 + "x");

        } else {

            System.out.println("  >> The ISBN-10 number is: " + num1 + "" + num2 + "" + num3 +
                    "" + num4 + "" + num5 + "" + num6 + "" + num7 + "" + num8 + "" + num9 + "" + num10);

        }

    }

}