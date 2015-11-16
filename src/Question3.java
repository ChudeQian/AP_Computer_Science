/**
 * Created by Qian on 11/15/2015.
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        String init = kboard.nextLine();
        String result = removeDashes(init);
        System.out.println(result);
    }

    private static String removeDashes(String full) {
        String local = full;
        String newString = full.substring(0, 3) + full.substring(4, 6) + full.substring(7, 10);
        return newString;
    }
}
