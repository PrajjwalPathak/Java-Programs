//Program to calculate the area of triangle

import java.util.*;
import java.lang.*;

class TriangleArea {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        float a,b,c;
        double A,S;
        System.out.print("Enter the length of the sides: ");
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        if(a+b>c && a+c>b) {
            S=(a+b+c)/2;
            A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
            System.out.println("Area is "+String.format("%.3f",A));
        }
        else {
            System.out.println("Invalid Triangle");
        }
    }
}