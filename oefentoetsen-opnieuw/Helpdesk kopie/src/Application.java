import excep.HelpdeskException;
import tik.Hardware;
import tik.Software;

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


        //TODO: Create an instance of the helpdesk admin class
        Helpdesk helpdesk = new Helpdesk();
        try {


            //TODO: Read the (normal) employees from the employees.json file
            helpdesk.readFile("employees.json");

            //TODO: Add the following helpdesk employees (They are all working on the helpdeskdepartment)
            //username: gerralt, password: catsarecool, expertise: Mice
            helpdesk.addHelpDeskEmployee("Gerralt", "catsarecool", "helpdesk", "mice" );

            //TODO: Print all employees
            // in ToString;

            //TODO: Add the following tickets. Start with id 1
            //A software ticket with date: 15-01-2018, creator: ruud, "Excel can't calculate the number of days in a year", software: "Office 365"
            //A hardware ticket with date: 16-01-2018, creator: jeroen, "My mouse doesn't work!", hardwareCode: 5
            //A software ticket with date: 17-01-2018, creator: ruud, "MacOS won't boot on my system", software: "MacOS X"
            helpdesk.addSoftWareTicket("15-01-2018","ruud", "excel can't calculate" , "software: Office 365" );
            helpdesk.addHardWareTicket("16-01-2018","jeroen", "my mouse doesn't work" , 5 );
            helpdesk.addSoftWareTicket("17-01-2018","ruud", "MaxOS won't" , "software: MAacOS X" );



            //TODO: Solve ticket 2 and 3 (The last two)
            //tik.Ticket 2, solver: gerralt, message: "Try putting it into the USB port instead of the HDMI port."
            //tik.Ticket 3, solver: gerralt, message: "Please replace your Dell laptop with a real system"
            helpdesk.resolveTicket(2,"gerralt", "Try putting it into the USB port instead of the HDMI port.");
            helpdesk.resolveTicket(3,"gerralt", "Please replace your Dell laptop with a real system");

            //TODO: Print the tickets
            // in ToString

            System.out.println(helpdesk);

        } catch (HelpdeskException exception){
            System.out.println(exception.getMessage());
        } catch (IOException ieo){
            System.out.println(ieo.getMessage());
        }
    }
}
