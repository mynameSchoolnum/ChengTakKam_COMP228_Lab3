import java.util.Scanner;

public class InsuranceManager {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of insurance policies to be created: ");
        int numberOfPolicies = scanner.nextInt();
        scanner.nextLine();

        Insurance[] insurances = new Insurance[numberOfPolicies];

        for (int i = 0; i < numberOfPolicies; i++) {
            System.out.println("Please only enter either 'Life' or 'Health' for the input, thanks! ");
            System.out.println(" ");
            System.out.print("Please enter the type of insurance - Life / - Health: ");
            String insuranceType = scanner.nextLine();

            System.out.print("Please enter the monthly cost of the insurance: $");
            double monthlyCost = scanner.nextDouble();
            scanner.nextLine();

            if (insuranceType.equalsIgnoreCase("Life")) {
                insurances[i] = new Life();
            } else if (insuranceType.equalsIgnoreCase("Health")) {
                insurances[i] = new Health();
            } else {
                System.out.println("Invalid insurance type! Please enter either 'Life' or 'Health' thanks!! ");
                i--; //Wschool- n:keep do until done..
                continue;
            }

            insurances[i].setInsuranceCost(monthlyCost);
        }
        System.out.println("\nInsurance Information:");
        for (Insurance insurance : insurances) {
            insurance.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}
