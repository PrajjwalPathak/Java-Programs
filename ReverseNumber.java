//Program to find the reverse of a number

import java.util.*;

class ReverseNumber {

    private int reverse(int n) {
        int rem, rev = 0;
        while(n!=0) {
            rem = n%10;
            rev = rev*10 + rem;
            n /=10;
        }
        return rev;
    }

    public static void main(String args[]) {

        int n,r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        n = s.nextInt();
        ReverseNumber obj = new ReverseNumber();
        r = obj.reverse(n);
        System.out.print("Reversed Number: "+r);
        
    }
}
