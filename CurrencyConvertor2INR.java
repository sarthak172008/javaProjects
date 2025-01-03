import java.util.*;

public class CurrencyConvertor {
    public static void currnCalculation(int path, double a) {
        switch(path) {
            case 1: System.out.println(85.76*a);
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int path = in.nextInt();
        double a = in.nextDouble();
        currnCalculation(path, a);
    }
}
