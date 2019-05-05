import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

public class RandomBeer {
    Controller controller = new Controller();

    String getController = controller.pathIsRandomBeer();
    String json = getController;

    String beerId, beerName, abv, descrip;

    public RandomBeer() throws IOException {
    }

    public String parseJSONRandomBeer() {
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        this.beerId = jsonObject.getAsJsonObject("data").get("id").getAsString();
        this.beerName = jsonObject.getAsJsonObject("data").get("name").getAsString();
        this.abv = jsonObject.getAsJsonObject("data").get("abv").getAsString();
        this.descrip = jsonObject.getAsJsonObject("data").getAsJsonObject("style").get("description").getAsString();
        //System.out.println(beerName);

        /*JsonArray arr = jsonObject.getAsJsonArray("posts");
        for (int i = 0; i < arr.size(); i++) {
            String post_id = arr.get(i).getAsJsonObject().get("post_id").getAsString();
            System.out.println(post_id);
        }*/
        return "Zufälliges Bier: ID: '" +beerId +"', Name '" + beerName + "', Vol in % '" + abv + "', Beschreibung: '" + descrip + "'\n";
    }

    public String getBeerId() {
        return beerId;
    }

    public void setBeerId(String beerId) {
        this.beerId = beerId;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
}