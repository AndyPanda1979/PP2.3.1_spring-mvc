package web.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public List <User> getAllUsers() {
        System.out.println("POINT1");

//        TypedQuery<User> query = transactionManager.getSessionFactory().getCurrentSession().createQuery("from User");
//        return query.getResultList();
        return null;
    }

    @Override
    public User getUserById(Long id) {
//        return tempUsers.stream().filter(user -> user.getId() == id).findAny().orElse(null);
        return null;
    }

    @Override
    public void saveUser(User user) {
//        user.setId(++ID_COUNTER);
//        tempUsers.add(user);
    }

    @Override
    public void updateUser(Long id, User updatedUser) {
//        User proxyUser = getUserById(id);
//        proxyUser.setFirstName(updatedUser.getFirstName());
//        proxyUser.setLastName(updatedUser.getLastName());
    }

    @Override
    public void deleteUser(Long id) {
//        tempUsers.removeIf(user -> user.getId() == id);
    }
}
