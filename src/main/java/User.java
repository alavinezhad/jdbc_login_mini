public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String username, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
}
