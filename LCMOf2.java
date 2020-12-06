//Program to find LCM of 2 numbers

import java.util.*;

class LCMOf2 {

    private int lcm(int a, int b) {
        int max;
        max = (a>b)?a:b;
        if(a==0 || b==0) {
            return 0;
        }
        else {
            max = (a>b)?a:b;
            while(true) {
                if(max%a==0  && max%b==0) {
                    return max;
                }
                max++;
            }
        }
    } 

    public static void main(String args[]) {
        int a, b, l=1;
        Scanner s = new Scanner(System.in);
        LCMOf2 obj = new LCMOf2();
        System.out.print("Enter 2 numbers to find LCM: ");
        a = s.nextInt();
        b = s.nextInt();
        l = obj.lcm(a,b);
        System.out.println("LCM = "+l);
    }
}