import java.util.Map;
import java.util.HashMap;

public class Journee{
    private Map<String,Integer> nbreSpectacle;
    private Map<String,Style> style;


    public Journee(Periode matin, int specMatin, Periode apresMidi, int specApresMidi, Periode soiree, int specSoiree) {
        this.nbreSpectacle = new HashMap<>();
        this.style = new HashMap<>();
        
        this.nbreSpectacle.put("Matin",specMatin);
        this.nbreSpectacle.put("ApresMidi",specApresMidi);
        this.nbreSpectacle.put("Soiree",specSoiree);

        this.style.put("Matin",matin);
        this.style.put("ApresMidi",apresMidi);
        this.style.put("Soiree",soiree);
    }

    public Style getStyle(Periode periode) {
        return this.style.get(periode.toString());
    }
    public int getNombreSpectacle(Periode periode){
        return this.nbreSpectacle.get(periode.toString());
    }

    public int scoreAuteur(Auteur auteur, Periode epreuve){
        return auteur.qualiteStyle(this.style.get(epreuve.toString()))*this.getNombreSpectacle(epreuve);
    }

    public int scoreJournee(Auteur auteur){
        return this.scoreAuteur(auteur, Periode.MATIN) + this.scoreAuteur(auteur, Periode.APRESMIDI) + this.scoreAuteur(auteur, Periode.SOIREE);
    }

}