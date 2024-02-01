public class Journee{
    private Style matin;
    private Style apresMidi;
    private Style soiree;
    private int nombreSpectateur;


    public int scoreAuteur(Style epreuve, Style s, int nbSpect){
        return nbSpect * qualiteStyle(s);
    }

    public int scoreJournee(){
        return scoreAuteur(..., Style.TRAGÉDIE, ...) + scoreAuteur(..., Style.COMÉDIE, ...) + scoreAuteur(..., Style.DRAME, ...)
    }

    public int afficherApplaudissements(){}

    public int calculerApplaudissements(){}
}