/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_05;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _01_StringDataType {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n char type represents only one character." +
                "\n String: a sequence of characters is enclosed in double quotation marks.");
        String message = "\n Welcome to Java";
        System.out.println(message);
        System.out.println("\n Method \t\t Description" +
                "\n length() \t\t Returns the number of characters in this string." +
                "\n charAt(index) \t Returns the character at the specified index from this string." +
                "\n concat(s1) \t Returns a new string that concatenates this string with string s1." +
                "\n toUpperCase() \t Returns a new string with all letters in UpperCase." +
                "\n toLowerCase() \t Returns a new string with all letters in LowerCase." +
                "\n trim() \t\t Returns a new string with whitespace characters trimmed on both sides.");

        /*
           ** these methods are called instance methods.
           ** non-instance method is called a static method.
           ** A static method can be invoked using the class name, without using an object.
           ** All the methods defined in the Math class are static methods. They are not tied to
              a specific object instance.
        */

    }

}