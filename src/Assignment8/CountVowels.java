package Assignment8;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence");
        while (true) {
            //System.out.print("Enter the sentence");
            String str = input.nextLine();
            String str1 = str.toLowerCase();
            int counta = 0;
            int counte = 0;
            int count= 0;
            int counti = 0;
            int counto = 0;
            int countu = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str1.charAt(i) == 'a')
                    counta++;
                else if (str1.charAt(i) == 'e')
                    counte++;
                else if (str1.charAt(i) == 'i')
                    counti++;

                else if (str1.charAt(i) == 'o')
                    counto++;
                else if (str1.charAt(i) == 'u')
                    countu++;
            }
            System.out.println("# of 'a': " + counta);
            System.out.println("# of 'e':" + counte);
            System.out.println("# of 'i':" + counti);
            System.out.println("# of 'o': " + counto);
            System.out.println("# of 'u': " + countu);
        }

    }

}
