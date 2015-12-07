import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Qian on 12/6/2015.
 */
public class Chapter9Exercise15 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input your size of the sqaure matrix: ");
        int row_init = kboard.nextInt();
        int col_init = kboard.nextInt();
        String[][] matrix = new String[row_init][col_init];
        int localSwitch = 0;
        for (int row = 0; row < matrix.length; row++) {
            if ((row + 1) % 2 == 1) {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (localSwitch == 0) {
                        matrix[row][col] = "x";
                        localSwitch = 1;
                    } else {
                        matrix[row][col] = ".";
                        localSwitch = 0;
                    }
                }
                localSwitch = 0;
            } else {
                for (int col = 0; col < matrix[0].length; col++) {
                    if (localSwitch == 1) {
                        matrix[row][col] = "x";
                        localSwitch = 0;
                    } else {
                        matrix[row][col] = ".";
                        localSwitch = 1;
                    }
                }
                localSwitch = 0;
            }

        }
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
    }
}