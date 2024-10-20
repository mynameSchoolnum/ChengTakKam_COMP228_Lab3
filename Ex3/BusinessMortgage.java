class BusinessMortgage extends Mortgage {

    public BusinessMortgage(String mortgageNumber, String customerName, double mortgageAmount, double primeRate, int term) {
        super(mortgageNumber, customerName, mortgageAmount, primeRate + 1.0, term);
    }

    public String getMortgageInfo() {
        return "Business Mortgage:\n" +
                "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Mortgage Amount: $" + mortgageAmount + "\n" +
                "Interest Rate: " + interestRate + "%\n" +
                "Term: " + term + " years\n" +
                "Bank: " + bankName + "\n" +
                "Total Amount Owed (with interest): $" + calculateTotalOwed();
    }

    public double calculateTotalOwed() {
        return mortgageAmount + (mortgageAmount * (interestRate / 100));
    }
}