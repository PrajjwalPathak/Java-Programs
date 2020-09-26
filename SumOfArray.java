import java.util.*;

class SumOfArray {
public static void main(String args[]) {
    int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int i,sum = 0;
    for(i=0;i<10;i++) {
        sum = sum + a[i];
    }
    System.out.println("Sum of array elements is: "+sum);
    }
}