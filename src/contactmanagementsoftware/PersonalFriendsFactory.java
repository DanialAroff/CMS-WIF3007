
package contactmanagementsoftware;

public class PersonalFriendsFactory extends AcquaintancesFactory {

    @Override
    public Acquaintances getAcquaintance() {
        return new PersonalFriends();
    }
    
}
