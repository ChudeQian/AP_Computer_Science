/**
 * Created by Qian on 11/10/2015.
 */
public class Fr2 {
    public static void main(String arg[]) {
        System.out.println(sumMultiplePowers(5, 5));
    }


    public static double sumMultiplePowers(double x, int n) {
        double xN = 1;
        double sum = 0;
        for (int counter = 1; counter <= n; counter++) {
            xN = xN * x;
            System.out.println(xN);
            sum = sum + counter * xN;
            System.out.println(sum);

        }
        return sum;
    }
}
