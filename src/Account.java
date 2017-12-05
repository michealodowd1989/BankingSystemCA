import java.util.List;

public class Account {

//  float openingBalanceForFY;
    String accountID;
    private float creditLimit;
    private final float CREDIT_THRESHOLD = 200f;
    private final float NEAR_ZERO = 0.0f;
    private float interestRate;
    private List<Transaction> transactions;

    DepositAccount depositAccount;
    SavingsAccount savingsAccount;

    public Account(String accountID, List<Transaction> transactions) {
        this.accountID = accountID;
        this.transactions = transactions;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
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

    private boolean isLoanAccount() {
        return getInterestRate() > NEAR_ZERO && getBalance() <= 0f && creditLimit > CREDIT_THRESHOLD;
    }

    private boolean isSavingsAccount() {
        return getInterestRate() > NEAR_ZERO && getBalance() >= 0 && (creditLimit == 0f);
    }

    private boolean isDepositAccount() {
        return Math.abs(getInterestRate()) < NEAR_ZERO && creditLimit <= CREDIT_THRESHOLD;
    }

    public float getInterestRate() {
        return interestRate;
    }

    /*Hi Paudie, Micheal,

I have been looking at the assignement and want to make a change that should make life a little easier....

At the moment the different types of bank account are defined by the interest rate and the balance.

A Deposit account is defined as not having an interest rate
A savings account is defined as having a non-zero  interest rate and a positive balance
A loan accoutn is defined as having non-zero interest rate and a negative balance.

While these conditions are fine, there is a problem in differentiating between a loan account
 and a savings account when both have just been created and therefore have balances of zero.
  So, I want to add a field called credit limit to the Account class.
A loan class will have a credit limit >= €200, over 200
a deposit account will have a credit limit of up to, but not including €200, and 0-199
a savings account will have a credit limit of zero.


If you have already started the assignment and have not had a problem with writing your
initial tests then ignore this email and keep going. If you haven't started the assignment
then make the change.*/

}
