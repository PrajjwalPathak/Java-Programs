//Program to find the GCD of multiple numbers

import java.util.*;

class GCDOfMultiple {
    private int gcd(int a, int b) {
        if(a==0) {
            return b;
        }
        else {
            return gcd(b%a,a);
        }
    }

    private int gcdMultiple(int a[], int n) {
        int i, hcf=1;
        for(i=0;i<n-1;i++) {
            hcf = gcd(a[i],a[i+1]);
        }
        return hcf;
    }
    public static void main(String args[]) {
        int i, n, hcf=1;

        Scanner s = new Scanner(System.in);
        GCDOfMultiple obj = new GCDOfMultiple();

        System.out.print("Enter n: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter n numbers to find gcd: ");
        for(i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        hcf = obj.gcdMultiple(a,n);
        System.out.print("HCF = "+hcf);
    }
}
