/**
 * Created by Frank on 2/18/2016.
 */
public class PlaceImplementer implements Place {
    private int x;

    public PlaceImplementer(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int distance(Place other) {
        return Math.abs(getX() - ((PlaceImplementer) other).getX());
    }
}
