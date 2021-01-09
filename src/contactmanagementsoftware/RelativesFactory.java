
package contactmanagementsoftware;

public class RelativesFactory extends AcquaintancesFactory {

    @Override
    public Acquaintances getAcquaintance() {
        return new Relatives();
    }
    public Acquaintances getAcquaintances(String bd) {
        Relatives rel = new Relatives();
        rel.setBDate(bd);
        return rel;
    }
    
}
