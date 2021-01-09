
package contactmanagementsoftware;


public class NameChecker extends Validator {
    
    public NameChecker(String str) {
        super(str);
    }
    
    @Override
    public boolean checkValid() {
        return str.isEmpty();
    }
    
}
