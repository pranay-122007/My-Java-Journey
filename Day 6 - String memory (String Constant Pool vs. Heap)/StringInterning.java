public class StringInterning {
    public static void main(String[] args) {
        String heapString = new String("Java");
        
        // Moving the reference to the Pool
        String poolString = heapString.intern(); 
        
        String literalString = "Java";

        System.out.println("--- Interning Test ---");
        System.out.println("Is interned string same as literal? " + (poolString == literalString)); // true
    }
}