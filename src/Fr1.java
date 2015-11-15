/**
 * Created by frank on 11/9/2015.
 */
public class Fr1 {
    public static void main(String args[]) {
        int nY = 0;
        double savings = 1000;
        while (savings <= 3000) {
            savings += savings * 0.05;
            nY += 1;
        }
        System.out.println(nY);
    }
}
