/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_02;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _07_IncAndDecOperators {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        int i = 1;
        int j = 0;
        System.out.println("\n i = 1 \n" +
                " j = 0 \n" + "\n j = ++i  >>  " + (j = ++i) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = i++  >>  " + (j = i++) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = i--  >>  " + (j = i--) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = --i  >>  " + (j = --i) +
                "\n i = " + i);

    }

}