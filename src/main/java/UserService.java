import java.sql.SQLException;
import java.util.Scanner;

public class UserService {
    private final Scanner scanner = new Scanner(System.in);
    UserRepository userRepository = new UserRepository();

    public UserService() throws SQLException {
    }

    public void signUp() throws SQLException {
        System.out.println("Enter your firstname:");
        String firstname = scanner.nextLine();

        System.out.println("Enter your lastname:");
        String lastname = scanner.nextLine();

        System.out.println("Username:");
        String username = scanner.nextLine();

        System.out.println("Password:");
        String password = scanner.nextLine();
        User user = new User(firstname, lastname, username, password);
        int result = userRepository.registerUser(user);
        if (result == 1)
            System.out.println("you are successfully registered.");
        else
            System.out.println("something is wrong");
    }
}
