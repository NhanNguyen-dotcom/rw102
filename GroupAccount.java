import java.time.LocalDate;

public class GroupAccount {
    Group group;
    Account account;
    LocalDate joinDate;

    public GroupAccount() {
        group = new Group();
        account = new Account();
    }
}
