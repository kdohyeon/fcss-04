package fast.campus.fcss04.passwordencoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sha512PasswordEncoderTest {
    @Test
    void sha512Test() {
        // given
        String rawPassword = "danny.kim";

        // when
        Sha512PasswordEncoder encoder = new Sha512PasswordEncoder();
        encoder.encode(rawPassword);
    }

}