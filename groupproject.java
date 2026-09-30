import java.util.Scanner;
public class groupproject 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input household details
        System.out.print("Enter household name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of members: ");
        int members = sc.nextInt();

        System.out.print("Enter previous meter reading (litres): ");
        double previousReading = sc.nextDouble();

        System.out.print("Enter current meter reading (litres): ");
        double currentReading = sc.nextDouble();

        // Calculate water usage
        double usage = currentReading - previousReading;

        // Check for invalid reading
        if (usage < 0) {
            System.out.println("Invalid meter readings!");
            sc.close();
            return;
        }

        // Calculate bill
        double bill = 0;

        if (usage <= 5000) {
            bill = usage * 0.02;
        }
        else if (usage <= 10000) {
            bill = (5000 * 0.02) + ((usage - 5000) * 0.04);
        }
        else {
            bill = (5000 * 0.02) + (5000 * 0.04)
                    + ((usage - 10000) * 0.06);
        }

        // Usage monitoring
        String status;

        if (usage <= 5000) {
            status = "Normal Usage";
        }
        else if (usage <= 10000) {
            status = "Moderate Usage";
        }
        else {
            status = "High Usage - Please Reduce Water Consumption";
        }

        // Display result
        System.out.println("\n========== WATER USAGE REPORT ==========");
        System.out.println("Household Name : " + name);
        System.out.println("Members        : " + members);
        System.out.println("Previous Meter : " + previousReading + " L");
        System.out.println("Current Meter  : " + currentReading + " L");
        System.out.println("Water Used     : " + usage + " L");
        System.out.println("Usage Status   : " + status);
        System.out.println("Water Bill     : ₹" + bill);
        System.out.println("=========================================");

        sc.close();
    }
}
    

