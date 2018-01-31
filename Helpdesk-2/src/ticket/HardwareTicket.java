package ticket;

import gebruikers.User;
import ticket.Ticket;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public class HardwareTicket extends Ticket {

    private int id;

    public HardwareTicket(  String date, String problem, User user, int id) {
        super(  date, problem, user);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ticket " + numberOfTicket + "(HardwareTicket, computerId: " + this.id + "):" +
        super.toString();
    }
}
