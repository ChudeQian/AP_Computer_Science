import java.math.*;
/**
 * Created by Qian on 1/15/2016.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int s) {
        if (s > 0) {
            this.width = s;
            this.height = s;
        } else {
            throw new IllegalArgumentException(
                    "Rectangle construction error: length of side is less than");
        }

    }

    public Rectangle(int h, int w) {
        if (h > 0 && w > 0) {
            this.width = w;
            this.height = h;
        } else {
            throw new IllegalArgumentException(
                    "Rectangle construction error: length of side is less than");
        }
    }

    public boolean isSquare() {
        if (this.height == this.width) {
            return true;
        } else return false;
    }

    public boolean isSquare(int height, int width) {
        if (height == width) {
            return true;
        } else return false;
    }


    public void quadratize() {
        int size = this.height * this.width;
        int newSide = (int) Math.sqrt(size);
        this.width = newSide;
        this.height = newSide;
        return;
    }

    public void quadratize(int height, int width) {
        int size = height * width;
        int newSide = (int) Math.sqrt(size);
        width = newSide;
        height = newSide;
        return;
    }

    public String toString() {
        return "The length of the rectangle is: " + this.height + " The width of the rectangle is: " + this.width;
    }
}
