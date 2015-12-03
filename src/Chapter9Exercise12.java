import java.util.Scanner;

/**
 * Created by Qian on 12/3/2015.
 */
public class Chapter9Exercise12 {
    public static void main(String args[]) {
        Scanner kboard = new Scanner(System.in);
        System.out.println("The formula for quadratic is ax^2+bx^2+c=0");
        System.out.println("Please input the word: ");
        String word = kboard.nextLine();
        int[] dictionary = {1, 1, 1, 3, 10, 1, 8, 3, 4, 8, 1, 1, 4, 4, 3, 2, 5, 1, 1, 4, 10, 2, 4, 1, 3, 1};
        String dictionary_sort = "AEIMQUXBFJNRVYCGKOSWZDHLPT";
        double sum = 0;
        for (int count = 0; count < word.length(); count++) {
            Character local = word.charAt(count);
            local = local.toUpperCase(local);
            int num = dictionary_sort.indexOf(local);
            sum += dictionary[num];
            System.out.println(sum);
        }
    }
}
