/**
 * Created by Qian on 11/30/2015.
 */

import java.util.Scanner;

public class FR2 {
    public static void main(String args[]) {
        System.out.println("Please give your input your comparee");
        Scanner kboard = new Scanner(System.in);
        String userInput_1 = kboard.nextLine();
        System.out.println("Please give your input your prefix");
        String userInput_2 = kboard.nextLine();
        System.out.println("Please give your input your sufix");
        String userInput_3 = kboard.nextLine();

        System.out.println("The compare result is: " + myStartsWith(userInput_2, userInput_1));
        System.out.println("The compare result is: " + myEndsWith(userInput_3, userInput_1));

    }

    public static boolean myStartsWith(String prefix, String comparee) {
        int prefixLength = prefix.length();
        String trimed = comparee.substring(0, prefixLength);
        //System.out.println(trimed);
        if (trimed.equals(prefix)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean myEndsWith(String surfix, String comparee) {
        int surfixLength = surfix.length();
        int totalLength = comparee.length();
        String trimed = comparee.substring(totalLength - surfixLength);
        System.out.println(trimed);
        if (trimed.equals(surfix)) {
            return true;
        } else {
            return false;
        }
    }
}
