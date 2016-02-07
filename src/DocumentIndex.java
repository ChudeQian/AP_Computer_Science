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
        IndexEntry newEntry = get(foundOrInserted(str));
        newEntry.add(num);
    }

    public void addAllWords(String str, int num) {
        String[] words = str.split("\\W+");
        for (String word : words) {
            if (word.length() < 0) {
                addWord(word, num);
            }
        }
    }

    private int foundOrInserted(String word) {
        int i;
        for (i = 0; i < this.size(); i++) {
            int comp = word.compareToIgnoreCase(get(i).getWord());
            if (comp == 0)
                return i;
            if (comp < 0)
                break;
        }
        add(i, new IndexEntry(word));
        return i;
    }
}

