package a2i.sdi.chinchilla.dao;

import a2i.sdi.chinchilla.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private EntityManager entityManager;

    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    @Override
    public User find(User user) {
        Query query = entityManager.createQuery("select u from User u where u.username = :username and u.password = :password");
        query.setParameter("username", user.getUsername());
        query.setParameter("password", user.getPassword());
        return (User) query.getResultStream().findFirst().orElse(null);
    }

    @Override
    public User findById(int id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void save(User user) {
        User dbUser = entityManager.merge(user);
        user.setId(dbUser.getId());
    }

    @Override
    public void delete(int userId) {
        Query query = entityManager.createQuery("delete from User where id = :userId");
        query.setParameter("userId", userId);
    }
}
