package loginFeature.service;

import loginFeature.bean.User;

public class LoginService {


    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
