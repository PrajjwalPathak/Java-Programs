//Program to generate multiplication table

import java.util.*;

class MultiplicationTable {
    
    public static void main(String args[]) {
        int n, i, p;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        n = s.nextInt();
        for(i=1;i<11;i++) {
            p = n*i;
            System.out.println(n+" x "+i+" = "+p);
        }
    }
}