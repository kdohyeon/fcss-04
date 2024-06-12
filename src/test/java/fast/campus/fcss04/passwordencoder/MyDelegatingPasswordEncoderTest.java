package fast.campus.fcss04.passwordencoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.NoOp;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyDelegatingPasswordEncoderTest {

    DelegatingPasswordEncoder myEncoder;
    Map<String, PasswordEncoder> encoders = new HashMap<>();

    @BeforeEach
    void setup() {
        encoders.put("noop", NoOpPasswordEncoder.getInstance());
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder(2, 1, 1, 1, 1));

        myEncoder = new DelegatingPasswordEncoder("noop", encoders);
    }
    @Test
    void delegatingPasswordEncoderTest() {
        // given
        String password = "danny.kim";
        String encoded = myEncoder.encode(password);

        // when
        myEncoder.matches(password, "{bcrypt}danny.kim");

        // then
        PasswordEncoder passwordEncoder1;
    }
}