package HomeWorkVladimirHaiduk.User;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class UserTest {
    Logger log = LoggerFactory.getLogger("UserTest");
    User user = new User("Test", "1111");
    UserLoginService loginService = new UserLoginService();


    @Test
    public void resetCount() {
        loginService.login(user, "1234");
        int expected = 3;
        int actual = user.resetCount();

    }

    @Test
    public void blockUser() {
        loginService.login(user, "1234");
        loginService.login(user, "1234");
        loginService.login(user, "1234");
        loginService.login(user, "1234");
        boolean expected = false;
        boolean actual = user.blockUser();
        assertEquals(expected, actual);
        loginService.login(user,"1111");
        assertEquals(expected,user.isUnlocked());
        user.resetCount();
        loginService.login(user,"1111");
        assertEquals(true,user.isUnlocked());
    }
}