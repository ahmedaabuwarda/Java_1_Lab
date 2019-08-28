/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _01_MinutesToYearsAndDays {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / (60 * 24 * 365);
        int remMinutes = minutes % (60 * 24 * 365);
        int remDays = remMinutes / (60 * 24);
        System.out.println("  >> " + years + " years and " + remDays + " days");

    }

}