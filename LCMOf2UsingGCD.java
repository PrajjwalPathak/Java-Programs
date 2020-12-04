//Program to find LCM of 2 numbers

import java.util.*;

class LCMOf2UsingGCD {
    private int gcd(int a, int b) {
        
        if(a==0) {
            return b;
        }
        else {
            return gcd(b%a,a);
        }
    }
    
    public static void main(String args[]) {
        
        int a, b, hcf=1, lcm=1;
        Scanner s = new Scanner(System.in);
        LCMOf2UsingGCD obj = new LCMOf2UsingGCD();

        System.out.print("Enter 2 numbers to find LCM: ");
        a = s.nextInt();
        b = s.nextInt();
        hcf = obj.gcd(a,b);
        lcm = a*b/hcf;
        System.out.println("LCM = "+lcm);
    }
}
