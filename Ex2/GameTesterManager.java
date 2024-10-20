import java.util.Scanner;

public class GameTesterManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game tester's name here: ");
        String name = scanner.nextLine();

        System.out.println("Please only enter -FullTime / -PartTime for the input below, thanks!! ");
        System.out.print("Is the game tester full-time or part-time?: ");
        String testerType = scanner.nextLine();

        GameTester tester;

        if (testerType.equalsIgnoreCase("FullTime")) {

            tester = new FullTimeGameTester(name);
        } else if (testerType.equalsIgnoreCase("PartTime")) {

            System.out.print("Please enter the number of hours worked: ");
            int hoursWorked = scanner.nextInt();

            tester = new PartTimeGameTester(name, hoursWorked);
        } else {
            System.out.println("Invalid game tester type! Please enter either 'FullTime' or 'PartTime' !! ");
            scanner.close();
            return;
        }

        System.out.println("\nGame Tester Name: " + tester.name);
        System.out.println("Employment Status: " + (tester.isFullTime ? "FullTime" : "PartTime"));
        System.out.println("Salary: $" + tester.determineSalary());

        scanner.close();
    }
}