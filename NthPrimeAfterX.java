//Program to find nth prime number after a number x

import java.util.*;

class NthPrimeAfterX {
    public static void main(String args[]) {
 
        Scanner s = new Scanner(System.in);
    	System.out.print("Enter n to compute the nth prime number: ");
    	int n = s.nextInt();
    	System.out.print("Enter x: ");
    	int x = s.nextInt();
    
    	int num, count, i;
    	num=x;
    	count=0;
 
    	while (count < n){
      		num=num+1;
      		for (i = 2; i <= num; i++){
        		if (num % i == 0) {
          		break;
        		}
      		}
      	if ( i == num){
       		count = count+1;
     	}
    	}
    System.out.println("Value of nth prime: " + num);
    }
}