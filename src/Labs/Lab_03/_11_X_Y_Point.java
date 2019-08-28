/*
Write a program that prompts the user to enter a point (x, y) and checks whether the
point is within the circle centered at (0,0) with radius 10. For example, (4,5) is inside the
circle and (9,9) is outside the circle.
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