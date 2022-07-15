package web.service;

import web.DAO.UserDAOImpl;
import web.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(Long id);
    public void saveUser(User user);
    public void updateUser(Long id, User updatedUser);
    public void deleteUser(Long id);
}
