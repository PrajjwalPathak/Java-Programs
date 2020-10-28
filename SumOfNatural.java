//Program to calculate the sum of natural numbers till n 

import java.util.*;

class SumOfNatural {

    public static void main(String args[]) {
        int n,i,Sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n to find sum of n natural numbers:");
        n=s.nextInt();

        for(i=1;i<=n;i++) {
            Sum = Sum + i;
        }

        System.out.print("Sum is ");
        System.out.print(Sum);
    }
}