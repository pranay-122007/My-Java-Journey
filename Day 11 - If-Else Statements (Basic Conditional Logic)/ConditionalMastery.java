import java.util.Scanner;

public class ConditionalMastery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EXAMPLE 1: Basic If-Else (Age Check) 
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Result: Adult");
        } else {
            System.out.println("Result: Not an Adult");
        }

        // EXAMPLE 2: Modulo Operator (Odd or Even) 
        System.out.print("\nEnter a number to check Odd/Even: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // EXAMPLE 3: Else-If Ladder (Comparison) 
        System.out.print("\nEnter two numbers (a and b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Relation: a is equal to b");
        } else if (a > b) {
            System.out.println("Relation: a is greater than b");
        } else {
            System.out.println("Relation: a is lesser than b");
        }

        sc.close();
    }
}
