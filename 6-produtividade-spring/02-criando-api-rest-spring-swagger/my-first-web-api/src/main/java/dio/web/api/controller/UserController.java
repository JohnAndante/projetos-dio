package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{login}")
    public User getOne(String login) {
        return userRepository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/{id}")
    public void putUser(@RequestBody User user, Integer id) {
        userRepository.save(user);
    }
}
