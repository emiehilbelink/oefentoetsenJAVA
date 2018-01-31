package user;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public class Regular extends User {

    public Regular(String name, String password, String afdeling) {
        super(name, password, afdeling);
    }

    public Regular(JSONObject jsonObject){
        super(jsonObject);
    }

    @Override
    public String toString() {
        return name + " ( " + afdeling + " )";
    }


}
