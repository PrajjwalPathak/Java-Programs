//Program to convert the temperature from Celsius to Fahrenheit and vice-versa

import java.util.*;

class Degree {
    
    public static void main(String args[]) {
        
        float input, answer;
        int unit;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        input = s.nextFloat();
        System.out.println("Press '1' to convert to Fahrenheit and '2' to convert to Celsius : ");
        unit = s.nextInt();
        
        if(unit != 1 && unit != 2) {
            System.out.println("Invalid Input !");
            System.exit(0);
        }

        if(unit == 1) {
            answer = (input*9/5) + 32;
            System.out.println("Answer: "+answer+" F");
        }

        else {
            answer = (input - 32)*5/9;
            System.out.println("Answer: "+answer+" C");
        }
    }
}
