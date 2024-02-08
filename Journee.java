import java.util.Map;
import java.util.HashMap;

public class Journee{
    private Map<String,Integer> nbreSpectacle;
    private Map<String,Style> style;


    public Journee(Style matin, int specMatin, Style apresMidi, int specApresMidi, Style soiree, int specSoiree) {
        this.nbreSpectacle = new HashMap<>();
        this.style = new HashMap<>();
        
        this.nbreSpectacle.put("Matin", specMatin);
        this.nbreSpectacle.put("Après-midi", specApresMidi);
        this.nbreSpectacle.put("Soirée", specSoiree);

        this.style.put("Matin", matin);
        this.style.put("Après-midi", apresMidi);
        this.style.put("Soirée", soiree);
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

    public Auteur vainqueur(Auteur auteur1 , Auteur auteur2) {
        if (scoreJournee(auteur1)>scoreJournee(auteur2)) {
            return auteur1;
        }
        else {
            return auteur2;
        }
    }

}