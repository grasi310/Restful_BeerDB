import java.io.IOException;
import java.util.Scanner;

public class View {

    Scanner scan = new Scanner(System.in);
    private RandomBeer randomBeer = new RandomBeer();
    private RandomBrewery randomBrewery = new RandomBrewery();
    CSVService csvService = new CSVService();
    boolean abbruch = false;

    public View() throws IOException {
    }

    public void start() throws IOException {


        while (this.abbruch != true) {
            System.out.println("Bitte geben Sie Ihre Auswahl an:");
            System.out.println("Für ein zufälliges Bier geben Sie bitte 'random' ein.");
            System.out.println("Für eine zufällige Brauerei geben Sie bitte 'suche brauerei' ein.");
            System.out.println("Für eine zufällige Brauerei geben Sie bitte 'suche brauerei' ein.");

            String auswahl = scan.nextLine();
            String pathRandom = "random";
            String pathSucheBrauerei = "suche brauerei";
            String pathAbbruch = "abbruch";

            if (auswahl.toLowerCase().equals(pathRandom)) {
                System.out.println(randomBeer.parseJSONRandomBeer());
                try {
                    csvService.writeBeerResultsToCsv(randomBeer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (auswahl.toLowerCase().equals(pathSucheBrauerei)) {
                System.out.println(randomBrewery.parseJSONRandomBrewery());
            } else if (auswahl.toLowerCase().equals(pathAbbruch)) {
                this.abbruch = true;
            } else {
                System.out.println("Diese Auswahl existiert nicht!");
                start();
            }
        }
    }
}
