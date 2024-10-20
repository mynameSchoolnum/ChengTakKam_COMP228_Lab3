import java.util.Scanner;

abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;

    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}
