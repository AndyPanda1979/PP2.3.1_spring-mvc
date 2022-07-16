package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDAOImpl;
import web.models.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDAOImpl userDAO;
    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List <User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void saveUser(User user) { userDAO.saveUser(user); }

    @Override
    public void updateUser(Long id, User updatedUser) {
        userDAO.updateUser(id, updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
}
