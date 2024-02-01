import java.util.Map;
import java.util.HaspMap;

public class Auteur{
    private String nom;

    private Map<Integer, String> citations;

    public Auteur(String auteur, int ligneVers1, String cit1, int ligneVers2, String cit2, int ligneVers3, String cit3);{
        this.nom = auteur;
        this.citations = new HaspMap<>();
        this.citations.put(ligneVers1, cit1);
        this.citations.put(ligneVers2, cit2);
        this.citations.put(ligneVers3, cit3);
    }

}