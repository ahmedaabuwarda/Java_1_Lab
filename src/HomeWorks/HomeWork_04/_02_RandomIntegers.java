/*
Write statements that assign random integers to the variable n in the following ranges:

a) 1 ≤ n ≤ 2.
b) 1 ≤ n ≤ 100.
c) 0 ≤ n ≤ 9.
d) 1000 ≤ n ≤ 1112.
e) –1 ≤ n ≤ 1.
f) –3 ≤ n ≤ 11.
*/

package HomeWorks.HomeWork_04;

public class _02_RandomIntegers {
    public static void main(String[] args) {

        // a <= n <= c.
        // a + b - 1 = c.
        // a + Math.random() * b.

        int random1 = (int) (1 + Math.random() * 2);
        int random2 = (int) (1 + Math.random() * 100);
        int random3 = (int) (0 + Math.random() * 10);
        int random4 = (int) (1000 + Math.random() * 113);
        int random5 = (int) (-1 + Math.random() * 3);
        int random6 = (int) (-3 + Math.random() * 15);

        System.out.println("\n 1 ≤ n ≤ 2 = " + random1 +
                "\n 1 ≤ n ≤ 100 = " + random2+
                "\n 0 ≤ n ≤ 9 = " + random3 +
                "\n 1000 ≤ n ≤ 1112 = " + random4 +
                "\n -1 ≤ n ≤ 1 = " + random5 +
                "\n -3 ≤ n ≤ 11 = " + random6);

    }
}