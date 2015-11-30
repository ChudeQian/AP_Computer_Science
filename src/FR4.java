import java.util.Scanner;

/**
 * Created by Qian on 11/30/2015.
 */
public class FR4 {
    public static void main(String args[]) {
        System.out.println("Please give your input");
        Scanner kboard = new Scanner(System.in);
        String userInput = kboard.nextLine();
        System.out.println("This word is Palindorme: " + isPalindorme(userInput));
    }

    public static boolean isPalindorme(String word) {
        int wordLength = word.length();
        int counter = 0;
        String newString = "";
        while (counter < wordLength) {
            newString += word.charAt(wordLength - 1 - counter);
            counter++;
        }
        if (newString.equals(word)) {
            return true;
        } else {
            return false;
        }
    }
}
