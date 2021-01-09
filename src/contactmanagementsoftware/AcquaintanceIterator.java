
package contactmanagementsoftware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AcquaintanceIterator implements Iterator {
    Iterator ec;
    String acquaintanceName;
    int acquaintanceType;
    Acquaintances nextAcquaintances;
    
    public AcquaintanceIterator(ArrayList<Acquaintances> ec,
        String acquaintanceName, int acquaintanceType) {
        this.ec = ec.iterator();
        this.acquaintanceName = acquaintanceName;
        this.acquaintanceType = acquaintanceType;
    }
    
    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        while (ec.hasNext()) {
            Acquaintances tempObj = (Acquaintances) ec.next();
            if (tempObj.getName().equalsIgnoreCase(acquaintanceName)) {
                matchFound = true;
                nextAcquaintances = tempObj;
                break;
            }
        }

        if (matchFound != true) {
            nextAcquaintances = null;
        }
        return matchFound;
    }
     @Override
    public Object next() {
        if (nextAcquaintances == null) {
            throw new NoSuchElementException();
        } else {
            return nextAcquaintances;
        }
    }
    
    public String print() {
        String s = "";
        int i = 1;
        while(hasNext()){
            switch (acquaintanceType) {
                case 0:
                    PersonalFriends perF = (PersonalFriends) next();
                    s = s.concat(i+". Name: " + perF.getName() + "<br>");
                    s = s.concat("Mobile No: " + perF.getMobileNo() + "<br>");
                    s = s.concat("Email: " + perF.getEmail() + "<br>");
                    s = s.concat("Specific events: " + perF.getEvents() + "<br>");
                    s = s.concat("First Acquaintance context: " +
                    perF.getAContext() + "<br>");
                    s = s.concat("First Acquaintance date: " + perF.getADate() +
                   "<br>");
                    break;
                case 1:
                    Relatives rel = (Relatives) next();
                    s = s.concat(i+". Name: " + rel.getName() + "<br>");
                    s = s.concat("Mobile No: " + rel.getMobileNo() + "<br>");
                    s = s.concat("Email: " + rel.getEmail() + "<br>");
                    s = s.concat("Relatives Birthday: " + rel.getBDate() + "<br>");
                    s = s.concat("Last met date: " + rel.getLDate() + "<br>");
                    break;
                case 2:
                    ProfessionalFriends proF = (ProfessionalFriends) next();
                    s = s.concat(i+". Name: " + proF.getName() + "<br>");
                    s = s.concat("Mobile No: " + proF.getMobileNo() + "<br>");
                    s = s.concat("Email: " + proF.getEmail() + "<br>");
                    s = s.concat("Common Interests: " +
                    proF.getCommonInterests() + "<br>");
                    break;
                default:
                    CasualAcquaintances ca = (CasualAcquaintances) next();
                    s = s.concat(i+". Name: " + ca.getName() + "<br>");
                    s = s.concat("Mobile No: " + ca.getMobileNo() + "<br>");
                    s = s.concat("Email: " + ca.getEmail() + "<br>");
                    s = s.concat("First met location & time: " +
                    ca.getWhenWhere() + "<br>");
                    s = s.concat("First met circumstances: " +
                    ca.getCircumstances() + "<br>");
                    s = s.concat("Other useful information: " + ca.getOtherInfo() +
                    "<br>");
                     break;
                } 
            i++;
        }
        return s;
    }
}
        
   

