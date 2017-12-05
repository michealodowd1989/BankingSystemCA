public class DepositAccount {
    boolean isDepositAccount(float discardValue, float interestRate) {
        return interestRate > -discardValue && interestRate < discardValue;
    }

    void doDepositAccountActions(Account account) {
        if (account.getBalance() > 50_000.0f) {
            Email email = new Email(account.accountID);
            email.askToCreateSavingsAccount();
        }
    }
}
