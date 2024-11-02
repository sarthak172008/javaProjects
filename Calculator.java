import java.util.*;

public class Calculator {
    public static void calculator(int path, double a, double b) {
        switch(path) {
            case 1: System.out.println("your answer is : "+(a+b));
            break;
            case 2: System.out.println("your answer is : "+(a-b));
            break;
            case 3: System.out.println("your answer is : "+(a*b));
            break;
            case 4: System.out.println("your answer is : "+(a/b));
            break;
            case 5: if(b==0) {
                System.out.println("Invalid Calculation");
            } else {
                System.out.println("your answer is : "+(a%b));
            }
            break;
            default: System.out.println("Invalid Path");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Addition || Enter 2 for Subtration || Enter 3 for Multiplaction || Enter 4 Divition || Enter 5 for Modulo");
        int path = sc.nextInt();
        System.out.print("Enter your first Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter your second Number : ");
        double b = sc.nextDouble();

        calculator(path, a, b);
    }
}
