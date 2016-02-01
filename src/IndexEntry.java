import java.util.ArrayList;

/**
 * Created by Qian on 1/29/2016.
 */
public class IndexEntry {
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry(String word) {
        this.word = word.toUpperCase();
        numsList = new ArrayList<Integer>();
    }

    public void add(int num) {
        if (!numsList.contains(num)) {
            numsList.add(num);
        }
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        String result = "";
        if (numsList.size() == 0) {
            return word;
        }
        result += word + " ";
        for (int i = 0; i < numsList.size() - 1; i++) {
            result += numsList.get(i) + ", ";
        }
        result += numsList.get(numsList.size() - 1);
        return result;
    }

}
