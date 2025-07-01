import java.util.Scanner;

public class BankOperations {
    static Latinum clientAccountBalance = new Latinum(30468);
    static Scanner scanner = new Scanner(System.in);

    static void displayAccountBalance() {
        System.out.printf("Your current available balance: " +  clientAccountBalance.formattedLatinumBalance());
    }

    static int depositMoney(int slipsDeposit) {
        if (slipsDeposit < 0) {
            System.out.println("❌ Invalid deposit. Are you trying to defraud the Bank of Ferenginar?");
            return 0;
        } else {
            BankProfitEnhancers.tipRequest();
            clientAccountBalance.add(slipsDeposit);
            return slipsDeposit;
        }
    }

    static int withdrawLatinum(int slipsToWithdraw) {
        if (slipsToWithdraw > clientAccountBalance.getTotalSlips()) {
            System.out.println("INSUFFICIENT FUNDS");
            FCACompliance.issueWarning("You have attempted to overdraw your account.");
            return 0;
        } else if (slipsToWithdraw < 0) {
            FCACompliance.issueWarning("You have attempted to defraud the Bank.");
            return 0;
        } else {
            clientAccountBalance.subtract(slipsToWithdraw);
            return slipsToWithdraw;
        }
    }
}
