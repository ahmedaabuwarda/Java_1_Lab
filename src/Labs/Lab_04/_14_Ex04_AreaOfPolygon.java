/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda, Date: Aug 29,2019.
 */
public class _14_Ex04_AreaOfPolygon {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the number of Sides: ");
        int side = input.nextInt();
        System.out.print("  >> Enter the length of a side: ");
        double lenght = input.nextInt();
        double area = (side * lenght * lenght) / (4 * Math.tan(Math.PI / side));
        System.out.println("  >> The Area is = " + area);

    }
}