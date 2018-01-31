package applicaties;

import org.json.JSONObject;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public abstract class  Application {

   protected String name;
   protected double price;

    public Application(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Application(JSONObject jsonObject) {
        this.name = jsonObject.getString("name");
        this.price = jsonObject.getDouble("price");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        String info = "";

        info += name + "(" + price  +")";

        return info;

    }
}
