import java.util.ArrayList;

/**
 * Created by Qian on 1/29/2016.
 */
public class DocumentIndex extends ArrayList<IndexEntry> {
    public DocumentIndex() {
        super();
    }

    public DocumentIndex(int Number) {
        super(Number);
    }

    public void addWord(String str, int num) {
        str = str.toUpperCase();
    }
}
