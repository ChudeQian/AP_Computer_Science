import java.util.ArrayList;

/**
 * Created by Qian on 1/29/2016.
 */
public class DocumentIndex extends ArrayList<IndexEntry> {
    public DocumentIndex() {
        ArrayList<Integer> numList = new ArrayList<>();
    }

    public DocumentIndex(int Number) {
        ArrayList<Integer> numList = new ArrayList<>(Number);
    }

    public void addWord(String str, int num) {

    }
}
