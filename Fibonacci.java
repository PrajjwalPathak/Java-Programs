//Program to generate Fibonacci series of n elements

import java.util.*;

class Fibonacci {
    
    public static void main(String args[]) {
        int n, i, t1=1, t2=1, t3;
        Scanner s = new Scanner(System.in);

        System.out.print("Write a positive number to print Fibonaci series: ");
        n = s.nextInt();
        if(n==1) {
            System.out.print(t1);
        }
        else if(n==2) {
            System.out.print(t1+" "+t2);
        }
        else {
            System.out.print(t1+" "+t2+" ");
            for(i=2;i<n;i++) {
                t3 = t1+t2;
                System.out.print(t3+" ");
                t1=t2;
                t2=t3;
            }
        }
    }
}