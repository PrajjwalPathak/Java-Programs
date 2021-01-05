//Program to find ASCII value of character

import java.util.*;

class ASCIIValue {
    public static void main(String args[]) {
        char i;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a character: ");
        i = s.next().charAt(0);
        System.out.print("The ASCII value is: "+(int)i);
    }
}
