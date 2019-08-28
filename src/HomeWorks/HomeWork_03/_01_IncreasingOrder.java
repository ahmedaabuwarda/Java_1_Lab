/*
Write a program that prompts the user to enter three integers and display the
integers in increasing order.
*/

package HomeWorks.HomeWork_03;

import java.util.Scanner;

public class _01_IncreasingOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter three integers: ");
        int numb1 = input.nextInt();
        int numb2 = input.nextInt();
        int numb3 = input.nextInt();
        if (numb1 > numb2 && numb1 > numb3) {
            if (numb2 > numb3) {
                System.out.println("  >> The number in increasing order: " +
                        numb1 + " " + numb2 + " " + numb3);
            } else {
                System.out.println("  >> The number in increasing order: " +
                        numb1 + " " + numb3 + " " + numb2);
            }
        } else if (numb2 > numb1 && numb2 > numb3) {
            if (numb1 > numb3) {
                System.out.println("  >> The number in increasing order: " +
                        numb2 + " " + numb1 + " " + numb3);
            } else {
                System.out.println("  >> The number in increasing order: " +
                        numb2 + " " + numb3 + " " + numb1);
            }
        } else if (numb3 > numb1 && numb3 > numb2) {
            if (numb1 > numb2) {
                System.out.println("  >> The number in increasing order: " +
                        numb3 + " " + numb1 + " " + numb2);
            } else {
                System.out.println("  >> The number in increasing order: " +
                        numb3 + " " + numb2 + " " +numb1);
            }
        }

    }
}