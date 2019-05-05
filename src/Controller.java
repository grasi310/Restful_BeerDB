

public class Controller {

    String path;
    NetClientGet netClientGet = new NetClientGet();




    public String pathIsRandomBeer() {
        this.path = "beer/random";
        return netClientGet.getData(path);
    }

    public String pathIsRandomBrewery() {
        this.path = "brewery/random";
        return netClientGet.getData(path);
    }



}
