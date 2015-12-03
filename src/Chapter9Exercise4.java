import java.util.Scanner;

/**
 * Created by Qian on 12/3/2015.
 */
public class Chapter9Exercise4 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input how many grades you have");
        int number = kboard.nextInt();

        int[] testScores = new int[number];
        for (int count = 0; count < testScores.length; count++) {
            System.out.println("Please input your scores: ");
            int Grade = kboard.nextInt();
            testScores[count] = Grade;
        }
        int local = testScores[0];
        for (int count = 1; count < testScores.length; count++) {
            if (local != testScores[count]) {
                System.out.println("The " + (count - 1) + " and the " + count + " are different");
            } else {
                System.out.println("The " + (count - 1) + " and the " + count + " are Same");
            }
            local = testScores[count];
        }
        //in theory, if 1 and 2 are different, this program can end. but i just want to make fun.
    }
}
