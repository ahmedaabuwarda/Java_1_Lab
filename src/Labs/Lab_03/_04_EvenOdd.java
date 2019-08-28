/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_03;

import java.util.Scanner;

public class _04_EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter any number: ");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("  >> The number is Even.");
        }
        else {
            System.out.println("  >> The number is Odd.");
        }

    }
}