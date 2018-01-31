import applicaties.Application;
import applicaties.Game;
import applicaties.Media;
import exception.SaxionException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class SaxionStation{

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Application> apps = new ArrayList<>();

    public void addUser(String userName) throws SaxionException{
        User user = findUser(userName);

        if (user != null) {
            throw new SaxionException("User " + userName + " already exists!");
        }

        this.users.add(new User(userName));
    }

    public void addGameByFile(String filename) throws IOException, SaxionException {
        JSONArray jsonArray = new JSONArray(new String(Files.readAllBytes(Paths.get(filename))));

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (findApp(jsonObject.getString("name")) != null) {
                throw new SaxionException("Game " + jsonObject.getString("name") + " already exists!");
            }

            this.apps.add(new Game(jsonObject));
        }
    }

    public void addMediaApp(String name, double price, String type) throws SaxionException {
        Application app = findApp(name);
        if (app != null) {
            throw new SaxionException("MediaApp " + name + " already exists!");
        }

        this.apps.add(new Media(name, price, type));
    }

    public void addBalanceToUser(String name, double money) throws SaxionException{

        User user = findUser(name);

        if (user == null) {
            throw new SaxionException("User " + name + " doesn't exist!");
        }
        user.addBalance(money);
    }

    public void buyAppForUser(String name, String applicaitonName) throws SaxionException{
        User user = findUser(name);

        if (user == null) {
            throw new SaxionException("User " + name + " doesn't exist!");
        }

        Application app = findApp(applicaitonName);

        if (app == null) {
            throw new SaxionException("Application " + applicaitonName + " doesn't exists!");
        }

        //Aanname: User en app bestaan allebei!
        user.addOwnedApp(app);
    }

    private User findUser(String username) {
        for (User user : users) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }

        return null;
    }

    private Application findApp(String name) {
        for (Application app : apps) {
            if (app.getName().equalsIgnoreCase(name)) {
                return app;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        String string = "Saxion Station";
        string += "\nUsers:";

        for (User user : users) {
            string += "\n" + user;
        }

        string += "\nApps:";

        for (Application app : apps) {
            string += "\n" + app;
        }

        return string;
    }
}
