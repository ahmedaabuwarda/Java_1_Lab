/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

public class _11_X_Y_Point {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter a point with two coordinates (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= 10){
            System.out.println("  >> The point (" + x + "," + y + ") is in the circle.");
        } else {
            System.out.println("  >> The point (" + x + "," + y + ") is not in the circle.");
        }

    }
}