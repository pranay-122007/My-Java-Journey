
class Calculator {
    int num = 5;
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class MemorySimulation {
    public static void main(String[] args) {

        int data = 10;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        obj.num = 8; 

        // Verification of execution
        System.out.println("Local Stack Variable 'data': " + data);
        System.out.println("Heap Instance 1 (obj.num): " + obj.num);   // Outputs 8
        System.out.println("Heap Instance 2 (obj1.num): " + obj1.num); // Outputs 5 (Unchanged)
    }
}
