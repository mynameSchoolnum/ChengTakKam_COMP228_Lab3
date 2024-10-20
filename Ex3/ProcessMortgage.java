import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Please enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("\nNow Please enter details for mortgage #" + (i + 1));
            System.out.println("Please notice that only enter Business or Personal for the mortgage type input, thanks!! ");
            System.out.print("Please enter the mortgage type: ");
            String mortgageType = scanner.next();
            scanner.nextLine();

            System.out.print("1) Enter mortgage number: ");
            String mortgageNumber = scanner.nextLine();

            System.out.print("2) Enter customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("3) Enter mortgage amount: ");
            double mortgageAmount = scanner.nextDouble();

            System.out.print("4) Enter mortgage term (1 for short-term, 3 for medium-term, 5 for long-term): ");
            int term = scanner.nextInt();

            if (mortgageType.equalsIgnoreCase("Business")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else if (mortgageType.equalsIgnoreCase("Personal")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type! Please enter either 'Business' or 'Personal' !! ");
                i--;
            }
        }

        System.out.println("\nAll Mortgage Details:");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println();
        }

        scanner.close();
    }
}