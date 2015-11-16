/**
 * Created by Qian on 11/15/2015.
 */

import java.util.Scanner;

public class Question13 {
    public static void main(String args[]) {
        System.out.println("Please input your prefix");
        Scanner kboard = new Scanner(System.in);
        String prefix = kboard.nextLine();
        System.out.println("Please input your word");
        String test = kboard.nextLine();
        System.out.println("Please input your suffix");
        String suffix = kboard.nextLine();
        System.out.println("myStartwith: " + myStartsWith(prefix, test));
        System.out.println("myEndwith: " + myendsWith(suffix, test));


    }

    public static boolean myStartsWith(String prefix, String testee) {
        int length = prefix.length();
        String comparee = testee.substring(0, length);
        //System.out.println(comparee);

        if (prefix.equals(comparee)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean myendsWith(String suffix, String testee) {
        int length = suffix.length();
        int lengthOriginal = testee.length();
        String comparee2 = testee.substring(lengthOriginal - length, lengthOriginal);
        //System.out.println(comparee2);

        if (suffix.equals(comparee2)) {
            return true;
        } else {
            return false;
        }
    }
}
