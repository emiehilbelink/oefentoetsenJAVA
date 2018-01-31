package gebruikers;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public class HelpdeskEmployee extends User {

    private String expertise;

    public HelpdeskEmployee(String userName, String passWord, String afdeling, String expertise) {
        super(userName, passWord, afdeling);
        this.expertise = expertise;
    }


    @Override
    public String toString() {
        return super.toString() +  expertise + " ) ";
    }
}
