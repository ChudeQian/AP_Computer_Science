import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Qian on 12/3/2015.
 */
public class Chapter9Exercise7 {
    public static void main(String args[]) {
        double delta, deltaIndicator, a, b, c, r1, r2, part1, part2, counter;
        String ur1, ur2;
        counter = 0;

        Scanner kboard = new Scanner(System.in);
        System.out.println("The formula for quadratic is ax^2+bx^2+c=0");
        do {
            if (counter > 0) {
                throw new IllegalArgumentException("You suck! Don't you know a can't be ZERO when it is a quadratic formula?");
            }
            System.out.println("Please input a:");
            a = kboard.nextInt();
            counter++;

        } while (a == 0.0);
        System.out.println("Please input b:");
        b = kboard.nextInt();
        System.out.println("Please input c:");
        c = kboard.nextInt();


        delta = b * b - 4 * a * c;
        deltaIndicator = delta;
        if (delta > 0) {
            r1 = (b * (-1) + Math.sqrt(delta)) / (2 * a);
            r2 = (b * (-1) - Math.sqrt(delta)) / (2 * a);
            double[] result = {r1, r2};
            System.out.println("The result is: " + Arrays.toString(result));

        } else if (delta == 0) {
            r1 = (b * (-1) + Math.sqrt(delta)) / (2 * a);
            r2 = r1;
            double[] result = {r1};
            System.out.println("The result is: " + Arrays.toString(result));

        } else {
            delta = delta * (-1);
            part1 = b * (-1) / (2 * a);
            part2 = Math.sqrt(delta) / (2 * a);
            ur1 = ("" + part1 + "+" + part2 + "i");
            ur2 = ("" + part1 + "-" + part2 + "i");
            String[] result = {ur1, ur2};
            System.out.println("The result is: " + Arrays.toString(result));

        }
    }
}
