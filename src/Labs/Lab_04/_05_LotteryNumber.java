/*
Write a program that randomly generates a number of two digits, prompts the user to enter
a two-digit number, and determines whether the user wins according to the following rules:

1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
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