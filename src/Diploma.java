/**
 * Created by frank on 2/16/2016.
 */
public class Diploma {
    private String name, subject;

    public Diploma(String nm, String subj) {
        this.name = nm;
        this.subject = subj;
    }

    public String toString() {
        return "This certifies that " + this.name + "\n" + "has completed a course in " + this.subject;
    }
}