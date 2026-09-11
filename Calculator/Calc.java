package Calculator;
import java.util.Scanner;

public class Calc{

    public static void main(String args[]) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your first number");
        double a = sc.nextDouble();

        System.out.println("Enter your Calculation path");
        System.out.println("||+ for Addition|| ||- for Subtraction|| ||* for Multiplication|| ||/ for Division|| ||% for Modulo||");
        char path = sc.next().charAt(0);

        System.out.println("Enter your second number");
        double b = sc.nextDouble();
        
        Calculation.calculator(path, a, b);
    }
}
