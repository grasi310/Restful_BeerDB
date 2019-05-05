import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVService {

    CSVUtils csvUtils = new CSVUtils();
    String csvFile_Beers = "E:/IT Kolleg/POS STOL/csv/beers.csv";//"D:/IT-Kolleg/POS STOL/Restful_project/csv/beers.csv";
    String csvFile_Breweries = "E:/IT Kolleg/POS STOL/csv/breweries.csv";
    FileWriter writerBeer = new FileWriter(csvFile_Beers);
    FileWriter writerBrewery = new FileWriter(csvFile_Breweries);
    //RandomBeer randomBeer = new RandomBeer();

    public CSVService() throws IOException {
    }


    public void writeBeerResultsToCsv(RandomBeer randomBeer) throws IOException {
        try {
            CSVUtils.writeLine(writerBeer, Arrays.asList(randomBeer.getBeerId(), randomBeer.getBeerName(), randomBeer.getAbv(), randomBeer.getDescrip()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writerBeer.flush();
        //writer.close();
    }

    public void writeBreweryResultsToCsv(RandomBrewery randomBrewery) throws IOException {
        try {
            CSVUtils.writeLine(writerBrewery, Arrays.asList(randomBrewery.getBreweryId(), randomBrewery.getBreweryName()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writerBeer.flush();
        //writer.close();
    }

    public void closeBeerWriter() throws IOException {

        writerBeer.close();

    }

    public void closeBreweryWriter() throws IOException {

        writerBrewery.close();

    }
}
