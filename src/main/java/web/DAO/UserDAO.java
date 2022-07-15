package web.DAO;

import web.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers () throws SQLException;
    User getUserById (Long id);
    void saveUser (User user);
    void updateUser (Long id, User updatedUser);
    void deleteUser (Long id);
}
