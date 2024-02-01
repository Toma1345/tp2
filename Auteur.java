import java.util.Map ;
import java.util.HashMap ;

public class Auteur{
    private String nom;

    private Map< Integer, String> tragedie;
    private Map< Integer, String> comedie;
    private Map< Integer, String> drame;

    public Auteur(String nom, Integer perfTrag, String trag, Integer perfCom, String com, Integer perfDrame, String drame ) {
        this.nom = nom;
        this.tragedie = new HashMap<>();
        this.comedie = new HashMap<>();
        this.drame = new HashMap<>();

        this.tragedie.put(perfTrag,trag);
        this.comedie.put(perfCom,com);
        this.drame.put(perfDrame,drame);
    }

    @Override
    public String toString() {
        String s1 = "L'honorable ";
        return s1.concat(this.nom);

    }
}