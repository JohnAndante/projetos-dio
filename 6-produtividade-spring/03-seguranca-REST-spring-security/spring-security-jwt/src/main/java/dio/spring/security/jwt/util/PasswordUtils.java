package dio.spring.security.jwt.util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
    public static String encrypt(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    public static boolean validate(String password, String hash) {
        return new BCryptPasswordEncoder().matches(password, hash);
    }
}
