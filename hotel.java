/*
Program to display number of rooms occupied and vacant in a Hotel having 10 floors
Input:
3        Number of rooms on the floor
1 1 1    Occupied and Vacant rooms
2
1 0
2
1 1
3
1 1 1  and so on
*/

import java.util.*;

class Hotel {

    public static void main(String args[]) {

        int o=0,v=0,i,r=0;
        int a[]=new int[10];

        Scanner s = new Scanner(System.in);
        
        System.out.println("There are 10 floors in this Hotel.");
        System.out.println("First Enter no. of rooms on each floor.");
        System.out.println("Then enter 1 for Occupied and 0 for Vacant rooms:");

        for(i=0;i<10;i++) {
            r = s.nextInt();
            for(int j=0;j<r;j++) {
                a[j] = s.nextInt();
            }
            for(int j=0;j<r;j++) {
                if(a[j]==1) {
                    o++;
                }
                else {
                    v++;
                }
            }
        }
        r=o+v;
        System.out.print("Total rooms: "+r+"  ");
        System.out.print("Occupied rooms: "+o+"  ");
        System.out.print("Vacant rooms: "+v);
    }
}