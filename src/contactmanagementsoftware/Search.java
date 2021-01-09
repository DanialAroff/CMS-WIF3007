/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Acer
 */
public class Search {
    
//    Acquaintance professionalAcq;
//    Acquaintance relativeAcq;
//    Acquaintance personalAcq;
//    Acquaintance casualAcq;
    
//    public Search(Acquaintance professionalAcq, Acquaintance relativeAcq, Acquaintance personalAcq, Acquaintance casualAcq) {
//        this.professionalAcq = professionalAcq;
//        this.relativeAcq = relativeAcq;
//        this.personalAcq = personalAcq;
//        this.casualAcq = casualAcq;
//    }
    
//    public String printContact() {
//        String s = "<html> <b>Search results:</b><br>Found!<br><br>Acquaintance Details: <br>";
//        
//        Iterator<Acquaintances> proIterator = professionalAcq.createIterator();
//        Iterator<Acquaintances> relIterator = relativeAcq.createIterator();
//        
//        s = s.concat(printContact(proIterator));
//        printContact(relIterator);
//        return s;
//    }
    
    public String printContact(String name, ArrayList<Acquaintances> acquaintances) {
        
        String a = "";
        Iterator iterator = acquaintances.iterator();
                
        while (iterator.hasNext()) {
            Acquaintances contact = (Acquaintances)iterator.next();
            if (contact.getName().matches(name)) 
                a = contact.getDetails();
        }
        return a;
    }
}
