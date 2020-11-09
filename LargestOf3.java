//Program to find largest of 3 numbers

import java.util.*;
public class LargestOf3 {
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 numbers to compare: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if(a>b) {
            if(a>c) {
                System.out.print(a+" is the largest number");
            }
            else {
                System.out.print(c+" is the largest number");
            }
        }
        else {
            if(b>c) {
                System.out.print(b+" is the largest number");
            }
            else {
                System.out.print(c+" is the largest number");
            }
        }
    }
}