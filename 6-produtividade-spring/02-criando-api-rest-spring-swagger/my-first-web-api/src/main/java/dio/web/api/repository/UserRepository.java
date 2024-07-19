package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.User;

@Repository
public class UserRepository {

    public void save(User user) {
        if (user.getId() == null) {
            System.out.println("Saving the user: " + user);
        } else {
            System.out.println("Updating the user: " + user);
        }
    }

    public void deleteById(Integer id) {
        System.out.println("Deleting the user with id: " + id);
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        users.add(new User("joao", "123123"));
        users.add(new User("andre", "1ç2ç2ç"));
        users.add(new User("cleito", "00400asd"));
        return users;
    }

    public User findById(Integer id) {
        return new User("joao", "123123");
    }

    public User findByLogin(String login) {
        return new User("joao", "123123");
    }

}
