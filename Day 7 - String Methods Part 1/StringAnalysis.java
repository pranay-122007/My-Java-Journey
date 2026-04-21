public class StringAnalysis {
    public static void main(String[] args) {
        String course = "Java Masterclass";

        // 1. Measuring length
        int totalLength = course.length();

        // 2. Accessing characters by index
        char firstLetter = course.charAt(0);
        char lastLetter = course.charAt(totalLength - 1);

        
        // 4. Safe printing of results
        System.out.println("Full String: " + course);
        System.out.println("Total Characters: " + totalLength);
        System.out.println("Character at index 0: " + firstLetter);
        System.out.println("Character at last index: " + lastLetter);
    }   
}