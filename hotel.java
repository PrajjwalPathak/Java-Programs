import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] hotel = new int [10][] ; 
        System.out.println("Enter 0 for vacant and 1 for taken ");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter the number of rooms on " +(i+1)+ " floor");
            int rooms = s.nextInt();
            hotel[i] = new int[rooms];
            System.out.println("Enter the status of rooms on this floor");
            for(int j = 0; j < rooms; j++)
            {
                hotel[i][j] = s.nextInt();
            }
        }
        int vacant, occupied, total;
        vacant = 0;
        occupied = 0;
        total = 0;
        for(int i = 0; i < 10; i++)
        {
            for( int j = 0; j < hotel[i].length; j++)
            {
                total++;
                if(hotel[i][j] == 0)
                {
                    vacant++;
                }
                else
                {
                    occupied++;
                }
            }
        }
        System.out.println("Total rooms: " +total);
        System.out.println("occupied rooms: " +occupied);
        System.out.println("Vacant rooms: " +vacant);
        s.close();
    }
}
