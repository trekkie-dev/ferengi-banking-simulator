import java.util.Scanner;

public class BankUI {
    static Scanner scanner = new Scanner(System.in);
    static UserManager userManager = new UserManager();

    static void mainMenu() {
        System.out.println("=======================================================================================");
        System.out.println("==                             FIRST BANK OF FERENGINAR                              ==");
        System.out.println("==                           Your profits are OUR profits.                           ==");
        System.out.println("=======================================================================================");
        System.out.println(Colors.GREEN_BACKGROUND + "                    1. Login    2. Acquire new account    3. Exit                      " + Colors.RESET );
        System.out.print("Make a decision: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                User loggedInUser = userManager.loginUser();
                if (loggedInUser != null) {
                    accountOverview(loggedInUser);
                }
                break;
            case 2:
                userManager.registerNewUser();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void accountOverview(User loggedInUser) {
        System.out.println("                                    ACCOUNT OVERVIEW                                   ");
        System.out.println("=======================================================================================");
        System.out.println("Welcome back, " + loggedInUser.getFerengiFullName() + "!");
        System.out.println("Account number: " + loggedInUser.accountNumber);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("          1. Show Balance     2. Deposit      3. Withdrawal       4. Log Out"           );
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("Enter your choice: ");
        int accountChoice = scanner.nextInt();
        switch (accountChoice) {
            case 1:
                BankOperations.displayAccountBalance();
                System.out.println("---------------------------------------------------------------------------------------");
                accountOverview(loggedInUser);
                break;
            case 2:
                depositIntoAccount();
                BankOperations.displayAccountBalance();
                System.out.println("---------------------------------------------------------------------------------------");
                accountOverview(loggedInUser);
                break;
            case 3:
                withdrawFromAccount();
                BankOperations.displayAccountBalance();
                System.out.println("---------------------------------------------------------------------------------------");
                accountOverview(loggedInUser);
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void depositIntoAccount() {
        System.out.println(Colors.GREEN_BACKGROUND + "                                     DEPOSIT FUNDS                                     " + Colors.RESET);
        System.out.print("How much would you like to deposit? ");
        int depositAmount = scanner.nextInt();
        BankOperations.depositMoney(depositAmount);
    }

    static void withdrawFromAccount() {
        System.out.println(Colors.GREEN_BACKGROUND + "                                      WITHDRAW FUNDS                                   " + Colors.RESET);
        System.out.print("How much would you like to withdraw? ");
        int withdrawAmount = scanner.nextInt();
        BankOperations.withdrawLatinum(withdrawAmount);
    }

    static void registerAccount() {
        System.out.println("REGISTER A NEW ACCOUNT");
        System.out.println("=======================================================================================");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
    }
}
