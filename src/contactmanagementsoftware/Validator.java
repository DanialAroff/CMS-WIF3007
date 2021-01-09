
package contactmanagementsoftware;

abstract class Validator {
    String str;

    public Validator(String str) {
        this.str = str;
    }

    public boolean isValid(){
        if(!checkNull()){
            return checkValid();
        } else {
            return false;
        }
    }

    public boolean checkNull(){
        return str.equalsIgnoreCase("");
    }
    
    public abstract boolean checkValid();
}
