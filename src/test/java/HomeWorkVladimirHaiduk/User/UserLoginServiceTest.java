package HomeWorkVladimirHaiduk.User;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class UserLoginServiceTest {
    Logger log = LoggerFactory.getLogger("UserLoginServiceTest");
    User user = new User("Test","1111");
    UserLoginService loginService = new UserLoginService();

    @Test
    public void login() {
        boolean expected = true;

        boolean actual = loginService.login(user, "1111");

        assertEquals(expected,actual);
    }
}