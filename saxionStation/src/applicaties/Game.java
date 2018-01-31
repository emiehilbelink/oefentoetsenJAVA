package applicaties;

import org.json.JSONObject;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class Game extends Application {

    private int rating;
    private int minumAge;
    private int maxPlayers;

    public Game(String name, double price, int rating, int minumAge, int maxPlayers) {
        super(name, price);
        this.rating = rating;
        this.minumAge = minumAge;
        this.maxPlayers = maxPlayers;
    }

    public Game(JSONObject object) {
        super(object);
        this.minumAge = object.getInt("minimumAge");
        this.maxPlayers = object.getInt("maxPlayers");
        this.rating = object.getInt("rating");
    }


    @Override
    public String toString() {

        String info = "";

        info += super.toString();
        info += "(" + rating + "). Max" + maxPlayers + "players with a minimum age of" + minumAge;

        return info;

    }
}
