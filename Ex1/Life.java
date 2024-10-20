class Life extends Insurance {

    public Life() {
        super("Life Insurance");
    }

    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}