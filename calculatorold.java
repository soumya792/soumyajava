 import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("enter the operation (+,_,*,/)");
        char op = sc.next() charAt(0);
         if (op =='+') {
        System.out.println( (a + b));
         }
         else if ( op=='-'){
        System.out.println(a - b);
         }
         else if (op == '*'){
        System.out.println(a * b);
         }
         else if(op=='/'){

        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Division is: " + (a / b));
        }
    }

        sc.close();
    }
} 
    

