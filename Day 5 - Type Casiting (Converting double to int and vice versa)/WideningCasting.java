public class WideningCasting {
    public static void main(String[] args) {
        //Widening Casting (Automatic)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Automatic Casting :");
        System.out.println("Integer value :" + myInt);
        System.out.println("Converted to Double :" + myDouble);
    }
}
