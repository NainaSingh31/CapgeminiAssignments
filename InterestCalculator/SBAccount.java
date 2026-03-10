package InterestCalculator;

public class SBAccount extends Account {
    String accType;
    public SBAccount(double amount, String accountType) throws InvalidValueException {
        if (amount < 0) throw new InvalidValueException("Invalid amount.");
        this.amount = amount;
        this.accType = accountType;
    }

    @Override
    double calculateInterest() {
        if (accType.equals("NRI")) {
            interestRate = 6.0;
        } else {
            interestRate = 4.0;
        }
        return (amount * interestRate) / 100;
    }
}