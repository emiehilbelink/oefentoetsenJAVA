import exception.SysteemException;
import gebruikers.HelpdeskEmployee;
import gebruikers.User;
import org.json.JSONArray;
import org.json.JSONObject;
import ticket.HardwareTicket;
import ticket.SoftwareTicket;
import ticket.Ticket;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by emiehilbelink on 29-01-18.
 */
public class Helpdesk {

    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public void read (String filename) throws IOException{
        JSONArray jsonArray = new JSONArray(new String(Files.readAllBytes(Paths.get(filename))));

        for ( int i =0 ; i<jsonArray.length() ; i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            User user = new User(jsonObject);
            userList.add(user);
        }
    }

    public void addHelpdeskEmployee(String username, String password, String afdeling, String expertise) throws SysteemException{
        HelpdeskEmployee helpdeskEmployee = new HelpdeskEmployee(username,password,afdeling,expertise);
        userList.add(helpdeskEmployee);
    }


    public void addHardWareTicket(String date, String userName, String problem, int id) throws SysteemException{

        User user = findUser(userName);

        if ( user == null){
            throw new SysteemException("sorry this employee doesn't excist");
        }

        HardwareTicket hardwareTicket = new HardwareTicket(date,problem,user,id);
        ticketList.add(hardwareTicket);

    }


    public void addsoftwareTicket(String date, String userName, String problem, String pack) throws SysteemException{

        User user = findUser(userName);

        if ( user == null){
            throw new SysteemException("sorry this employee doesn't excist");
        }

        SoftwareTicket softwareTicket = new SoftwareTicket(date,problem,user,pack);
        ticketList.add(softwareTicket);

    }

    public void solveTicket(int ticketnumber, String userName, String solution) throws SysteemException{
        Ticket ticket = findTicketNumer(ticketnumber);

        if ( ticket == null){
            throw new SysteemException("sorry this number doensnt excist");
        }

        User user = findUser(userName);
        if ( user == null){
            throw new SysteemException("sorry this employee doens;t excist");
        }


        if ( user instanceof HelpdeskEmployee){
            ticket.solved((HelpdeskEmployee) user,solution);
        }else{
            throw new SysteemException("sorry this isnt nog an helpdeskemployee");
        }
        // wat gaat hier fout? als ik op debug zet dan staad er werl nettjes dat t is doorgeven
        // de eception wordt namelijk niet getoond.


    }

    public String printTickets(){
        String tickets = "Tickets";


        for ( Ticket ticket : ticketList){
            tickets += "\n" + ticket;
        }

        return tickets;
    }


    public String printAllEmployee(){
        String string = "Employees";

        for ( User user : userList ){
            string += "\n" + user;
        }

        return string;
    }


    private Ticket findTicketNumer(int ticketnumber){
        for ( Ticket ticket : ticketList){
            if ( ticket.getNumberOfTicket() == ticketnumber){
                return ticket;
            }
        }

        return null;
    }
    private User findUser(String userName){
        for ( User user : userList){
            if ( user.getUserName().equalsIgnoreCase(userName)){
                return user;
            }
        }
        return null;
    }
}
