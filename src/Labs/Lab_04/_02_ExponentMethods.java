package Labs.Lab_04;

public class _02_ExponentMethods {
    public static void main(String[] args) {

        System.out.println("\n Method \t Description" +
                "\n exp(x) \t Returns e^x." +
                "\n log(x) \t Returns the Natural logarithm of x >> ln(x) = loge(x)." +
                "\n log10(x) \t Returns the base 10 logarithm of x." +
                "\n pow(a , b)  Returns (a raised to the power of b) a^b." +
                "\n sqrt(x)     Returns the square root of x.");

        System.out.println("\n Example:.. \n" +
                "\n exp(10) = " + Math.exp(10) +
                "\n log(10) = " + Math.log(10) +
                "\n log10(10) = " + Math.log10(10) +
                "\n pow(10 ,10)" + Math.pow(10 , 10) +
                "\n sqrt(10) = " +Math.sqrt(10));

    }
}