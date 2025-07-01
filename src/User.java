import java.util.Random;

public class User {
    String name;
    String fathersName;

    String firstName;
    String lastName;
    String username;
    String password;
    String accountNumber;

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.accountNumber = generateAccountNumber();
    }

    static String generateAccountNumber() {
        Random random = new Random();
        int accountNumber = 100000000 + random.nextInt(900000000);
        return String.valueOf(accountNumber);
    }
}

