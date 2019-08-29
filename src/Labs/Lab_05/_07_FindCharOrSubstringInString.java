/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_05;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _07_FindCharOrSubstringInString {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        String message = "Welcome to Java";
        System.out.println(message.indexOf('W') + "\n" + // returns 0
                message.indexOf('o') + "\n" + // returns 4
                message.indexOf('o', 5) + "\n" + // returns 9
                message.indexOf("come") + "\n" + // returns 3
                message.indexOf("Java", 5) + "\n" + // returns 11
                message.indexOf("java", 5) + "\n" + // returns -1 if not matched
                message.lastIndexOf('W') + "\n" + // returns 0
                message.lastIndexOf('o') + "\n" + // returns 9
                message.lastIndexOf('o', 5) + "\n" + // returns 4
                message.lastIndexOf("come") + "\n" + // returns 3
                message.lastIndexOf("Java", 5) + "\n" + // returns -1.
                message.lastIndexOf("Java")); // returns 11
    }
}