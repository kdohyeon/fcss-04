package fast.campus.fcss04.passwordencoder;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha512PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return hashWithSHA512(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        String hashedPassword = encode(rawPassword);
        return encodedPassword.equals(hashedPassword);
    }

    private String hashWithSHA512(String password) {
        StringBuilder sb = new StringBuilder();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] digest = md.digest(password.getBytes());
            for (byte b : digest) {
                sb.append(Integer.toHexString(0xFF & b));
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("invalid algorithm");
        }

        return sb.toString();
    }
}
