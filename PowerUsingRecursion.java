//Program to find the pth power of a number using recursion

import java.util.*;

class PowerUsingRecursion {
    private int power(int b, int p) {
        if(p!=0) {
            return (b*power(b,p-1));
        }
        else {
            return 1;
        }
    }

    public static void main(String args[]) {
        int b,p,r=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base: ");
        b = s.nextInt();
        System.out.print("Enter Power: ");
        p = s.nextInt();
        PowerUsingRecursion obj = new PowerUsingRecursion();
        r = obj.power(b,p);
        System.out.print("Result: "+r);
    }
}
