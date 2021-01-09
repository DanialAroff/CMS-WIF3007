
package contactmanagementsoftware;

public class CasualAcquaintanceFactory extends AcquaintancesFactory {

    @Override
    public Acquaintances getAcquaintance() {
        return new CasualAcquaintances();
    }
    
}
