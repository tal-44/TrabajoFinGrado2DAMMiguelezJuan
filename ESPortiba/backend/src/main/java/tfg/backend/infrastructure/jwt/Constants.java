package tfg.backend.infrastructure.jwt;

import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Constants {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    public static final String SUPER_SECRET_KEY = "K9nM2pQ9wX4vF7tY1cL5aR3hU6iB0sE4mD7gN9xZ2kP5jH8wM3fC6yT4bA9vL0nSqW3rTyU";
    public static final long TOKEN_EXPIRATION_TIME = 1500000; // 15 minutos

    public static Key getSignedKey(String secretKey) {
        byte [] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor( keyBytes);
    }
}