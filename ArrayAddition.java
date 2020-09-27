import java.util.*;

class ArrayAddition {
public static void main(String args[]) {
    
    int i;
    int a[]=new int[5];
    int b[]=new int[5];
    int c[]=new int[5];

    Scanner s = new Scanner(System.in);

    System.out.print("Enter 1st array of 5 elements: ");

    for(i=0;i<5;i++) {
        a[i] = s.nextInt();
    }

    System.out.print("Enter 2nd array of 5 elements: ");

    for(i=0;i<5;i++) {
        b[i] = s.nextInt();
    }

    System.out.print("Sum of two arrays: ");

    for(i=0;i<5;i++) {
        c[i]=a[i]+b[i];
        System.out.print(" "+c[i]);
    }
}
}