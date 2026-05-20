import java.util.Scanner;

public class InoutOutput {
    public static void main(String[] args) {
        // Instantiate the scanner object linked to standard input
        Scanner sc = new Scanner(System.in);

        // 1. Reading an Integer
        System.out.print("Enter an integer value: ");
        int integerData = sc.nextInt();

        // 2. Reading a Float
        System.out.print("Enter a float value: ");
        float floatData = sc.nextFloat();

        // 3. Reading a single word
        System.out.print("Enter a single word: ");
        String singleWord = sc.next();

        // Crucial: Clear the input buffer manually
        // This consumes the trailing newline character left behind by sc.next()
        sc.nextLine(); 

        // 4. Reading a full sentence
        System.out.print("Enter a complete sentence: ");
        String fullSentence = sc.nextLine();

        // Displaying captured data
        System.out.println("\n--- Captured Values Summary ---");
        System.out.println("Integer: " + integerData);
        System.out.println("Float: " + floatData);
        System.out.println("Word: " + singleWord);
        System.out.println("Sentence: " + fullSentence);

        // Close the scanner resource to avoid memory leakage
        sc.close();
    }
}