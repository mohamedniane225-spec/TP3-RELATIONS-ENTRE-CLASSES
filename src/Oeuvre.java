public class Oeuvre {
    private String nom;
    private int annee;
    private double largeur;
    private double hauteur;
    private Artiste artiste;

    public Oeuvre(String nom, int annee, double largeur, double hauteur, Artiste artiste) {
        this.nom = nom;
        this.annee = annee;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.artiste = (artiste != null) ? new Artiste(artiste) : null;
    }

    public Oeuvre(String nom, int annee, double largeur, double hauteur) {
        this(nom, annee, largeur, hauteur, null);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public Artiste getArtiste() {
        return (artiste != null) ? new Artiste(artiste) : null;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = (artiste != null) ? new Artiste(artiste) : null;
    }

    public Oeuvre(Oeuvre other) {
        this(other.nom, other.annee, other.largeur, other.hauteur, other.artiste);
    }

    @Override
    public String toString() {
        String res = nom + " (" + annee + ") [" + largeur + "x" + hauteur + "m]";
        if (artiste != null) {
            res += " par " + artiste.getPrenom() + " " + artiste.getNom();
        }
        return res;
    }
}