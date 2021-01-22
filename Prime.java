//Program to find if a number is prime or not

import java.util.*;

class Prime {
    public static void main(String args[]) {
        int i,n,flag=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();
        if(n==0 || n==1) {
            System.out.print("Not a Prime");
        }
        else if(n==2 || n==3) {
            System.out.print("Prime");
        }
        else {
            for(i=2;i<=n/2;i++) {
                if(n%i==0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print("Prime");
            }
            else {
                System.out.print("Not a Prime");
            }
        }
    }
}
