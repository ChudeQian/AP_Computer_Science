import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Qian on 12/6/2015.
 */
public class Chapter9Exercise13 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please input your size of the sqaure matrix: ");
        int size = kboard.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        System.out.println("Please input your matrix row number: ");
        int row = kboard.nextInt();
        System.out.println("Please input your matrix column number: ");
        int col = kboard.nextInt();
        if (row == col || ((size + 1 - row) == col)) {
            System.out.println("The point you inputted is on the diagnol.");
        } else {
            System.out.println("NO!!!!");
        }
    }
}
