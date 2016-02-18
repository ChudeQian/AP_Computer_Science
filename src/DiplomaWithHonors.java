/**
 * Created by frank on 2/16/2016.
 */
public class DiplomaWithHonors extends Diploma {
    public DiplomaWithHonors(String name, String item){
        super(name,item);

    }
    public String toString(){
        return "This certifies that "+name+"has completed a MOOC in "+item+"*** With Honors ***";

    }
}
