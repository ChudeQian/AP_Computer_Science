import java.util.Arrays;

/**
 * Created by Qian on 12/4/2015.
 */
public class Array2DClasswork {
    public static void main(String args[]) {
        int[][] test = new int[3][2];
        for (int row = 0; row < test.length; row++) {
            System.out.println(Arrays.toString(test[row]));
        }
        System.out.println();
        System.out.println();
        for (int row = 0; row < test.length; row++) {
            for (int col = 0; col < test[0].length; col++) {
                test[row][col] += row + col;
            }
        }
        System.out.println();
        System.out.println();
        for (int row = 0; row < test.length; row++) {
            System.out.println(Arrays.toString(test[row]));
        }
        double sum = 0;
        for (int row = 0; row < test.length; row++) {
            for (int col = 0; col < test[0].length; col++) {
                sum += test[row][col];
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(sum
        );
    }
}
