//Program to check if a number is a palindrome or not

import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        int n, t, r = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = s.nextInt();
        t = n;
        while(t!=0) {
            r=r*10+t%10;
            t=t/10;
        }
        System.out.println("Reverse is: "+r);
        
        if(n == r) {
            System.out.print("Number is a Palindrome");
        }
        else {
            System.out.print("Number isn't a Palindrome");
        }
    }
}
