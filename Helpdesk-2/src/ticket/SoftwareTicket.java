package ticket;

import gebruikers.User;
import ticket.Ticket;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public class SoftwareTicket extends Ticket {

    private String pack;

    public SoftwareTicket( String date, String problem, User user, String pack) {
        super( date, problem, user);
        this.pack = pack;
    }

    @Override
    public String toString() {
        return "Ticket " + numberOfTicket +  "(Softwareticket, Applaction: " + pack +
        super.toString();
    }
}
