package dio.spring.security.jwt.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.List;

public class JWTCreator {
    private static final String SECRET = "secret";

    public static String create(JWTObject jwtObject) {
        return Jwts.builder()
                .setSubject(jwtObject.getSubject())
                .claim("roles", jwtObject.getRoles())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public static JWTObject parse(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();

        return new JWTObject(claims.getSubject(), claims.get("roles", List.class));
    }
}
