import java.util.Map ;
import java.util.HashMap ;

public class Auteur{
    private String nom;

    private String tragedie;
    private String comedie;
    private String drame;
    private int qltTragedie;
    private int qltComedie;
    private int qltDrame;

    public Auteur(String nom, int perfTrag, String trag, int perfCom, String com, int perfDrame, String drame ) {
        this.nom = nom;
        this.tragedie = trag;
        this.qltTragedie = perfTrag;
        this.comedie = com;
        this.qltComedie = perfCom;
        this.drame = drame;
        this.qltDrame = perfDrame;
    }

    public int getQualiteTragedie(){
        return this.qltTragedie;
    }

    @Override
    public String toString() {
        String s1 = "L'honorable ";
        return s1.concat(this.nom);

    }
}