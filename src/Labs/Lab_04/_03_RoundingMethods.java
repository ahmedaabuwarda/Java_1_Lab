package Labs.Lab_04;

public class _03_RoundingMethods {
    public static void main(String[] args) {

        System.out.println("\n Method \t Description" +
                "\n ceil(x) \t Rounded up to its nearest integer (double)." +
                "\n floor(x) \t Rounded down to its nearest integer (double)." +
                "\n rint(x) \t Rounded up > (x.5) > down  >>> (double)." +
                "\n round(x) \t Rounded up >= (x.5) > down >>> (int) float, (long) double.");

        System.out.println("\n Example:.. \n" +
                "\n ceil(10.1) = " + Math.ceil(10.1) +
                "\n floor(10.6) = " + Math.floor(10.6) +
                "\n rint(10.6) = " + Math.rint(10.6) +
                "\n round(10.1) = " + Math.round(10.1));

    }
}