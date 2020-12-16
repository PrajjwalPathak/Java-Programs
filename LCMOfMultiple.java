//Program to find the LCM of multiple numbers

import java.util.*;

class LcmOfMultiple {
    public int LCMOf2(int a, int b) {
        if(a==0 || b==0) {
            return 0;
        }
        else {
            int max = (a>b)?a:b;
            while(true) {
                if(max%a==0 && max%b==0) {
                    return max;
                }
                else {
                    max++;
                }
            }
        }
    }

    public int LCMOfMulti(int A[], int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=1; j<n; j++) {
                A[j] = LCMOf2(A[i],A[j]);
            }
        }
        return A[n-1];
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = s.nextInt();
        int A[] = new int[n];
        System.out.println("Enter n numbers to find LCM: ");
        for(int i=0; i<n; i++) {
            A[i] = s.nextInt();
        }
        LcmOfMultiple obj = new LcmOfMultiple();
        int l = obj.LCMOfMulti(A,n);
        System.out.print("LCM = "+l);
    }
}