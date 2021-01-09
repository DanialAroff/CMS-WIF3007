
package contactmanagementsoftware;


public class EmailChecker extends Validator {

    public EmailChecker(String str) {
        super(str);
    }
    
    @Override
    public boolean checkValid() {
        return str.contains("@");
    }
}
