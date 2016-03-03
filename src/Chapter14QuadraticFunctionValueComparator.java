/**
 * Created by Qian on 3/3/2016.
 */
public class Chapter14QuadraticFunctionValueComparator {

    double x;

    public Chapter14QuadraticFunctionValueComparator() {
        x = 0;
    }

    public Chapter14QuadraticFunctionValueComparator(double x) {
        this.x = x;
    }

    public int compare(Chapter14QuadraticFunction o1, Chapter14QuadraticFunction o2) {
        return (int) (o1.valueAt(x) - o2.valueAt(x));
    }

}
