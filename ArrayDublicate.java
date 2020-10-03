import java.util.*; 

class ArrayDublicate {
  public static void main(String args[]) {
    int[] z = new int[10];
    Scanner s = new Scanner(System.in);

    System.out.print("Enter 10 integers: ");
    for(int i=0;i<10;i++) {
        z[i] = s.nextInt();
    }
 
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 10; j++) {
                if ((z[i] == z[j]) && (i != j)) {
                    System.out.println("Duplicate Element : "+z[j]);
                }
            }
        }
    }    
}