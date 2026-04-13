public class NarrowingCasting {
    public static void main(String[] args) {
        //Narrowing Casting (Manual)
        double pi = 3.14159;
        int roundedPi = (int) pi; //Manual Casting: double to int

        System.out.println("Manual Casting");
        System.out.println("Original Casting:" + pi);
        System.out.println("Converted to Integer (Decimal lost):" + roundedPi);
    }
}
