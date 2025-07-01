import java.util.Scanner;

public class BankAccount {
    static double accountBalance = 0;
    static Scanner scanner = new Scanner(System.in);

    static void displayAccountBalance() {
        System.out.printf("Your current available balance: €%.2f\n", accountBalance);
    }

    static double depositMoney(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("❌ Invalid deposit. Are you trying to defraud the Bank of Ferenginar?");
            return 0;
        } else {
            BankProfitEnhancers.tipRequest();
            accountBalance += depositAmount;
            return depositAmount;
        }
    }

    static double withdrawMoney(double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (withdrawAmount < 0) {
            System.out.println("CANNOT WITHDRAW NEGATIVE AMOUNT");
            return 0;
        } else {
            accountBalance -= withdrawAmount;
            return withdrawAmount;
        }
    }
}
