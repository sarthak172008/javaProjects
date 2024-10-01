import java.util.*;

public class Calculator{
    public static void calculator(int method, double a, double b) {
        System.out.print("Your answer is : ");
        switch(method) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b==0) {
                System.out.println("invalid Division");
                } else {
                System.out.println(a/b);
            }
            break;
            case 5: if(b==0) {
                System.out.println("Invalid Division");
                } else {
                System.out.println(a%b);
            }
            break;
            default: System.out.println("Wrong path");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select calculation path");
        System.out.println("|1 for Addition| |2 for Subtraction| |3 for Multiplaction| |4 for Divition| |5 for Modulo|");
        int method = sc.nextInt();
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();

        calculator(method, a, b);
    }
}