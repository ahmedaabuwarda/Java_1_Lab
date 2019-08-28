/*
A regular polygon is an n-sided polygon in which all sides are of the same length and all
angles have the same degree. The formula for computing the area of a regular polygon is:

area = (n ∗ s^2) / (4 ∗ Math.tan (Math.PI / n))

s is the length of a side. Write a program that prompts the user to enter the number of sides
and their length of a regular polygon and displays its area.
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