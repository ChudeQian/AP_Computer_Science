/**
 * Created by Qian on 11/15/2015.
 */

import java.util.Scanner;

public class Fr3 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        int n = kboard.nextInt();
        int p = 2;
        if (n > p) {

        }

        int counter = 1;
        double sum = 1;
        while (counter <= n) {
            sum = sum * counter;
            counter = counter + 1;
            System.out.println(sum);
        }
    }
}
