//Program to reverse an array

import java.util.*;

class Reverse {
public static void main(String args[]) {
    int n, temp,res,i,j=0;

    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of elements in the array: ");
    n = s.nextInt();
    int array[] = new int[n];
    System.out.print("Enter "+n+" elements: ");

    for( i=0; i < n; i++) {
        array[i] = s.nextInt();
    }
    for( i=0;i<n ; i++,n--) {
	    temp=array[i];
	    array[i]=array[n-1];
	    array[n-1]=temp;    
    }

    System.out.print("Reverse of an array is :");
    for( i=0; i < array.length; i++) {
        System.out.print(" "+array[i]);
    }
}
}