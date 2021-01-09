package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class Relatives extends Acquaintances implements Serializable{
    private String BirthDate;
    private String LastMetDate;
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    
    Relatives(){
        numberRel++;
    }
    
    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getLastMetDate() {
        return LastMetDate;
    }

    public void setLastMetDate(String LastMetDate) {
        this.LastMetDate = LastMetDate;
    }

    @Override
    public String getDetails() {
        String details = "";
        details = details.concat("Category: Relatives" + "<br>");
        details = details.concat("Name: " + this.getName() + "<br>");
        details = details.concat("Mobile No: " + this.getMobileNo() + "<br>");
        details = details.concat("Email: " + this.getEmail() + "<br>");
        details = details.concat("Relatives Birthday: " + this.getBirthDate() + "<br>");
        details = details.concat("Last met date: " + this.getLastMetDate() + "<br>");
        return details;
    }
}
