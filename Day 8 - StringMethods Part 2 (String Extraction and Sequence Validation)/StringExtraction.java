public class StringExtraction {
    public static void main(String[] args) {
        String transactionID = "TXN-98234-DEBIT";

        // Extracting specific segments
        String prefix = transactionID.substring(0, 3); // Extracts "TXN"
        String idNumber = transactionID.substring(4, 9); // Extracts "98234"
        
        // Using a single parameter to get everything from index 10 onwards
        String type = transactionID.substring(10); // Extracts "DEBIT"

        System.out.println("Full ID: " + transactionID);
        System.out.println("Prefix: " + prefix);
        System.out.println("ID: " + idNumber);
        System.out.println("Type: " + type);
    }
}