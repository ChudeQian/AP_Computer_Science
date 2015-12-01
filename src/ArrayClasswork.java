/**
 * Created by Qian on 12/1/2015.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClasswork {
    public static void main(String Args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input how many grades you have");
        int number = kboard.nextInt();

        int[] testScores = new int[number];
        for (int count = 0; count < testScores.length; count++) {
            System.out.println("Please input your scores: ");
            int Grade = kboard.nextInt();
            testScores[count] = Grade;
        }
        double sum = 0;
        for (int count = 0; count < testScores.length; count++) {
            sum += testScores[count];
        }
        System.out.println("The average is: " + (sum / testScores.length));
        System.out.println(Arrays.toString(testScores));
    }

}
