public class StringMemory {
    public static void main(String[] args) {
        
        //case 1: Literals (SCP)
        String str1 = "OpenSource";
        String str2 = "OpenSource";

        // Case 2: New Keyword (Heap)
        String str3 = new String("OpenSource");

        System.out.println("--- Memory Reference Test--- ");
        // str1 and str2 point to the same object in SCP
        System.out.println("Aare str1 and str2 same address? " + (str1 == str2)); // true

        //vstr3 is a new object in the Heap, different address
        System.out.println("Are str1 and str3 same address? " + (str1 == str3)); // false
    }
}
