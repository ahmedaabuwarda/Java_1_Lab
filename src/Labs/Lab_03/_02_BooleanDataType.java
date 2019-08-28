/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _02_BooleanDataType {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        System.out.println("\n  >> boolean is: true or false" + "\n     true = 1 , false = 0");
        boolean isOn = true;
        System.out.println("  >> isOn: " + isOn);

        int radius = 5;
        System.out.println("\n Operator  Name \t\t\t\t\t Example \t\t Answer" +
                "\n <  \t   less than  \t\t\t\t radius < 0  ?   " + (radius < 0) +
                "\n <= \t   less than or equal to  \t radius <= 0 ?   " + (radius <= 0) +
                "\n >  \t   greater than \t\t\t radius > 0  ?   " + (radius > 0) +
                "\n >= \t   greater than or equal to  radius >= 0 ?   " + (radius >= 0) +
                "\n == \t   equal to \t\t\t\t radius == 0 ?   " + (radius == 0) +
                "\n != \t   not equal to \t\t\t radius != 0 ?   " + (radius != 0));

        int x = 1;
        System.out.println("\n X > 0  ? " + (x > 0) +
                "\n X < 0  ? " + (x < 0) +
                "\n X != 0 ? " + (x != 0) +
                "\n X >= 0 ? " + (x >= 0) +
                "\n X != 1 ? " + (x != 1));

    }

}