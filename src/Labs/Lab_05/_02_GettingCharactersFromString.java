/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_05;

public class _02_GettingCharactersFromString {
    public static void main(String[] args) {

        // The str.charAt(index) method can be used to retrieve a specific character in a string str.

        String message = "Welcome to Java";
        System.out.println("\n " + message +
                "\n message.charAt(0): " + message.charAt(0) +
                "\n message.charAt(14): " + message.charAt(14) +
                "\n message.length(): " + message.length() +
                "\n Number of index: from 0 to " + (message.length() - 1));

        /*
            Note that attempting to access characters in a string s out of bounds is a common
            programming error. To avoid it, make sure that you do not use an index beyond (s.length() – 1).
        */

    }
}