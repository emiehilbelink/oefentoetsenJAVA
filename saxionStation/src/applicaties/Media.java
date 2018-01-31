package applicaties;

/**
 * Created by emiehilbelink on 30-01-18.
 */
public class Media extends Application {

    private String type;

    public Media(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {

        String info = "";

        info += super.toString();
        info += "is a type of " + type;

        return info;
    }
}
