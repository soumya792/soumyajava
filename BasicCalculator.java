import java.util.Scanner;

class Calculator {

    
    public int add(int x, int y) {
        return x + y;
    }

   
    public int sub(int x, int y) {
        return x - y;
    }

    
    public int mul(int x, int y) {
        return x * y;
    }

    
    public int div(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return x / y;   // integer division
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operator (+ - * /):");
        char op = sc.next().charAt(0);

        
        Calculator obj = new Calculator();

        int result = 0;

        
        switch (op) {
            case '+':
                result = obj.add(a, b);
                break;

            case '-':
                result = obj.sub(a, b);
                break;

            case '*':
                result = obj.mul(a, b);
                break;

            case '/':
                result = obj.div(a, b);
               break;

            default:
                System.out.println("envalid operator");
                return;
        }

        System.out.println("Final Result:");
        System.out.println(a + " " + op + " " + b + " = " + result);
    }
}