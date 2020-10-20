//Program to find if a number is Armstrong or not

import java.util.*;

class Armstrong {
    public static void main(String args[]) {
        int num, temp, arm = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 3 digit number: ");
        num = s.nextInt();
        if(num < 100 || num > 999) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        temp = num;
        while (temp != 0) {
            arm = arm + ((temp % 10)*(temp % 10)*(temp % 10));
            temp /= 10;
        }

        if(arm == num) {
            System.out.println("It is an Armstrong Number");
        }
            
        else {
            System.out.println("It isn't an Armstrong Number");
        }   
    }
}
