import java.util.Scanner;

/**
 * Created by Qian on 11/30/2015.
 */
public class FR3 {
    public static void main(String args[]) {
        System.out.println("Please give your input");
        Scanner kboard = new Scanner(System.in);
        String userInput = kboard.nextLine();
        System.out.println(toCanonicalForm(userInput));
    }

    public static String toCanonicalForm(String address) {
        String newString = "";
        int length = address.length();
        int counter = 0;
        while (counter <= length - 1) {
            Character local = address.charAt(counter);
            if (Character.isLetterOrDigit(local)) {
                newString += Character.toUpperCase(local);
            } else {
                newString += " ";
            }
            counter += 1;
        }
        return newString;
    }

}
