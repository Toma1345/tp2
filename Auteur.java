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

    // les getters

    public int getQualiteTragedie(){
        return this.qltTragedie;
    }

    public String getCitationTragedie(){
        return this.tragedie;
    }

    public int getQualiteComedie(){
        return this.qltComedie;
    }

    public String getCitationComedie(){
        return this.comedie;
    }

    public int getQualiteDrame(){
        return this.qltDrame;
    }

    public String getCitationDrame(){
        return this.drame;
    }

    // Style

    public String pointFort(){
        return " ";
    }


    // String

    @Override
    public String toString() {
        String s1 = "L'honorable ";
        return s1.concat(this.nom);

    }
}