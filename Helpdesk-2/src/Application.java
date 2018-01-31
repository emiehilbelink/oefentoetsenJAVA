import exception.SysteemException;

import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        /**
         * Add method calls to your administration class below. Your program should perform the given
         * steps. Please also handle errors and print the error message when something went wrong!
         * Possible errors are:
         *  - Adding users with duplicate usernames
         *  - TODO
         *  - Errors reading the input file (In this case the file is ok, but maybe in the future we will use a wrong file)
         */

        //TODO: Remove the following
        //System.out.println("Yay! I am running!");

        //TODO: Create an instance of the helpdesk admin class
        Helpdesk helpdesk = new Helpdesk();

        //TODO: Read the (normal) employees from the employees.json file
        try {
            helpdesk.read("employees.json");
        } catch ( IOException ioe){
            System.out.println(ioe.getMessage());
        }

        //TODO: Add the following helpdesk employees (They are all working on the helpdeskdepartment)
        //username: gerralt, password: catsarecool, expertise: Mice
        try {
            helpdesk.addHelpdeskEmployee("gerralt", "catsarecool", "helpdesk" , "Mice");
        } catch (SysteemException exception) {
            System.out.println(exception.getMessage());
        }

        //TODO: Print all employees
        System.out.println(helpdesk.printAllEmployee());

        //TODO: Add the following tickets. Start with id 1
        //A software ticket with date: 15-01-2018, creator: ruud, "Excel can't calculate the number of days in a year", software: "Office 365"
        //A hardware ticket with date: 16-01-2018, creator: jeroen, "My mouse doesn't work!", hardwareCode: 5
        //A software ticket with date: 17-01-2018, creator: ruud, "MacOS won't boot on my system", software: "MacOS X"
        try{
            helpdesk.addHardWareTicket("16-01-2018", "jeroen", "my mouse doesn't work" , 5);
            helpdesk.addsoftwareTicket("15-01-2018", "ruud", "excel can't calculate", "software: office 365");
            helpdesk.addsoftwareTicket("17-01-2018", "ruud", "macOS wont reboot on my system", "software: MacO X");
        }catch (SysteemException exception){
            System.out.println(exception.getMessage());
        }
        //TODO: Solve ticket 2 and 3 (The last two)
        //ticket.Ticket 2, solver: gerralt, message: "Try putting it into the USB port instead of the HDMI port."
        //ticket.Ticket 3, solver: gerralt, message: "Please replace your Dell laptop with a real system"
        try{
            helpdesk.solveTicket(2, "gerralt", "Try putting it into the USB port");
            helpdesk.solveTicket(3, "gerralt", "please replace your Dell laptop");
        }catch (SysteemException exception){
            System.out.println(exception.getMessage());
        }
        //TODO: Print the tickets


        System.out.println(helpdesk.printTickets());

    }
}
