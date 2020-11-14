//Program to check if a character is a Vowel or a Consonant

import java.util.*;

class VowelConsonant {
    public static void main(String args[]) {
        char a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character to check if Vowel or Consonant: ");
        a = s.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}