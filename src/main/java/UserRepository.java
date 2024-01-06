import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private final JdbcConnection jdbcConnection = new JdbcConnection();

    public UserRepository() throws SQLException {
    }

    public int registerUser(User user) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addUser = "INSERT INTO USERS(first_name, last_name, username, password)\n" +
                "VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(addUser);

        preparedStatement.setString(1, user.getFirstName());
        preparedStatement.setString(2, user.getLastName());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());

        return preparedStatement.executeUpdate();
    }
    public User findByUsername(String username) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findUsername = "SELECT * FROM users WHERE username = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(findUsername);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String getUsername = resultSet.getString("username");
            String password = resultSet.getString("password");
            int id = resultSet.getInt("id");

            return new User(id, firstName, lastName, getUsername, password);
        }
        else
            return null;
    }
}
