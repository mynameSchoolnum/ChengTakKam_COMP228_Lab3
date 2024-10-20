class Health extends Insurance {

    public Health() {
        super("Health Insurance");
    }

    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}
