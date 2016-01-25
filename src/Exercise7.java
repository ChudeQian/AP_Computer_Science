import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Qian on 1/25/2016.
 */
public class Exercise7 {
    public static void main(String args[]) {
        ArrayList<Object> tester = new ArrayList<>();
        for (int counter = 0; counter < 10; counter++) {
            tester.add(new Random().nextInt(100)); //This is how to random out a int
        }
        ArrayList<Object> tester2 = new ArrayList<>(tester);
        tester.add(99);
        filter(tester, tester2);
        System.out.println(tester.toString());
        System.out.println(tester2.toString());
    }

    public static void filter(ArrayList<Object> list1, ArrayList<Object> list2) {
        for (Object local_Object : list2) {
            for (int counter = 0; counter < list1.size(); counter++) {
                if (list1.get(counter) == local_Object) {
                    list1.remove(counter);
                }
            }
        }
    }
}

