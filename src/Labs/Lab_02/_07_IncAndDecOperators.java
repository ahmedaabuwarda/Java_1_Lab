package Labs.Lab_02;

public class _07_IncAndDecOperators {
    public static void main(String[] args) {

        int i = 1;
        int j = 0;
        System.out.println("\n i = 1 \n" +
                " j = 0 \n" + "\n j = ++i  >>  " + (j = ++i) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = i++  >>  " + (j = i++) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = i--  >>  " + (j = i--) +
                "\n i = " + i);

        i = 1;
        j = 0;
        System.out.println(" j = --i  >>  " + (j = --i) +
                "\n i = " + i);

    }
}