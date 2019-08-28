/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

public class _08_CastingBetweenCharAndNumericTypes {
    public static void main(String[] args) {

        char ch = (char) 0X0041; // ch is character A.

        // A char can be cast into any numeric type, and vice versa.

        char cha = (char) 65.25; // cha is character A.

        // Floating-point to int then char.

        int i = (int) 'A'; // i is 65.

        // Implicit Casting...
        byte b = 'a';   // 'a' = 97.
        int c = 'a';
        byte j = (byte) '\uFFF4';

        System.out.println("\n ch = " + ch +
                "\n cha = " + cha +
                "\n i = " + i +
                "\n byte j = '\\uFFF4';  >>  is incorrect." +
                "\n byte j = (byte) '\\uFFF4';  >>  is correct. = " + j);

    }
}