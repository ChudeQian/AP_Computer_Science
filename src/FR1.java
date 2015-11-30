/**
 * Created by Qian on 11/23/2015.
 */
//Done

import java.util.Scanner;

public class FR1 {
    public static void main(String args[]) {
        System.out.println("Please give your input");
        Scanner kboard = new Scanner(System.in);
        String userInput = kboard.nextLine();
        String firstLast = convertName(userInput);
        System.out.println(firstLast);
    }

    public static String convertName(String nameOriginal) {
        int place_holder = nameOriginal.indexOf(',');
        String finalString = "";
        finalString += nameOriginal.substring(place_holder + 2) + " " + nameOriginal.substring(0, place_holder);
        return finalString;

    }
}
