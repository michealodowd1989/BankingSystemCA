import java.util.List;

public class Account {

//    float openingBalanceForFY;

    String accountID;
    DepositAccount depositAccount;
    SavingsAccount savingsAccount;

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    private float interestRate;

    private List<Transaction> transactions;

    public Account(String accountID, List<Transaction> transactions) {
        this.accountID = accountID;
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public float getBalance() {
        float balance = 0.0f;

        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
        }

        return balance;

    }

    public void processInterest() {
        float discardValue = 0.000001f;

        if (depositAccount.isDepositAccount(discardValue, interestRate)) { //depositAccount
            depositAccount.doDepositAccountActions(this);
        } else if (savingsAccount.isSavingsAcccount(discardValue, interestRate, this)) { // savingsAccount
            savingsAccount.doSavingsAccountActions(interestRate, this);
        }
    }

}
