package InterestCalculator;

public class RDAccount extends Account{
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    public RDAccount(double monthlyAmount, int noOfMonths, int ageOfACHolder) throws InvalidValueException {
        if (monthlyAmount < 0) throw new InvalidValueException("Invalid amount.");
        if (noOfMonths < 0) throw new InvalidValueException("Invalid Number of months.");
        if (ageOfACHolder < 0) throw new InvalidValueException("Invalid age.");

        this.monthlyAmount = monthlyAmount;
        this.amount = monthlyAmount * noOfMonths;
        this.noOfMonths = noOfMonths;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (noOfMonths >= 6 && noOfMonths < 9) {
            interestRate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
        } else if (noOfMonths >= 9 && noOfMonths < 12) {
            interestRate = (ageOfACHolder >= 60) ? 8.25 : 7.75;
        } else if (noOfMonths >= 12 && noOfMonths < 15) {
            interestRate = (ageOfACHolder >= 60) ? 8.50 : 8.00;
        } else if (noOfMonths >= 15 && noOfMonths < 18) {
            interestRate = (ageOfACHolder >= 60) ? 8.75 : 8.25;
        } else if (noOfMonths >= 18 && noOfMonths < 21) {
            interestRate = (ageOfACHolder >= 60) ? 9.00 : 8.50;
        } else if (noOfMonths >= 21) {
            interestRate = (ageOfACHolder >= 60) ? 9.25 : 8.75;
        }
        return (amount * interestRate) / 100;
    }
}
