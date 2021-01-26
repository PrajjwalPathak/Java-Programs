//Program to print prime numbers in between x and y

import java.util.*;

public class PrimeBetweenXY {
    int n, i, isPrime=1;

    void primeBetweenXY(int x, int y) {
        for(n=x;n<=y;n++) {
            if(n==0 || n==1) {
                isPrime=0;
            }
            else if(n==2) {
                isPrime=1;
            }
            else {
                for(i=2;i<=n/2;i++) {
                    if(n%i==0) {
                        isPrime=0;
                    }
                    else {
                        isPrime=1;
                    }
                }
            }
            if(isPrime==1) {
                System.out.print(n+" ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeBetweenXY obj;
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter x and y to print prime numbers in between them: ");
        x = scan.nextInt();
        y = scan.nextInt();
        obj = new PrimeBetweenXY();
        obj.primeBetweenXY(x,y);
    }
}
