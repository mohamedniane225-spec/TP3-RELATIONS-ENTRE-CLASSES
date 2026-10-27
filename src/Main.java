import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Création du projet Musée ===");

        Adresse adr = new Adresse(1, "Rue de la République", "69001", "Lyon");

        Artiste daVinci = new Artiste("da Vinci", "Leonardo", "Italien", LocalDate.of(1452, 4, 15));
        Artiste picasso = new Artiste("Picasso", "Pablo", "Espagnol", LocalDate.of(1881, 10, 25));

        Oeuvre joconde = new Oeuvre("La Joconde", 1503, 0.53, 0.77, daVinci);
        Oeuvre guernica = new Oeuvre("Guernica", 1937, 7.76, 3.49, picasso);
        Oeuvre anonyme = new Oeuvre("Sculpture Antique", -100, 1.0, 2.0);

        // Ajout bidirectionnel
        daVinci.ajouterOeuvre(joconde);
        picasso.ajouterOeuvre(guernica);

        Salle salleRenaissance = new Salle(1, "Renaissance Italienne", 150.5);
        salleRenaissance.ajouterOeuvre(joconde);
        salleRenaissance.ajouterOeuvre(anonyme);

        Salle salleModerne = new Salle(2, "Art Moderne", 200.0);
        salleModerne.ajouterOeuvre(guernica);

        Musee museeBeauxArts = new Musee("Musée des Beaux-Arts", adr, salleRenaissance);
        museeBeauxArts.ajouterSalle(salleModerne);

        System.out.println(museeBeauxArts);
        System.out.println("Oeuvres de Picasso : " + picasso.getOeuvres().size());
    }
}