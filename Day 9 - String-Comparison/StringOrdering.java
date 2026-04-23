public class StringOrdering {
    public static void main(String[] args) {
        String word1 = "Apple";
        String word2 = "Banana";

        // Returns negative because 'A' comes before 'B'
        int comparisonResult = word1.compareTo(word2);

        System.out.println("Comparison Result (Apple vs Banana): " + comparisonResult);
        System.out.println("Comparison Result (Banana vs Apple): " + word2.compareTo(word1));
    }
}