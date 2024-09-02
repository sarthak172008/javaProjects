import java.util.*;

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int func = sc.nextInt();
    double a = sc.nextInt();
    double b = sc.nextInt();

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
