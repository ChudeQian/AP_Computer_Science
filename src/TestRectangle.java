/**
 * Created by Qian on 1/16/2016.
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle(3, 4);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r1.isSquare());
        System.out.println(r2.isSquare());
        System.out.println(r3.isSquare());
        Rectangle r4 = new Rectangle(8, 11);
        System.out.println(r4.toString());
        r4.quadratize();
        System.out.println(r4.isSquare());
        System.out.println(r4.toString());

    }
}
