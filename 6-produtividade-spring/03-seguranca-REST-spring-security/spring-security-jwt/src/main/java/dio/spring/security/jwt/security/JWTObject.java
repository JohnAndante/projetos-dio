package dio.spring.security.jwt.security;
import java.util.List;

public class JWTObject {
    private String subject;
    private List<String> roles;

    public JWTObject() {
    }

    public JWTObject(String subject, List<String> roles) {
        this.subject = subject;
        this.roles = roles;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "JWTObject{" +
                "subject='" + subject + '\'' +
                ", roles=" + roles +
                '}';
    }
}
