import java.util.*;

public class Arithmatic {
    public static void main(String args[]) {
        int a,b;
        float c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a and b: ");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        c=(float)a/b;
        System.out.println("Division: "+c);
    }
}

