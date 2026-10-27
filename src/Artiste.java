import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Artiste {
    private String nom;
    private String prenom;
    private String nationalite;
    private LocalDate dateNaissance;
    private List<Oeuvre> oeuvres;

    public Artiste(String nom, String prenom, String nationalite, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.dateNaissance = dateNaissance;
        this.oeuvres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
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

    public Artiste(Artiste other) {
        this(other.nom, other.prenom, other.nationalite, other.dateNaissance);
        for(Oeuvre o : other.oeuvres) {
            this.ajouterOeuvre(o);
        }
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (" + nationalite + ")";
    }
}