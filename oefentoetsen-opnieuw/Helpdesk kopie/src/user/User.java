package user;

import excep.HelpdeskException;
import org.json.JSONObject;
import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public abstract class User {

    protected String name;
    protected String password;
    protected String afdeling;

    private ArrayList<Ticket> madeTickets = new ArrayList<Ticket>();

    public User(String name, String password, String afdeling) {
        this.name = name;
        this.password = password;
        this.afdeling = afdeling;
    }

    public User(JSONObject jsonObject)
    {
        this.name = jsonObject.getString("username");
        this.password = jsonObject.getString("password");
        this.afdeling = jsonObject.getString("department");
    }
    public String getName() {
        return name;
    }

    public String getAfdeling() {
        return afdeling;
    }

    // hij pakt nu ook de tostring van regular en hulpdesk
}
