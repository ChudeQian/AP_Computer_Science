/**
 * Created by Frank on 2/18/2016.
 */
public class Haiku extends Poem {
    @Override
    public int numLines() {
        return 3;
    }

    @Override
    public int getSyllables(int k) {
        if (k == 0 || k == 2) {
            return 5;
        } else {
            return 7;
        }
    }
}
