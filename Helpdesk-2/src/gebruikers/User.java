package gebruikers;

import org.json.JSONObject;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public class User {

    protected String userName;
    protected String passWord;
    protected String afdeling;

    public User(String userName, String passWord, String afdeling) {
        this.userName = userName;
        this.passWord = passWord;
        this.afdeling = afdeling;
    }

    public User(JSONObject jsonObject){
        this.userName = jsonObject.getString("username");
        this.passWord = jsonObject.getString("password");
        this.afdeling = jsonObject.getString("department");
    }

    public String getUserName() {
        return userName;
    }


    @Override
    public String toString() {
        return userName + " ( " + afdeling + " )";
    }
}
