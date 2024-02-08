import java.util.Map;
import java.util.HashMap;

public class Journee{
    private Map<String,Integer> nbSpec;
    private Map<String,Style> style;


    public Journee(Style matin, int specMatin, Style apresMidi, int specApresMidi, Style soiree, int specSoiree) {
        this.nbSpec = new HashMap<>();
        this.style = new HashMap<>();
        
        this.nbSpec.put("Matin",specMatin);
        this.nbSpec.put("ApresMidi",specApresMidi);
        this.nbSpec.put("Soiree",specSoiree);

        this.style.put("Matin",matin);
        this.style.put("ApresMidi",apresMidi);
        this.style.put("Soiree",soiree);
    }

    public Style getStyle(Periode periode) {
        return this.style.get(periode.toString());
    }


    public int scoreJournee( Auteur auteur ){
        return 0;
    }

    public int scoreAuteur(Auteur auteur, Journee epreuve){
        return 0;
    }

}