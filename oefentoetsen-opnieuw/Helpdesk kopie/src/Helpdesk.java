import excep.HelpdeskException;
import org.json.JSONArray;
import org.json.JSONObject;
import tik.Hardware;
import tik.Software;
import tik.Ticket;
import user.User;
import user.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by emiehilbelink on 23-01-18.
 */
public class Helpdesk {

    private ArrayList<User> userList = new ArrayList<>();
    private ArrayList<Ticket> ticketList = new ArrayList<>();

    public  void readFile(String filename) throws IOException, HelpdeskException{
        JSONArray jsonArray = new JSONArray(new String(Files.readAllBytes(Paths.get(filename))));

        for( int i = 0 ; i < jsonArray.length() ; i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Regular user = new Regular(jsonObject);
            userList.add(user);
        }
    }

    public void addHelpDeskEmployee(String name, String password, String afdeling, String expertise) throws IOException, HelpdeskException{
        userList.add(new HulpdeskEmployee(name,password,afdeling,expertise));
    }


    public void addSoftWareTicket(String date, String userName, String problem ,  String softwarepacke) throws HelpdeskException {
        User user = findUser(userName);

        if ( user == null ){
            throw new HelpdeskException("sorry this employee doens't excist");
        }

        //  public Hardware(String dateOfMaking, String problem, User user, int idOfComputer)
        Software software = new Software(date,problem,user,softwarepacke);
        ticketList.add(software);
    }

    public void addHardWareTicket(String date, String userName,  String problem, int computerId) throws HelpdeskException {
        User user = findUser(userName);

        if ( user == null ){
            throw new HelpdeskException("sorry this employee doens't excist");
        }

        //  public Hardware(String dateOfMaking, String problem, User user, int idOfComputer)
        Hardware hardware = new Hardware(date,problem,user,computerId);
        ticketList.add(hardware);
    }



   public void resolveTicket(int numberOfTicket, String employeeName, String solution) throws HelpdeskException {
        // check het ticketnummer als je die gevonden hebt stuur je die straks door voor solver = true;
       // check of de employee een hulpdesk persoon is
       User user = findEmployee(employeeName);
       if ( user == null){
           throw new HelpdeskException("Sorry dit is geen employee");
       }


       Ticket ticket = findTicketWithNumber(numberOfTicket);


       ticket.solved((HulpdeskEmployee)user,solution);
       // je krijg als je nu deze doorgeeft de toString van de specifieke employeee

   }

    private User findUser(String name){
        for ( User user : userList){
            if ( user.getName().equalsIgnoreCase(name)){
                return user;
            }
        }

        return null;
    }

   private User findEmployee(String userName){
        for ( User user : userList){
            if ( user instanceof HulpdeskEmployee){
                HulpdeskEmployee hulpdesk = (HulpdeskEmployee)user;
                if ( user.getName() == hulpdesk.getName()) {
                    return hulpdesk;
                }
            }
        }

       return null;
   }

    private Ticket findTicket(String problem){
        for( Ticket ticket : ticketList){
            if ( ticket.getProblem().equals(problem)){
                return ticket;
            }
        }

        return null;
    }

   private Ticket findTicketWithNumber(int number){
        for( Ticket ticket : ticketList){
            if ( ticket.getCounter()==(number)){
                return ticket;
            }
        }

        return null;
   }


    @Override
    public String toString() {

        String string = "Employees";

        for ( User user : userList){
                string += "\n" + user;
        }

        string += "Tickets" ;

        for ( Ticket ticket : ticketList){
            string += "\n" + ticket;
        }

        return string;

    }
}
