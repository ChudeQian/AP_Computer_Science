/**
 * Created by Frank on 2/18/2016.
 */
public class Limerick extends Poem {
    @Override
    public int numLines() {
        return 5;
    }

    @Override
    public int getSyllables(int k) {
        if (k == 0 || k == 1 || k == 4) {
            return 9;
        } else {
            return 6;
        }
    }
}
