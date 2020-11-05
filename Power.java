//Program to find the pth power of a number

import java.util.*;

class Power {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter base and exponent : ");
        int b = s.nextInt();
        int e = s.nextInt();
        long p = 1;

        for(int i = 1; i <= e; i++) {
            p = p * b;
        }

        System.out.print("\nResult " + b + " ^ " + e + " : " + p);
    }
}