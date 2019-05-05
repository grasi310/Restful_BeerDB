import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetClientGet {

    // http://localhost:8080/RESTfulExample/json/product/get
    public String getData(String path) {


        try {

            URL url = new URL("http://api.brewerydb.com/v2/" + path + "/?key=3d64eaab59a56fb22eab5e69c9bc2e9b");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String rueckgabe = "";
            String output;
            System.out.println("Output from Server .... \n");
            //System.out.println(br.readLine());
            while ((output = br.readLine()) != null) {
                rueckgabe = rueckgabe + output;
            }
            //System.out.println(rueckgabe);
            conn.disconnect();
            return rueckgabe;
        } catch (MalformedURLException e) {

            e.printStackTrace();
            return "";

        } catch (IOException e) {

            e.printStackTrace();
            return "";
        }

    }

}