/**
 * Created by frank on 2/23/2016.
 */
public class SortedWordList extends java.util.ArrayList<String> {
    public SortedWordList() {
        super();
    }

    public SortedWordList(int capacity) {
        super(capacity);
    }

    public int indexOf(String w) {
        int left = 0;
        int right = super.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (w.equalsIgnoreCase(super.get(middle)))
                return middle;
            else if (w.compareToIgnoreCase(super.get(middle)) < 0)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }

    //The following method called a binary search method already

    public boolean contains(String word) {
        return indexOf(word) >= 0;
    }

    @Override
    public String set(int i, String word) {
        String a;
        if (i == 0 && word.compareTo(super.get(i + 1)) < 0) {
            a = super.set(i, word);
        } else if (word.compareTo(super.get(i - 1)) > 0 && word.compareTo(super.get(i + 1)) < 0) {
            a = super.set(i, word);
        } else {
            throw new IllegalArgumentException("word =" + word + " i =" + i);
        }
        return a;
    }

    @Override
    public void add(int i, String word) {
        if ((i > 0 && word.compareToIgnoreCase(super.get(i - 1)) <= 0) || (i < size() - 1 && word.compareToIgnoreCase(super.get(i)) >= 0))
            throw new IllegalArgumentException("word = " + word + "\ni = " + i);
        super.add(i, word);
    }

    @Override
    public boolean add(String word) {
        int left = 0;
        int right = size();
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (word.compareToIgnoreCase(super.get(middle)) > 0) {
                left = middle + 1;
            } else if (word.compareToIgnoreCase(super.get(middle)) < 0) {
                right = middle;
            } else {
                return false;
            }
        }
        super.add(right, word);
        return true;
    }
}