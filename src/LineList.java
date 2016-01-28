import java.util.ArrayList;

/**
 * Created by Qian on 1/28/2016.
 */
public class LineList {
    private ArrayList<String> stringList;

    public LineList() {
        stringList = new ArrayList<>();
    }

    public int size() {
        return stringList.size();
    }

    public String get(int k) {
        return stringList.get(k);
    }

    public void add(String line) {
        stringList.add(line);
    }

    public String remove(int k) {
        String localTemp = stringList.get(k);
        stringList.remove(stringList.get(k));
        return localTemp;
    }

    public void move(int index, int newIndex) {
        String localTemp = stringList.get(index);
        if (index < newIndex) {
            stringList.add(newIndex, localTemp);
            stringList.remove(index);
        } else {
            stringList.add(newIndex, localTemp);
            stringList.remove(index - 1);
        }

    }

    public void shuffle() {
        int n = stringList.size() - 1;
        while (n >= 2) {
            int randomN = (int) ((Math.random() * n));
            String local = stringList.get(randomN);
            stringList.set(randomN, stringList.get(n));
            stringList.set(n, local);
            n = n - 1;
        }

    }
}
