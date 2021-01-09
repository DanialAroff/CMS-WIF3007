package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances implements Serializable{
    private String AContext;
    private String ADate;
    private String Events;
    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends(){
        numberPerF++;
    }
    
    public String getAContext() {
        return AContext;
    }

    public void setAContext(String AContext) {
        Scanner reader = new Scanner(System.in);
        if(!AContext.isEmpty())
            this.AContext = AContext;
        else{
            System.out.println("Enter at least one character");
            setAContext(reader.nextLine());
        }
    }

    public String getADate() {
        return ADate;
    }

    public void setADate(String ADate) {
        this.ADate = ADate;
    }

    public String getEvents() {
        return Events;
    }

    public void setEvents(String Events) {
        Scanner reader = new Scanner(System.in);
        if(!Events.isEmpty())
            this.Events = Events;
        else{
            System.out.println("Enter at least one character");
            setEvents(reader.nextLine());
        }
    }
}
