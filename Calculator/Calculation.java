package Calculator;

public class Calculation {
    public static void calculator(int path, double a, double b) {
        
        System.out.println("Your answer is :");
        switch(path){
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            case 5 : if (b==0) {
                System.out.println("Invalid Denominator");
            } else {
                System.out.println(a%b);
            }
            break;
            default: System.out.println("Invalid Calculation");
        }
    }
}
