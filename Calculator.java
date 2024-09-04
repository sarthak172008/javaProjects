import java.util.*;

public static void calculator(int func, double a, double b) {
    switch(func) {
        case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: System.out.println(a/b);
        break;
        case 5: System.out.println(a%b);
        break;
        default: System.out.println("Wrong path");
    }
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Select calculation path");
    System.out.println("|1 for Addition| |2 for Subtraction| |3 for Multiplaction| |4 for Divition| |5 for Modulo|");
    int func = sc.nextInt();
    System.out.println("Enter first number");
    double a = sc.nextInt();
    System.out.println("Enter second number");
    double b = sc.nextInt();

    calculator(func, a, b);
}
