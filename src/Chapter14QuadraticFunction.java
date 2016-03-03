/**
 * Created by Qian on 3/1/2016.
 */
public class Chapter14QuadraticFunction {
    private int a, b, c;

    public Chapter14QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static String getValue(int value) {
        if (value > 0 && value != 1) {
            return "+" + value;
        } else if (value < 0) {
            return "" + value;
        } else return "";
    }

    public double valueAt(double x) {
        return (this.a * x * x + this.b * x + this.c);
    }

    @Override
    public String toString() {
        if (this.a == 0) {
            if (this.b == 0) {
                return "" + this.c;
            }
            return "" + getValue(this.b) + "x" + getValue(this.c);
        } else {
            return "" + getValue(this.a) + "x^2" + getValue(this.b) + "x" + getValue(this.c);
        }
    }

    public boolean equals(Chapter14QuadraticFunction obj) {
        return obj.a == this.a && obj.b == this.b && obj.c == this.c;
    }

    public int compareTo(Chapter14QuadraticFunction obj) {
        if (obj.a > this.a) {
            return -1;
        } else if (obj.a < this.a) {
            return 1;
        } else {
            if (obj.b > this.b) {
                return -1;
            } else if (obj.b < this.b) {
                return 1;
            } else {
                if (obj.c > this.c) {
                    return -1;
                } else if (obj.c < this.c) {
                    return 1;
                } else return 0;
            }
        }
    }



}
