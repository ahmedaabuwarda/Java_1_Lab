/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _06_CharactersAndOperations {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        char letter = 'A';
        char numChar = '4';

        System.out.println("\n  >> Mapping a character to its binary representation is called encoding. \n" +
                "\n ASCII \t\t\t\t\t Unicode" +
                "\n 8-bit \t\t\t\t\t 16-bit" +
                "\n One byte \t\t\t\t two bytes" +
                "\n Preceded by \\u \t\t Preceded by Numbers (0-127)" +
                "\n From \\u0000 to \\u007F \t From \\u0000 to \\uFFFF");

        System.out.println("\n Characters \t Code value in Decimal \t Unicode Value (Hex)" +
                "\n '0' to '9' \t 48 to 57 \t\t\t\t \\u0030 to \\u0039" +
                "\n 'A' to 'Z' \t 65 to 90 \t\t\t\t \\u0041 to \\u005A" +
                "\n 'a' to 'z' \t 97 to 122 \t\t\t\t \\u0061 to \\u007A");

        char ch = 'B';
        System.out.println("\n  ++B = " + ++ch);

    }

}