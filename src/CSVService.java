import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVService {

    CSVUtils csvUtils = new CSVUtils();
    String csvFile = "D:/IT-Kolleg/POS STOL/Restful_project/csv/beers.csv";
    FileWriter writer = new FileWriter(csvFile);
    //RandomBeer randomBeer = new RandomBeer();

    public CSVService() throws IOException {
    }


    public void writeBeerResultsToCsv(RandomBeer randomBeer) throws IOException {
        try {
            CSVUtils.writeLine(writer, Arrays.asList(randomBeer.getBeerId(), randomBeer.getBeerName(), randomBeer.getAbv(), randomBeer.getDescrip()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.flush();
        writer.close();
    }
}
