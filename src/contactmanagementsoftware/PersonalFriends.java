package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances implements Serializable{
    private String firstAcqContext;
    private String firstAcqDate;
    private String Events;
    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends(){
        numberPerF++;
    }
    
    public String getFirstAcqContext() {
        return firstAcqContext;
    }

    public void setFirstAcqContext(String firstAcqContext) {
        reader = new Scanner(System.in);
        if(!firstAcqContext.isEmpty())
            this.firstAcqContext = firstAcqContext;
        else{
            System.out.println("Enter at least one character");
            setFirstAcqContext(reader.nextLine());
        }
    }

    public String getFirstAcqDate() {
        return firstAcqDate;
    }

    public void setFirstAcqDate(String firstAcqDate) {
        this.firstAcqDate = firstAcqDate;
    }

    public String getEvents() {
        return Events;
    }

    public void setEvents(String Events) {
        reader = new Scanner(System.in);
        if(!Events.isEmpty())
            this.Events = Events;
        else{
            System.out.println("Enter at least one character");
            setEvents(reader.nextLine());
        }
    }

    @Override
    public String getDetails() {
        String details = "";
        details = details.concat("Category: Personal Friends" + "<br>");
        details = details.concat("Name: " + this.getName() + "<br>");
        details = details.concat("Mobile No: " + this.getMobileNo() + "<br>");
        details = details.concat("Email: " + this.getEmail() + "<br>");
        details = details.concat("Specific events: " + this.getEvents() + "<br>");
        details = details.concat("First Acquaintance context: " + this.getFirstAcqContext() + "<br>");
        details = details.concat("First Acquaintance date: " + this.getFirstAcqDate() + "<br>");
        return details;
    }
}
