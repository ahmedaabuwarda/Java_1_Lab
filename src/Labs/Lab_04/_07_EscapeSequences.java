/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _07_EscapeSequences {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n Java uses a special notation to represent special characters." +
                "\n This special notation, called an escape sequence, consists of a backslash (\\)" +
                "\n followed by a character or a combination of digits.");

        System.out.println("\n \"System.out.println(\"He said \"Java is fun\"\");  >> Syntax Errors.\"");
        System.out.println(" \"System.out.println(\"He said \\\"Java is fun\\\"\");  >> True\"");

        System.out.println("\n Escape Sequence \t Name \t\t\t\t Unicode Code \t Decimal Value" +
                "\n \\b \t\t\t\t Backspace \t\t\t \\u0008 \t\t 8" +
                "\n \\t \t\t\t\t Tab \t\t\t\t \\u0009 \t\t 9" +
                "\n \\n \t\t\t\t Linefeed \t\t\t \\u000A \t\t 10" +
                "\n \\f \t\t\t\t Formfeed \t\t\t \\u000C \t\t 12" +
                "\n \\r \t\t\t\t Carriage Return \t \\u000D \t\t 13" +  // Hide >> ahmed/r warda >>  warda.
                "\n \\\\ \t\t\t\t Backslash \t\t\t \\u005C \t\t 92" +
                "\n \\\" \t\t\t\t Double Quote \t\t \\u0022  \t\t 34");

        System.out.println("\n Welcome to \"IUG\\JavaLab\"" +
                "\n Lab4:\t Math Functions & Characters.");

    }
}