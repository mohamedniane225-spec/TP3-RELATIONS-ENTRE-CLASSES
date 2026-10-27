import java.util.ArrayList;
import java.util.List;

public class Musee {
    private String nom;
    private Adresse adresse;
    private List<Salle> salles;

    public Musee(String nom, Adresse adresse, Salle premiereSalle) {
        if (premiereSalle == null) {
            throw new IllegalArgumentException("Un musée doit avoir au moins une salle.");
        }
        this.nom = nom;
        this.adresse = new Adresse(adresse);
        this.salles = new ArrayList<>();
        this.salles.add(new Salle(premiereSalle));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return new Adresse(adresse);
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = new Adresse(adresse);
    }

    public void ajouterSalle(Salle salle) {
        if (salle != null) {
            this.salles.add(new Salle(salle));
        }
    }

    public List<Salle> getSalles() {
        List<Salle> copies = new ArrayList<>();
        for (Salle s : this.salles) {
            copies.add(new Salle(s));
        }
        return copies;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musée: ").append(nom).append("\n");
        sb.append("Adresse: ").append(adresse.toString()).append("\n");
        sb.append("Salles:\n");
        for (Salle s : salles) {
            sb.append("  - ").append(s.toString()).append("\n");
            for (Oeuvre o : s.getOeuvres()) {
                sb.append("      * ").append(o.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}