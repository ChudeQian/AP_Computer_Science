import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Qian on 12/3/2015.
 */
public class Chapter9Exercise3 {
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

        System.out.println("The initial is: " + Arrays.toString(testScores));

        int n = testScores.length;
        int local = testScores[0];
        testScores[0] = testScores[n - 1];
        testScores[n - 1] = local;
        System.out.println("The final is: " + Arrays.toString(testScores));

    }
}
