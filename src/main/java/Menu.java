import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    public void publicMenu() {
        System.out.println("***** Welcome *****");
        System.out.println("1-SIGN UP");
        System.out.println("2-SIGN IN");
        System.out.println("3-Exit");
        System.out.println("Enter a number:");

        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
    }
}
