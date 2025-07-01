import java.util.Scanner;
import java.util.Random;

public class BankProfitEnhancers {
    static Latinum BankProfits = new Latinum(0);
    static Random random = new Random();

    public static void tipRequest() {
        System.out.println("Would you like to tip your banker? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("y")) {
            System.out.println("Excellent. We've deducted a modest 10% from your transaction");
        } else if (input.equals("n")) {
            System.out.println("No tip? In that case, we've deducted a service charge from your account.");
            FCACompliance.issueWarning("Refusal to support 'mandatory' tipping policy.");
        } else {
            FCACompliance.issueWarning("Suspicious input detected: possible attempt to bypass financial obligation.");
        }
    }

    public static int randomSurcharge() {
        return random.nextInt() * 3 + 1;
    }
}
