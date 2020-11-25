//Program to find the GCD of two numbers

import java.util.*;

class GCDOf2Numbers {

    private int gcd(int a, int b) {
        if(a==0) {
            return b;
        }
        if(b==0) {
            return a;
        }
        if(a==b) {
            return a;
        }
        if(a>b) {
            return gcd(a-b,b);
        }
        else {
            return gcd(a,b-a);
        }
    }
    public static void main(String args[]) {
        int a,b,hcf=1;

        Scanner s = new Scanner(System.in);
        GCDOf2Numbers obj = new GCDOf2Numbers();

        System.out.print("Enter two numbers to find GCD: ");
        a = s.nextInt();
        b = s.nextInt();
        hcf = obj.gcd(a,b);
        System.out.print("HCF = "+hcf);
    }
}