import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int etage;
    private String nom;
    private double superficie;
    private List<Oeuvre> oeuvres;

    public Salle(int etage, String nom, double superficie) {
        this.etage = etage;
        this.nom = nom;
        this.superficie = superficie;
        this.oeuvres = new ArrayList<>();
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void ajouterOeuvre(Oeuvre oeuvre) {
        if (oeuvre != null) {
            this.oeuvres.add(new Oeuvre(oeuvre));
        }
    }

    public List<Oeuvre> getOeuvres() {
        List<Oeuvre> copies = new ArrayList<>();
        for (Oeuvre o : this.oeuvres) {
            copies.add(new Oeuvre(o));
        }
        return copies;
    }

    public Salle(Salle other) {
        this(other.etage, other.nom, other.superficie);
        for(Oeuvre o : other.oeuvres) {
            this.ajouterOeuvre(o);
        }
    }

    @Override
    public String toString() {
        return "Salle " + nom + " (Étage " + etage + ", " + superficie + "m2) - " + oeuvres.size() + " oeuvre(s)";
    }
}