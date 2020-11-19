//Program to calculate the factorial of a number

import java.util.*;

class Factorial {
    
    public static void main(String args[]) {
        int n,i;
        long f=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        for(i=1;i<=n;i++) {
            f=f*i;
        }
        System.out.println("Factorial is "+f);
    }
}