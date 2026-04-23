public class StringCaseCheck {
    public static void main(String[] args) {
        String original = "JAVA";
        String lower = "java";

        System.out.println("Regular Equals: " + original.equals(lower)); // false
        System.out.println("Ignore Case Equals: " + original.equalsIgnoreCase(lower)); // true
    }
}