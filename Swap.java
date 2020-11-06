//Program to swap two numbers

import java.util.*;

class Swap {

    public static void main(String args[]) {

        int a,b,t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = s.nextInt();
        System.out.print("Enter b: ");
        b = s.nextInt();
        t=a;
        a=b;
        b=t;
        System.out.println("After Swaping");
        System.out.println("a = "+a);
        System.out.print("b = "+b);
    }
}