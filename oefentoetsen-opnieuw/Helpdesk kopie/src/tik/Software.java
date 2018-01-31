package tik;

import tik.Ticket;
import user.User;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public class Software extends Ticket {

    private String softWarePackage;

    public Software(String dateOfMaking, String problem, User user, String softWarePackage) {
        super(dateOfMaking, problem, user);
        this.softWarePackage = softWarePackage;
    }

    @Override
    public String toString() {
        return "tik.Ticket " + counter + " (Softwareticket, " + softWarePackage +
                super.toString();
    }
}

//tik.Ticket 1 (Softwareticket, Application: Office 365):