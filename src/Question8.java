/**
 * Created by Qian on 11/15/2015.
 */
public class Question8 {


    public static void main(String arg[]) {
        String test = "100100101011101110";
        System.out.println(test);
        test = test.replace('1', ' ');
        System.out.println(test);
        test = test.replace('0', 'a');
        System.out.println(test);
        test = test.replace(' ', '0');
        System.out.println(test);
        test = test.replace('a', '1');
        System.out.println();

    }
}
