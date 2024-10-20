interface MortgageConstants {
    int sTerm = 1;     // 1 year
    int mTerm = 3;     // 3 years
    int lTerm = 5;     // 5 years
    String bankName = "CityToronto Bank";
    double maxAmount = 300000.0; // Maximum mortgage amount
}

abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (mortgageAmount > maxAmount) {
            this.mortgageAmount = maxAmount;
        } else {
            this.mortgageAmount = mortgageAmount;
        }

        this.interestRate = interestRate;

        if (term != sTerm && term != mTerm && term != lTerm) {
            this.term = sTerm;
        } else {
            this.term = term;
        }
    }

    public abstract String getMortgageInfo();
}
