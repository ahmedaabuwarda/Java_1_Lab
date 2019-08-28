/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _09_Ex02_SumDigits {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);

        System.out.print("\n >> Enter your digits(0-999): ");
        int number = input.nextInt();

        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = number % 10;
        System.out.println(" >> The Total is: " + (num1 + num2 + num3));

    }

}