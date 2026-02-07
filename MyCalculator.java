import java.util.Scanner;

abstract class Calc {
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}

public class MyCalculator extends Calc {

    @Override
    void add(int a, int b) {
        System.out.println("Result: Add " + a + " + " + b + " = " + (a + b));
    }

    @Override
    void sub(int a, int b) {
        System.out.println("Result: Sub " + a + " - " + b + " = " + (a - b));
    }

    @Override
    void multiply(int a, int b) {
        System.out.println("Result: Mul " + a + " * " + b + " = " + (a * b));
    }

    @Override
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Result: Div " + a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Error: Division by zero!");
        }
    }

    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Choice Based Calculator ---");
        System.out.println("1. Add\n2. Sub\n3. Multiply\n4. Divide");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        if (choice == 1) {
            obj.add(n1, n2);
        } else if (choice == 2) {
            obj.sub(n1, n2);
        } else if (choice == 3) {
            obj.multiply(n1, n2);
        } else if (choice == 4) {
            obj.divide(n1, n2);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}