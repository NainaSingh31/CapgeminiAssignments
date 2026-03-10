package InterestCalculator;

public abstract class Account {
    protected double interestRate;
    protected double amount;

    abstract double calculateInterest();
}