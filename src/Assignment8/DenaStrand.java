package Assignment8;

import java.util.Scanner;

public class DenaStrand {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        Scanner input = new Scanner(System.in);
        String denaStrand = input.next();
        for (int i = 0; i < denaStrand.length(); i++) {
            if (denaStrand.charAt(i) == 'T') {
                str.append('A');
            }
            if (denaStrand.charAt(i) == 'A') {
                str.append('T');
            }
            if (denaStrand.charAt(i) == 'C') {
                str.append('G');
            }
            if (denaStrand.charAt(i) == 'G') {
                str.append('C');
            }
        }
        System.out.print(str.toString());
    }
}
