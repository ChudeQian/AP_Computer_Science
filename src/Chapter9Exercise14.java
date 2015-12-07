import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Qian on 12/6/2015.
 */
public class Chapter9Exercise14 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input your size of the sqaure matrix: ");
        int size = kboard.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.println("Please input number for ( " + row + " , " + col + " ): ");
                matrix[row][col] = kboard.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        int local = 0; //record the largest
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] > local) {
                    local = matrix[row][col];
                }
            }
        }
        System.out.println("The largest is: " + local);
    }
}
