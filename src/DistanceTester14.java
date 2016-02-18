/**
 * Created by Frank on 2/18/2016.
 */

public class DistanceTester14 {
    public static void main(String[] args) {
        PlaceImplementer p1 = new PlaceImplementer(0);
        PlaceImplementer p2 = new PlaceImplementer(-1);
        PlaceImplementer p3 = new PlaceImplementer(5);
        DistanceTester14 test = new DistanceTester14();
        System.out.println(test.sameDistance(p1, p2, p3));
    }

    public boolean sameDistance(Place p1, Place p2, Place p3) {
        return p1.distance(p2) == p1.distance(p3);
    }
}
