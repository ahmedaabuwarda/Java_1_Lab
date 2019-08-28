/*
Write a program that prints the Unicode for '9' and '$'.
*/

package Labs.Lab_04;

public class _09_Ex01_Unicode {
    public static void main(String[] args) {

        char nineChar = '9';
        char doollar = '$';

        System.out.println("\n '9' = " + (int) nineChar +
                "\n '$' = " + (int) doollar);

        /*
            All numeric operators can be applied to char operands.

            A char operand is automatically cast into a number if the other operand is a number
            or a character. If the other operand is a string, the character is concatenated with the string.
        */

        int i = '2' + '3'; // (int)'2' is 50 and (int)'3' is 51
        int j = 2 + 'a'; // (int)'a' is 97

        System.out.println("\n i is = " + i +
                "\n j is = " + j +
                "\n " + j + " is the Unicode for character " + (char) j +
                "\n Lab " + '4');

    }
}