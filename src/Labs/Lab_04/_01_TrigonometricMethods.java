package Labs.Lab_04;

public class _01_TrigonometricMethods {
    public static void main(String[] args) {

        System.out.println("\n Method \t\t\t Description" +
                "\n sin(radius) \t\t Returns the sine of an angle." +
                "\n cos(radius) \t\t Returns the cosine of an angle." +
                "\n tan(radius) \t\t Returns the tangent of an angle." +
                "\n toRadius(degree) \t Returns the angle in radius." +
                "\n toDegree(radius) \t Returns the angle in degree." +
                "\n asin(a) \t\t\t Returns the angle in radius for the inverse of sine." +
                "\n acos(a) \t\t\t Returns the angle in radius for the inverse of cosine." +
                "\n atan(a) \t\t\t Returns the angle in radius for the inverse of tangent.");

        System.out.println("\n Example:.. \n" +
                "\n sin(30) = " + Math.round(Math.sin(30)) +
                "\n cos(30) = " + Math.round(Math.cos(30)) +
                "\n tan(30) = " + Math.round(Math.tan(30)) +
                "\n toRadius(30) = " + Math.round(Math.toRadians(30)) +
                "\n toDegree(30) = " + Math.round(Math.toDegrees(30)) +
                "\n asin(30) = " + Math.round(Math.asin(30)) +
                "\n acos(30) = " + Math.round(Math.acos(30)) +
                "\n atan(30) = " + Math.round(Math.atan(30)));

    }
}