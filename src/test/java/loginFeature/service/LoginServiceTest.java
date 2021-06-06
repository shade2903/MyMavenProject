package loginFeature.service;

import loginFeature.bean.User;
import org.junit.Assert;
import org.junit.Test;



public class LoginServiceTest {
    @Test
    public void checkUserPassword_positive() {
        User user = new User();
        user.setPassword("password");

        String userInput = "password";

        LoginService loginService = new LoginService();
        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);


    }

    @Test
    public void checkUserPassword_negative() {
        User user = new User();
        user.setPassword("password");

        String userInput = "wrong";

        LoginService loginService = new LoginService();
        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);

    }
}