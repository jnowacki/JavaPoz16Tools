package pl.jnowacki.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void hashPassword() {
        String expected = "$2a$12$hYJ5G90y1EABpyQOnS16yuocDxQLZb6u1YUM/WKhCXrP.hQpxZSTy";

        String hash = PasswordUtil.hashPassword("hashUser1");

        assertTrue(PasswordUtil.checkPassword("hashUser1", "$2a$12$hYJ5G90y1EABpyQOnS16yuocDxQLZb6u1YUM/WKhCXrP.hQpxZSTy"));
    }
}