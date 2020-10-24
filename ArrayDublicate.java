//Program to find the number of dublicate elements in an array

import java.util.*; 

class ArrayDublicate {
    public static void main(String args[]) {
        int[] A = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        for(int i=0;i<10;i++) {
            A[i] = s.nextInt();
        }
    
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if ((A[i] == A[j]) && (i != j)) {
                    System.out.println("Duplicate Element : "+A[j]);
                }
            }
        }
    }    
}