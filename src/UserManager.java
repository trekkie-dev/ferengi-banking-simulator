import java.util.HashMap;
import java.util.Scanner;

public class UserManager {
    private HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<>();

        User testUser1 = new User("Quark", "Keldar", "QuarkRules", "profit");

        users.put("QuarkRules", testUser1);
    }

    public void registerNewUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Father's name: ");
        String fathersName = scanner.nextLine();

        String username;
        // The do-while loop will keep asking for a new username if the user enters one that already exists.
        do {
            System.out.print("Choose a username: ");
            username = scanner.nextLine();
            if (users.containsKey(username)) {
                System.out.println("Username is taken.");
            }
        } while (users.containsKey(username));

        System.out.print("Choose a secure password: ");
        String password = scanner.nextLine();

        User newUser = new User(name, fathersName, username, password);
        users.put(username, newUser);
        System.out.println("New user created!");
    }

    public User loginUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if user exists first
        if (!users.containsKey(username)) {
            System.out.println("Username not found!");
            return null;
        }

        User foundUser = users.get(username);
        String password;

        // Keep asking for password until correct
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (!foundUser.password.equals(password)) {
                System.out.println("Invalid password! Please try again.");
            }
        } while (!foundUser.password.equals(password));
        System.out.println("Login successful!");
        return foundUser;
    }
}
