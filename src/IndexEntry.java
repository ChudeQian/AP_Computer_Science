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
        String newNumList = " ";

        for (int i = 0; i < numsList.size(); i++) {
            newNumList += numsList.get(i) + ", ";
        }
        return (word + newNumList);
    }

}
