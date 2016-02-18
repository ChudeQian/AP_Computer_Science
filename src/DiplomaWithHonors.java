/**
 * Created by frank on 2/16/2016.
 */
public class DiplomaWithHonors extends Diploma {
    public DiplomaWithHonors(String nm, String subj) {
        super(nm, subj);
    }

    public String toString() {
        return super.toString() + "\n*** with honors ***";
    }
}
