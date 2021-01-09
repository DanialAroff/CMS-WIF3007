
package contactmanagementsoftware;

public class ProfessionalFriendsFactory extends AcquaintancesFactory {

    @Override
    public Acquaintances getAcquaintance() {
        return new ProfessionalFriends();
    }
    
}
