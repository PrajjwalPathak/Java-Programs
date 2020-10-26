//Program to demonstrate the use of switch case
//Apply arithmatic operations

import java.util.*;

class SwitchChoice {
    public static void main(String args[]) {
        float num1, num2;
        char op;

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        num1 = s.nextFloat();
        System.out.println("Enter 2nd Number: ");
        num2 = s.nextFloat();
        System.out.println("Enter operation ( +  -  *  / ): ");
        op = s.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println("Answer: "+(num1+num2));
                break;
            case '-':
                System.out.println("Answer: "+(num1-num2));
                break;
            case '*':
                System.out.println("Answer: "+(num1*num2));
                break;
            case '/':
                System.out.println("Answer: "+(num1/num2));
                break;
            default: 
                System.out.println("Invalid Input");
        }
    }
}
