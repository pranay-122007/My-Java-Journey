public class StringValidation {
    public static void main(String[] args) {
        String email = "support@domain.com";

        // Validating the format
        boolean isSupportEmail = email.contains("support");
        boolean hasAtSymbol = email.contains("@");
        boolean isGmail = email.contains("gmail.com");

        System.out.println("Email for validation: " + email);
        System.out.println("Contains 'support'? " + isSupportEmail); // true
        System.out.println("Contains '@'? " + hasAtSymbol);         // true
        System.out.println("Is it a Gmail address? " + isGmail);    // false
    }
}
