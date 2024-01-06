import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    UserService userService = new UserService();

    public Menu() throws SQLException {
    }

    public void publicMenu() throws SQLException {
        System.out.println("***** Welcome *****");
        System.out.println("1-SIGN UP");
        System.out.println("2-SIGN IN");
        System.out.println("3-Exit");
        System.out.println("Enter a number:");

        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1 -> signUp();
            case 2 -> signIn();
            case 3 -> System.out.println("Exit");
        }
    }
    public void signUp() throws SQLException {
        userService.signUp();
    }
    public void signIn() throws SQLException {
        userService.signIn();
    }
}
