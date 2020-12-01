//Program to find the GCD of two numbers

import java.util.*;

class GCDOf2UsingModOp {
    private int gcd(int a, int b) {
        if(a==0) {
            return b;
        }
        else {
            return gcd(b%a,a);
        }
    }

    public static void main(String args[]) {
        int a, b, hcf=1;

        Scanner s = new Scanner(System.in);
        GCDOf2UsingModOp obj = new GCDOf2UsingModOp();

        System.out.print("Enter two numbers to find GCD: ");
        a = s.nextInt();
        b = s.nextInt();
        hcf = obj.gcd(a,b);
        System.out.print("HCF = "+hcf);
    }
}