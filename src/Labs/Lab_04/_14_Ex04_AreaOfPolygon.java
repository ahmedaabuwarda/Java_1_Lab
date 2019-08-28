/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

import java.util.Scanner;

public class _14_Ex04_AreaOfPolygon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the number of Sides: ");
        int side = input.nextInt();
        System.out.print("  >> Enter the length of a side: ");
        double lenght = input.nextInt();
        double area = (side * lenght * lenght) / (4 * Math.tan (Math.PI / side));
        System.out.println("  >> The Area is = " + area);

    }
}