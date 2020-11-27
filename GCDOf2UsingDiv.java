//Program to find the GCD of two numbers using divisibility test

import java.util.*;

class GCDOf2UsingDiv {

    private int gcd(int a, int b) {
        int c, i, hcf=1;

        if(a==b) {
            hcf = a;
        }
        if(a>b) {
            c = b;
        }
        else {
            c = a;
        }
        for(i=1;i<=c;i++) {
            if(a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        return hcf;
    }
    public static void main(String args[]) {
        int a, b, hcf=1;

        Scanner s = new Scanner(System.in);
        GCDOf2UsingDiv obj = new GCDOf2UsingDiv();

        System.out.print("Enter two numbers to find GCD: ");
        a = s.nextInt();
        b = s.nextInt();
        hcf = obj.gcd(a,b);
        System.out.print("HCF = "+hcf);
    }
}