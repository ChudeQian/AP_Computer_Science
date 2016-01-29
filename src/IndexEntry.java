import java.util.ArrayList;

/**
 * Created by Qian on 1/29/2016.
 */
public class IndexEntry {
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry(String word) {
        this.word = word.toUpperCase();
    }

    public void add(int num) {
        this.numsList.add(num);
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {

    }

}
