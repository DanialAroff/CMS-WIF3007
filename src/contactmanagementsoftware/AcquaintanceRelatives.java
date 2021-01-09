
package contactmanagementsoftware;

import java.util.Iterator;

public class AcquaintanceRelatives extends AcquaintanceComponent {
    Iterator iterator;
    
    public AcquaintanceRelatives(Iterator iterator) {
        this.iterator = iterator;
    }
    
    @Override
    public String print() {
        String s = "";
        int i = 1;
        while(iterator.hasNext()){
            Relatives rel = (Relatives) iterator.next();
            s = s.concat(i+". Name: " + rel.getName() + "<br>");
            s = s.concat("Mobile No: " + rel.getMobileNo() + "<br>");
            s = s.concat("Email: " + rel.getEmail() + "<br>");
            s = s.concat("Relatives Birthday: " + rel.getBDate() + "<br>");
            s = s.concat("Last met date: " + rel.getLDate() + "<br>");

            i++;
        }
        return s;
    }
}
