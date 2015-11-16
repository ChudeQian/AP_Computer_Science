/**
 * Created by Qian on 11/15/2015.
 */

public class Question18a {

    public boolean isPalindrome(String word) {
        int lenghth = word.length();
        lenghth = lenghth / 2;
        System.out.println(lenghth);
        String sub1 = word.substring(0, lenghth);
        String sub2 = word.substring(word.length() - lenghth, word.length());
        System.out.println(sub1);
        System.out.println(sub2);
        if (sub1.equals(sub2)) {
            return true;
        } else {
            return false;
        }
    }
}
