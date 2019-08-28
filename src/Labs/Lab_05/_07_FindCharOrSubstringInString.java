package Labs.Lab_05;

public class _07_FindCharOrSubstringInString {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println(message.indexOf('W') + "\n" + // returns 0
                message.indexOf('o') + "\n" + // returns 4
                message.indexOf('o', 5) + "\n" + // returns 9
                message.indexOf("come") + "\n" + // returns 3
                message.indexOf("Java", 5) + "\n" + // returns 11
                message.indexOf("java", 5) + "\n" + // returns -1 if not matched
                message.lastIndexOf('W') + "\n" + // returns 0
                message.lastIndexOf('o') + "\n" + // returns 9
                message.lastIndexOf('o', 5) + "\n" + // returns 4
                message.lastIndexOf("come") + "\n" + // returns 3
                message.lastIndexOf("Java", 5) + "\n" + // returns -1.
                message.lastIndexOf("Java")); // returns 11
    }
}