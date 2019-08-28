/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Labs.Lab_04;

import java.util.Scanner;

public class _05_LotteryNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter your lottery pick (two digits): ");
        int lotNum = input.nextInt();
        int num1 = lotNum / 10;
        int num2 = lotNum % 10;
        int randomNum = (int) (10 + Math.random() * 90);
        int ranNum1 = randomNum / 10;
        int ranNum2 = randomNum % 10;
        System.out.println("  >> You entered " + lotNum + " and the lottery number is: " + randomNum);
        if (ranNum1 == num1 && ranNum2 == num2) {
            System.out.println("  >> Congratulations, you win $10,000.");
        } else if (ranNum1 == num2 && ranNum2 == num1) {
            System.out.println("  >> Match all digits: you win $3,000.");
        } else if (ranNum1 == num1 || ranNum1 == num2 || ranNum2 == num1 || ranNum2 == num2) {
            System.out.println("  >> Match one digit: you win $1,000.");
        } else {
            System.out.println("  >> Sorry!, no match.");
        }

    }
}