/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _08_ConditionalExpressions {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Conditional Expressions...
        System.out.println("\n  >> The syntax is: " +
                "boolean-expression ? true-expression : false-expression;");

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a number: ");
        int number = input.nextInt();

        System.out.println(number % 2 == 0 ? "  >> The Number is: Even" : "  >> The Number is: Odd");

    }

}