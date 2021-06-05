package HomeWorkVladimirHaiduk.User;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class UserTest {
    Logger log = LoggerFactory.getLogger("UserTest");
    User user = new User("Test","1111");
    UserLoginService loginService = new UserLoginService();


    @Test
    public void resetCount() {
        loginService.login(user,"1234");
        int expected = 3;
        if(expected==user.resetCount()){
            log.info("Test success");
        }else{
            log.info("Test filed");
        }
    }

    @Test
    public void blockUser() {
        loginService.login(user,"1234");
        loginService.login(user,"1234");
        loginService.login(user,"1234");
        loginService.login(user,"1234");
        boolean expected = false;
        if(expected==user.blockUser()){
            log.info("Test success");
        }else{
            log.info("Test filed");
        }
    }
}