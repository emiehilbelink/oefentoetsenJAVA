import applicaties.Application;
import exception.SaxionException;

import java.util.ArrayList;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class User {

    private String username;
    private double balance;
    private ArrayList<Application> appsOwned = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void addBalance(double value) {
        if (value > 0) {
            this.balance += value;
        }
    }

    public void addOwnedApp(Application app) throws SaxionException {
        if (balance < app.getPrice()) {
            throw new SaxionException("Balance too low!");
        }

        //Aanname: Balans is hoog genoeg om de app te kopen
        this.balance -= app.getPrice();
        this.appsOwned.add(app);
    }

    @Override
    public String toString() {
        String string = "User " + this.username + " has a balance of €" + this.balance;
        string += "\n\tOwned apps:";

        for (Application app : appsOwned) {
            string += "\n\t\t- " + app;
        }

        return string;
    }
}

