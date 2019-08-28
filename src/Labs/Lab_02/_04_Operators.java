package Labs.Lab_02;

public class _04_Operators {
    public static void main(String[] args) {

        System.out.println("\n" +
                " addition (+)        >> 9 + 4 = " + (9 + 4) + "\n" +
                " subtraction (–)     >> 9 - 4 = " + (9 - 4) + "\n" +
                " multiplication (*)  >> 9 * 4 = " + (9 * 4) + "\n" +
                " division (/)        >> 9 / 4 = " + (9 / 4) + "\n" +
                " remainder (%)       >> 9 % 4 = " + (9 % 4) + "\n");

        System.out.println(" 10 / 3 = " + (10 / 3)); //prints 3
        System.out.println(" 10.0 / 3 = " + (10.0 / 3)); //prints 3.3335

        // The % operator yields the remainder after division.
        System.out.println("\n 7 % 3 yields: " + (7 % 3) + "\n" +
                " 12 % 4 yields: " + (12 % 4));

    }
}