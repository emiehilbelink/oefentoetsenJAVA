import exception.SaxionException;

import javax.imageio.IIOException;
import java.io.IOException;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class Apl {

    public static void main (String[] args){

        SaxionStation saxionStation = new SaxionStation();

        try {
            saxionStation.addUser("gerralt");
            saxionStation.addUser("ruud");
        } catch (SaxionException message){
            System.out.println(message.getMessage());
        }

        try {
            saxionStation.addGameByFile("games.json");
            saxionStation.addMediaApp("Netflix app", 0, "Video Entertainment app");
            saxionStation.addMediaApp("Spotify app", 9.99, "Audio Entertainment app");
        }  catch (SaxionException message){
            System.out.println(message.getMessage());
        } catch ( IOException ieo){
            System.out.println(ieo.getMessage());
        }

        try {
            saxionStation.addBalanceToUser("gerralt", 100);
            saxionStation.addBalanceToUser("ruud", 39.99);
        } catch (SaxionException message){
            System.out.println(message.getMessage());
        }

        try {
            saxionStation.buyAppForUser("gerralt", "The Witcher 3");
            saxionStation.buyAppForUser("ruud", "Cities: Skylines");
            saxionStation.buyAppForUser("ruud", "Netflix app");
        } catch (SaxionException message){
            System.out.println(message.getMessage());
        }

        System.out.println(saxionStation);
    }


}
