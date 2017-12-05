import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }


    public void processInterestRates(){
        for(Account account: accounts)
        {
            account.processInterest();
        }
    }

}
