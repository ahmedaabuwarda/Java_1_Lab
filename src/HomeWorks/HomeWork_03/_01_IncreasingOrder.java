/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _01_IncreasingOrder {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

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
                        numb3 + " " + numb2 + " " + numb1);

            }

        }

    }

}