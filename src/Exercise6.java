import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Qian on 1/25/2016.
 */
public class Exercise6 {
    public static void main(String args[]) {
        ArrayList<Integer> tester = new ArrayList<Integer>();
        for (int counter = 0; counter < 10; counter++) {
            tester.add(new Random().nextInt(100)); //This is how to random out a int
        }
        System.out.println("Before: " + tester.toString());
        ArrayList<Integer> sorted = sorting(tester);
        System.out.println("End: " + sorted);

    }

    public static ArrayList<Integer> sorting(ArrayList<Integer> unsorted) {
        int digits = unsorted.size();
        int localTemp = unsorted.get(0);
        for (int counter = 1; counter < digits; counter++) {
            if (unsorted.get(counter) < localTemp) {
                localTemp = unsorted.get(counter);
            }
        }
        unsorted.remove(unsorted.indexOf(localTemp));
        return unsorted;
    }
}
