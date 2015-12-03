import java.util.Arrays;

/**
 * Created by Qian on 12/1/2015.
 */
public class Chapter9Exercise1 {
    public static void main(String Args[]) {
        int[] stupid = {1, 2, 3};
        System.out.println("This is part A: " + Arrays.toString(stupid));
        double sum = 0;
        for (int counter = 0; counter < stupid.length; counter++) {
            sum += stupid[counter];
        }
        System.out.println("The average is: " + sum / stupid.length);
    }
}
