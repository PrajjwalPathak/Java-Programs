import java.util.*;
public class SortAsc {    
    public static void main(String[] args) {        
                
        int[] arr = new int[10];
        int temp = 0; 
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter 10 integers: ");
        for(int i=0;i<10;i++) {
            arr[i] = s.nextInt();
        }         
               
        for (int i = 0; i < 10; i++) {     
            for (int j = i+1; j < 10; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                }     
            }     
        }    
              
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}