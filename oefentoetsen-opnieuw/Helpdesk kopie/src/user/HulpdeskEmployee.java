package user;

import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public class HulpdeskEmployee extends User {

    private String expertise;
    private ArrayList<Ticket> solvedTickets = new ArrayList<Ticket>();

    public HulpdeskEmployee(String name, String password, String afdeling, String expertise) {
        super(name, password, afdeling);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    @Override
    public String toString() {

        return name + " ( " + afdeling+ "," + expertise + " )" ;
    }
}
