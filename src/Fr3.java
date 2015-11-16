/**
 * Created by Qian on 11/15/2015.
 */

import java.util.Scanner;

public class Fr3 {
    public static void main(String args[]) {

        int p = 2;
        int fac = 1;
        int counter = 0;
        while (counter < 5) {
            if ((fac + 1) % p == 0) {
                counter++;
                System.out.println(fac);
            }
            fac = fac * p;
            System.out.println(fac);
            p++;
            System.out.println(p);
        }
    }
}
