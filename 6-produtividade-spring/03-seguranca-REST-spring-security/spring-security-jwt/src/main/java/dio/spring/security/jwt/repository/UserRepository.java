package dio.spring.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import dio.spring.security.jwt.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername(String username);

    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
    User findByUsernameWithRoles(String username);

    @Query("INSERT INTO tab_user_roles (id_user, role_id) VALUES (:id, :role)")
    void addRole(Integer id, Integer role);

    @Query("DELETE FROM tab_user_roles WHERE id_user = :id AND role_id = :role")
    void removeRole(Integer id, Integer role);

    @Query("INSERT INTO User u (u.name, u.username, u.password) VALUES (:name, :username, :password)")
    void insert(String name, String username, String password);

    @Query("UPDATE User u SET u.name = :name, u.username = :username, u.password = :password WHERE u.id = :id")
    void update(Integer id, String name, String username, String password);

    @Query("DELETE FROM User u WHERE u.id = :id")
    void delete(Integer id);

    @Query("SELECT u FROM User u JOIN FETCH u.roles")
    List<User> findAll();
}
