//Program to demonstrate Linear Search Algorithm

import java.util.*;  
   
class LinearSearch {  

    public static void main(String args[]) { 

        int c, n, item, array[];  
   
        Scanner in = new Scanner(System.in);  

        System.out.println("Enter number of elements");  
        n = in.nextInt();   
        array = new int[n]; 

        System.out.println("Enter those " + n + " elements");  
   
        for(c=0;c<n;c++) {
            array[c] = in.nextInt();  
        }

        System.out.println("Enter value to find");  
        item = in.nextInt();  
   
        for(c = 0; c < n; c++) {  
            if (array[c] == item) {  
                System.out.println(item + " is present at location " + (c + 1));  
                break;  
            }  
        } 
         
        if(c == n) {
            System.out.println(item + " isn't present in array.");  
        }  
    }  
} 