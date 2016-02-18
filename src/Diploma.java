/**
 * Created by frank on 2/16/2016.
 */
public class Diploma {
    private String name,item;
    public Diploma (String name, String item){
        this.name = name;
        this.item = item;
    }
    public String toString(){
        return "This certifies that "+name+"has completed a MOOC in "+item;
    }
}
