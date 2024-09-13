import java.util.Scanner;
   public class SchruteBuckConverter {
    // Final variables for conversion rates
    private static final int KLEVINS_PER_SCHRUTE_BUCK = 20;
    private static final int STANLEY_NICKELS_PER_KLEVIN = 12;
    private static final int STANLEY_NICKELS_PER_SCHRUTE_BUCK = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();

        System.out.print("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();

        // Convert the old format to decimal schrute-bucks
        double decimalSchruteBucks = convertToDecimalSchruteBucks(schruteBucks, klevins, stanleyNickels);

        // Display output
        System.out.printf("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        // Close scanner
        scanner.close();
    }

    private static double convertToDecimalSchruteBucks(int schruteBucks, int klevins, int stanleyNickels) {
        // Calculate total schrute-bucks from klevins and stanley-nickels
        double totalKlevins = schruteBucks * KLEVINS_PER_SCHRUTE_BUCK + klevins;
        double totalStanleyNickels = totalKlevins * STANLEY_NICKELS_PER_KLEVIN + stanleyNickels;

        // Convert total stanley-nickels to decimal schrute-bucks
        return totalStanleyNickels / STANLEY_NICKELS_PER_SCHRUTE_BUCK;
    }
}
