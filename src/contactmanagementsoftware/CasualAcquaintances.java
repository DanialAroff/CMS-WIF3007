package contactmanagementsoftware;

import java.io.Serializable;
import java.util.Scanner;

public class CasualAcquaintances extends Acquaintances implements Serializable{
    private String WhenWhere;
    private String Circumstances;
    private String OtherInfo;
    public static int numberCA = 0;
    
    CasualAcquaintances(){
        numberCA++;
    }
    
    public String getWhenWhere() {
        return WhenWhere;
    }

    public void setWhenWhere(String WhenWhere) {
        Scanner reader = new Scanner(System.in);
        if(!WhenWhere.isEmpty())
            this.WhenWhere = WhenWhere;
        else{
            System.out.println("Enter at least one character");
            setWhenWhere(reader.nextLine());
        }
    }

    public String getCircumstances() {
        return Circumstances;
    }

    public void setCircumstances(String Circumstances) {
        Scanner reader = new Scanner(System.in);
        if(!Circumstances.isEmpty())
            this.Circumstances = Circumstances;
        else{
            System.out.println("Enter at least one character");
            setCircumstances(reader.nextLine());
        }
    }

    public String getOtherInfo() {
        return OtherInfo;
    }

    public void setOtherInfo(String OtherInfo) {
        Scanner reader = new Scanner(System.in);
        if(!OtherInfo.isEmpty())
            this.OtherInfo = OtherInfo;
        else{
            System.out.println("Enter at least one character");
            setOtherInfo(reader.nextLine());
        }
    }

    @Override
    public String details() {
        String details = "";
        details = details.concat("Name: " + this.getName() + "<br>");
        details = details.concat("Mobile No: " + this.getMobileNo() + "<br>");
        details = details.concat("Email: " + this.getEmail() + "<br>");
        details = details.concat("First met location & time: " + this.getWhenWhere() + "<br>");
        details = details.concat("First met circumstances: " + this.getCircumstances() + "<br>");
        details = details.concat("Other useful information: " + this.getOtherInfo() + "<br>");
        return details;
    }

}
