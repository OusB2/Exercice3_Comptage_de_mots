import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        File monFichier = new File("texte.txt");
        Scanner lecteur = new Scanner(monFichier);
        int totalMots = 0;

        // Lecture du fichier ligne par ligne
        while (lecteur.hasNextLine()) {
            String ligne = lecteur.nextLine();

            // Séparation par espace et comptage
            String[] mots = ligne.split(" ");

            if (!ligne.isEmpty()) {
                totalMots = totalMots + mots.length;
            }
        }

        // Affichage du résultat total
        System.out.println("Le nombre total de mots est : " + totalMots);

        lecteur.close();
    }
}