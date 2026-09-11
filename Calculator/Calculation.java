package Calculator;

public class Calculation {
    public static void calculator(char path, double a, double b) {
        
        System.out.println("Your answer is :");
        switch(path){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : if (b==0) {
                System.out.println("Invalid Denominator");
            } else {
                System.out.println(a%b);
            }
            break;
            default: System.out.println("Invalid Calculation");
        }
    }
}
