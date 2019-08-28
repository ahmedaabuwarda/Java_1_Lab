/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_02;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _05_OperatorPrecedence {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n                10       9 % 6" +
                "\n25 + 15 * 3 - ------- + -------- + 1 = " +
                (25 + (15 * 3) - (10 / (2 * 6)) + ((9 % 6) / 3) + 1) +
                "\n               2 * 6       3");

    }

}