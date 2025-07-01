import java.util.Random;

public class User {
    String name;
    String fathersName;
    String username;
    String password;
    String accountNumber;

    public User(String name, String lastName, String username, String password) {
        this.name = name;
        this.fathersName = lastName;
        this.username = username;
        this.password = password;
        this.accountNumber = generateAccountNumber();
    }

    public String getFerengiFullName() {
        return name + ", Son of " + fathersName;
    }

    static String generateAccountNumber() {
        Random random = new Random();
        int accountNumber = 100000000 + random.nextInt(900000000);
        return String.valueOf(accountNumber);
    }
}

