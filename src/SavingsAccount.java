public class SavingsAccount {
    boolean isSavingsAcccount(float discardValue, float interestRate, Account account) {
        return interestRate > -discardValue && account.getBalance() > -discardValue;
    }

    void doSavingsAccountActions(float interestRate, Account account) {
        account.addTransaction(new Transaction(account.getBalance() * interestRate));
        CarEmail email = new CarEmail(account.accountID);
        MortageEmail mortgageEmail = new MortageEmail();
        mortgageEmail.send();
        mortgageEmail.send();
    }
}
