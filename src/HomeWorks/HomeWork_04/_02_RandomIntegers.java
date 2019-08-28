/**
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_04;

/**
 * @author Ahmed Abuwarda on: Aug 29,2019.
 */
public class _02_RandomIntegers {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

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
                "\n 1 ≤ n ≤ 100 = " + random2 +
                "\n 0 ≤ n ≤ 9 = " + random3 +
                "\n 1000 ≤ n ≤ 1112 = " + random4 +
                "\n -1 ≤ n ≤ 1 = " + random5 +
                "\n -3 ≤ n ≤ 11 = " + random6);

    }

}