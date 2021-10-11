  package Assignment8;

   import java.util.Scanner;

   public class Character {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

          Character.isUpperCase('A');
       }
       public static boolean isUpperCase(char upLetter) {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the word");
           String str = input.next();
           int count = 0;
           for (int i = 0; i < str.length(); i++) {
               upLetter = str.charAt(i);
               if (upLetter >= 'A' && upLetter <= 'Z') {
                   count++;
                   System.out.print(" ' " + upLetter + " ' ");
               }
           }
           System.out.println(" count of upper case: "  +  upLetter   +   count);
           return true;

       }

   }