/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_05;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _06_ObtainingSubstrings {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        String message = "\n Welcome to Java";
        String message1 = message.substring(0, 12) + " HTML"; // tring message now becomes "Welcome to HTML"
        String message2 = message.substring(12);
        System.out.println(message1);       // Note that the last character (12) is excluded.
        System.out.println(message2);       // print from index 12 to the end of text, including (12).

    }
}