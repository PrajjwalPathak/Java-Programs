import java.util.*;

public class EvenOdd {
    public static void main(String args[]) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();
        if(num % 2 == 0) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}

