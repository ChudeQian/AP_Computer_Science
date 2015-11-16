/**
 * Created by Qian on 11/15/2015.
 */

import java.util.Scanner;

public class Question2a {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input your String:");
        String test = kboard.nextLine();
        int length = test.length();
        if (test.equals("")) {
            System.out.println("False");
        } else if (test.charAt(length - 1) == '*') {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
