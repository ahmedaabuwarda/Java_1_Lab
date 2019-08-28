/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_02;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _06_AugmentedAssignmentOperators {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        int i = 5;
        System.out.println("\n i = 5 " +
                "\n i += 8  >>  i = i + 8  >>  " + (i += 8) +
                "\n i -= 8  >>  i = i - 8  >>  " + (i -= 8) +
                "\n i *= 8  >>  i = i * 8  >>  " + (i *= 8) +
                "\n i /= 8  >>  i = i / 8  >>  " + (i /= 8) +
                "\n i %= 8  >>  i = i % 8  >>  " + (i %= 8));

        double a = 6.5;
        a += a + 1;     // becomes >> a = a + a + 1.
        System.out.println("\n " + a);      // prints 14.0.

        a = 6;       // Assign a new value to a.
        a /= 2;      // becomes >> a = a / 2.
        System.out.println("\n " + a);      // prints 3.0.

    }

}