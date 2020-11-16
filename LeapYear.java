//Program to tell if the year is a Leap Year or not

import java.util.*;

class LeapYear {
    public static void main(String args[]) {
        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = s.next().charAt(0);
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("It is a Leap Year");
                }
                else {
                    System.out.println("It is not a Leap Year");
                }
            }
            else {
                System.out.println("It is a Leap Year");
            }
        }
        else {
            System.out.println("It is not a Leap Year");
        }
    }
}