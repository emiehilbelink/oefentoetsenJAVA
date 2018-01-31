package tik;

import tik.Ticket;
import user.User;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public class Hardware extends Ticket {

    private int idOfComputer;

    public Hardware(String dateOfMaking, String problem, User user, int idOfComputer) {
        super(dateOfMaking, problem, user);
        this.idOfComputer = idOfComputer;
    }

    @Override
    public String toString() {

        return  "tik.Ticket " + counter + "(Hardwarewareticket, computerId: " + idOfComputer + " ):" +
                super.toString();
    }
}

//tik.Ticket 2 (Hardwareticket, computerId: 5):
