package a2i.sdi.chinchilla.dao;

import a2i.sdi.chinchilla.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public User findById(int id);

    public void save(User user);

    public void delete(int id);
}
