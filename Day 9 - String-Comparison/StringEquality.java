public class StringEquality {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        // Reference Check (Memory Location)
        System.out.println("Reference Check (s1 == s2): " + (s1 == s2)); // true
        System.out.println("Reference Check (s1 == s3): " + (s1 == s3)); // false

        // Content Check (Actual Text)
        System.out.println("Content Check (s1.equals(s3)): " + s1.equals(s3)); // true
    }
}