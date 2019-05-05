import java.util.HashMap;
import java.util.Map;


public class Model {

    Map<String, RandomBeer> beerMap = new HashMap<>();

    public void addBeers(String beerId, RandomBeer randomBeer) {
        this.beerMap.put(beerId, randomBeer);
    }
    public RandomBeer getBeers(String beerId){
        return this.beerMap.get(beerId);
    }
}
