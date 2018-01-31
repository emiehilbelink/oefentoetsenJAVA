package tik;

import excep.HelpdeskException;
import user.HulpdeskEmployee;
import user.User;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public abstract class Ticket {
    protected static int number = 0;
    protected int counter = 0;
    protected String dateOfMaking;
    protected String problem;
    private String afdeling;
    private String solution;
    private boolean solved = false;
    private User user;
    private HulpdeskEmployee hulpdeskEmployee;



    public Ticket(String dateOfMaking, String problem, User user) {
        number++;
        this.counter = number;
        this.dateOfMaking = dateOfMaking;
        this.problem = problem;
        this.user = user;
    }


    public void solved(HulpdeskEmployee user, String solution){
        solved = true;
        this.solution = solution;
        this.hulpdeskEmployee = user;
        //gerralt (Helpdesk, Expertise: Mice): Try putting it into the USB port instead of the HDMI

    }

    public String getProblem() {
        return problem;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        String ticketinfo = "";
        if ( !solved ) {
            ticketinfo += "Status: open";
            ticketinfo += this.user + ": " +this.problem;
            // bij user pakt die de juiste toSTring van de class die van de extend functie gebruikt maakt
        } else{
            ticketinfo += "Status: solver";
            ticketinfo += this.user + ": " + this.problem;
            ticketinfo += this.hulpdeskEmployee + this.solution;
        }

        return ticketinfo;
    }
}

//        Status: Solved
//        jeroen (IT Lecturers): My mouse doesn't work!
//        gerralt (Helpdesk, Expertise: Mice): Try putting it into the USB port instead of the HDMI
//        port.