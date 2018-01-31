package ticket;

import gebruikers.HelpdeskEmployee;
import gebruikers.User;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public abstract class Ticket {
    private static int counter;
    protected  int numberOfTicket;
    protected String date;
    protected String problem;
    protected User user;
    private HelpdeskEmployee helpdeskEmployee;
    private boolean solved = false;
    private String solution;

    public Ticket( String date, String problem, User user) {
        this.counter = counter;
        counter ++;
        this.numberOfTicket = counter;
        this.date = date;
        this.problem = problem;
        this.user = user;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void solved(HelpdeskEmployee user, String solution){
        // deze moet correcte gegevens doorgeven aan de toString else{} maar lukt niet
        this.solved = true;
        this.helpdeskEmployee = user;
        this.solution = solution;
    }

    @Override
    public String toString() {
         String message = "";

        if(!solved){
           message +=  "\n" + "Status: Open";
           message += "\n" + this.user + ":" + this.problem;
        }else{
            // hij komt niet hierin, bij de twee onderste tickets moet deze informatie komen maar hij pakt de functie niet

            message += "\n" + "Status: Solved";
            message += "\n" + this.user + ":" + this.problem;
            message += "\n" + this.helpdeskEmployee + this.solution;
        }

        return message;
    }
}
