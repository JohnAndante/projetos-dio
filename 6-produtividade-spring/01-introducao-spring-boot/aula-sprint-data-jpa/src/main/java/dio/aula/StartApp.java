package dio.aula;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        insertUser();

        List<User> users = repository.filtrarPorNome("o");

        for (User u : users) {
            System.out.println(u);
        }
    }

    private void insertUser() {
        User user = new User();
        user.setName("Cleito rasta 4");
        user.setUsername("cleito.rasta.4");
        user.setPassword("123456");
        repository.save(user);
    }
}
