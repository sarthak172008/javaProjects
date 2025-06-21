package Calculator;
import java.util.Scanner;

public class Calc{

    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Calculation path");
        System.out.println("||1 for Addition|| ||2 for Subtraction|| ||3 for Muiltiplaction|| ||4 for Division|| ||5 for Modulo||");
        int path = sc.nextInt();

        System.out.println("Enter your first number");
        double a = sc.nextDouble();

        System.out.println("Enter your second number");
        double b = sc.nextDouble();
        
        Calculation.calculator(path, a, b);
    }
}
