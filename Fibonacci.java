//Program to display the fibonacci series from a start point to the end point

import java.util.*;

class Fibonacci {

	public static void main(String args[]) {
    	
    	int num, f0 = 0, f1 = 1, temp;
    	System.out.print("Enter the position of the term in Fibonacci Series: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        if(num == 1) {
            System.out.println("Answer: 0");
        }
        else if(num == 2) {
            System.out.println("Answer: 1");
        }
        else {
            for(int i = 1; i < num-1; i++) {
                temp = f1;
                f1 = f1 + f0;
                f0 = temp;
            }
            System.out.println("Answer: "+ f1);
		}
	}
}
