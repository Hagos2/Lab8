package Assignment8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Palindrome word");
        String word = input.next();
        String result= "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt((word.length() - 1)-i) ) {
                result=( word +" is Palindrome");
            }
            else {
               result=( word + "is not Palindrome");
            }
        }
        System.out.print(result);
    }
}