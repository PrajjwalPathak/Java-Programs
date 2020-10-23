//Program to take the array input from the user 

import java.util.*;

class ArrayInput {
public static void main(String args[]) {
    int[] z = new int[10];
    Scanner s = new Scanner(System.in);

    System.out.print("Enter 10 integers: ");

    for(int i=0;i<10;i++) {
        z[i] = s.nextInt();
    }

    System.out.print("The Array is: ");

    for(int i=0;i<10;i++) {
        System.out.print(" "+z[i]);
    }
  }
}