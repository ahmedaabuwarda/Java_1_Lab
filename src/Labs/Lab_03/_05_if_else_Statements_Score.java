/*
The statement below prints a letter grade according to the score, with multiple alternatives.
*/

package Labs.Lab_03;

import java.util.Scanner;

public class _05_if_else_Statements_Score {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your mark: ");
        double mark = input.nextDouble();
        if (mark <= 100 && mark >= 0) {
            if ( mark >= 90) {
                System.out.println("  >> Excellent !");
            } else if (mark >= 80) {
                System.out.println("  >> Very Good !");
            } else if (mark >= 70) {
                System.out.println("  >> Good !");
            } else if (mark >= 60) {
                System.out.println("  >> Medium !");
            } else {
                System.out.println("  >> Failed !");
            }
        } else {
            System.out.println("  >> Wrong mark !, Try again !");
        }
    }
}