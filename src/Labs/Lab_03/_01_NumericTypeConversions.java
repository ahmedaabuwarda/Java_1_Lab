package Labs.Lab_03;

public class _01_NumericTypeConversions {
    public static void main(String[] args) {

        /*
            Casting:
            is an operation that converts a value of one data type into a value of another data type

            Casting a type with a small range to a type with a larger range is known as widening a type.
            Casting a type with a large range to a type with a smaller range is known as narrowing a type.

            Widening is called implicit casting because Java will automatically widen a type, but you must
            narrow a type explicitly, so narrowing is called explicit casting.

        */

        // Widening examples:
        double x = 3 * 4.5; // implicit widening, 3 is now 3.0
        int i = 5;
        double d = i; // implicit widening, d is now 5.0

        // Narrowing examples:
        double f = 10.5;
        int g = (int) f; // explicit narrowing, i is now 10

        int sum = 0;
        sum += 4.5;     // becomes sum = (int) sum + 4.5
        System.out.println("\n int sum = 0;" + "\n sum += 4.5;  >>  " + sum);    // print 4

    }
}