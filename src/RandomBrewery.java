import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RandomBrewery {


    Controller controller = new Controller();

    String getController = controller.pathIsRandomBrewery();
    String json = getController;

    String breweryId, breweryName;

    public String parseJSONRandomBrewery() {
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        this.breweryId = jsonObject.getAsJsonObject("data").get("id").getAsString();
        this.breweryName = jsonObject.getAsJsonObject("data").get("name").getAsString();

        //System.out.println(BeerName);

        /*JsonArray arr = jsonObject.getAsJsonArray("posts");
        for (int i = 0; i < arr.size(); i++) {
            String post_id = arr.get(i).getAsJsonObject().get("post_id").getAsString();
            System.out.println(post_id);
        }*/
        return "Zufällige Brauerei: ID: '" + breweryId +"', Name '" + breweryName + "'\n";
    }

    public String getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(String breweryId) {
        this.breweryId = breweryId;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }
}