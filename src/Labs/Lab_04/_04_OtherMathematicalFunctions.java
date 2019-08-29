/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _04_OtherMathematicalFunctions {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n Method \t Description" +
                "\n min(a , b)  Return the minimum numbers of two numbers." +
                "\n max(z , b)  Return the maximum numbers of two numbers." +
                "\n abs(x) \t Returns the absolute value of the number." +
                "\n random() \t Returns a random number between a and a + b, excluding a + b");

        System.out.println("\n Example:.. \n" +
                "\n min(12 , 5) = " + Math.min(12, 5) +
                "\n max(12 , 5) = " + Math.max(12, 5) +
                "\n abs(-12) = " + Math.abs(-12) +
                "\n random() = " + (int) (Math.random() * 100));

        // To generate a random number in the period [5,15]:
        System.out.println("\n  >> To generate a random number in the period [5,15]: " +
                "(int)(5 + Math.random() * 11) = " + (int) (5 + Math.random() * 11));

    }

}