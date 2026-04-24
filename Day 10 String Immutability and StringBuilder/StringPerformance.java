public class StringPerformance {
    public static void main(String[] args) {
        // Initializing StringBuilder with an initial capacity
        StringBuilder sb = new StringBuilder("h");

        // 1. Efficient Concatenation (Appending)
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o"); // sb is now "hello"

        // 2. Modifying a specific character (In-place)
        sb.setCharAt(0, 'H'); // sb is now "Hello"

        // 3. Insertion Logic
        sb.insert(5, " World"); // sb is now "Hello World"

        // 4. Deletion Logic
        // Removes characters from index 5 to 11
        sb.delete(5, 11); // sb is now "Hello"

        // 5. Final Output
        System.out.println("Final Processed String: " + sb.toString());
        System.out.println("Current Length: " + sb.length());
    }
}