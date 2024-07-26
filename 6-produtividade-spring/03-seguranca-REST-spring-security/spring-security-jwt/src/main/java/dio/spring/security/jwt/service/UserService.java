package dio.spring.security.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.spring.security.jwt.model.User;
import dio.spring.security.jwt.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public User findByUsernameWithRoles(String username) {
        return repository.findByUsernameWithRoles(username);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public void addRole(Integer id, Integer role) {
        repository.addRole(id, role);
    }

    public void removeRole(Integer id, Integer role) {
        repository.removeRole(id, role);
    }

    public void insert(String name, String username, String password) {
        repository.insert(name, username, password);
    }

    public void update(Integer id, String name, String username, String password) {
        repository.update(id, name, username, password);
    }

    public void delete(Integer id) {
        repository.delete(id);
    }
}
