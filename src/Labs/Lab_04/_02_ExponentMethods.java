/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _02_ExponentMethods {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n Method \t Description" +
                "\n exp(x) \t Returns e^x." +
                "\n log(x) \t Returns the Natural logarithm of x >> ln(x) = loge(x)." +
                "\n log10(x) \t Returns the base 10 logarithm of x." +
                "\n pow(a , b)  Returns (a raised to the power of b) a^b." +
                "\n sqrt(x)     Returns the square root of x.");

        System.out.println("\n Example:.. \n" +
                "\n exp(10) = " + Math.exp(10) +
                "\n log(10) = " + Math.log(10) +
                "\n log10(10) = " + Math.log10(10) +
                "\n pow(10 ,10)" + Math.pow(10, 10) +
                "\n sqrt(10) = " + Math.sqrt(10));

    }
}