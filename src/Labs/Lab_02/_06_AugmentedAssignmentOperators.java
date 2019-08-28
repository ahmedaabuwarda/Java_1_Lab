package Labs.Lab_02;

public class _06_AugmentedAssignmentOperators {
    public static void main(String[] args) {

        int i = 5;
        System.out.println("\n i = 5 " +
                "\n i += 8  >>  i = i + 8  >>  " + (i += 8) +
                "\n i -= 8  >>  i = i - 8  >>  " + (i -= 8) +
                "\n i *= 8  >>  i = i * 8  >>  " + (i *= 8) +
                "\n i /= 8  >>  i = i / 8  >>  " + (i /= 8) +
                "\n i %= 8  >>  i = i % 8  >>  " + (i %= 8));

        double a = 6.5;
        a += a + 1;     // becomes >> a = a + a + 1
        System.out.println("\n " + a);      // prints 14.0
        a = 6;      // Assign a new value to a
        a /= 2;     // becomes >> a = a / 2
        System.out.println("\n " + a);      // prints 3.0

    }
}