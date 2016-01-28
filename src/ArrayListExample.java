import java.net.Inet4Address;
import java.util.ArrayList;

/**
 * Created by Frank on 1/28/2016.
 */
public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> myNums = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            myNums.add(i);
        }
        System.out.println("The original array has size: " + myNums.size());
        System.out.println(myNums.toString());
        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = 0; i < myNums.size(); i++) {
            sum += myNums.get(i);
        }
        System.out.println("\n Sum is: " + sum);

        int target = 1;
        if (myNums.contains(target)) {
            System.out.println(target + " Found");
            System.out.println(target + " Found at location " + myNums.indexOf(target));
        } else {
            System.out.println(target + " NOT Found");
            System.out.println(target + " NOT Found index returned is -1");
        }

        target = 12;
        if (myNums.contains(target)) {
            System.out.println(target + " Found");
            System.out.println(target + " Found at location " + myNums.indexOf(target));
        } else {
            System.out.println(target + " NOT Found");
            System.out.println(target + " NOT Found index returned is -1");
        }

        for (int a = 20; a < 24; a++) {
            myNums.add(a);
        }
        System.out.println("The new array after adding values to end has size: " + myNums.size());
        System.out.println(myNums.toString());

        int loaction =1;
        int value = 100;
        myNums.add(loaction,value);
        System.out.println("The array after adding item in the middle has size: "+myNums.size());
        System.out.println(myNums.toString());

        System.out.println(myNums.get(myNums.size()-1));
        myNums.remove(myNums.size()-1);
        System.out.println(myNums.toString());

        loaction = 1;
        myNums.remove(loaction);
        System.out.println("With an inner item deleted the array has size: "+myNums.size());
        System.out.println(myNums.toString());

        loaction = 3;
        value = 300;
        myNums.set(loaction,value);
        System.out.println("With an inner item changed the array has size: "+myNums.size());
        System.out.println(myNums.toString());
        System.out.println();

    }


}

