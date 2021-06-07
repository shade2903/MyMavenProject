package loginFeature.service;

import loginFeature.bean.User;

public class LoginService {
    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            if (result) {
                restoreAttempts(user);
            } else {
                reduceLoginAttemps(user);
                blockIfLoginAttemptsExeeded(user);
            }


            return result;
        }
            return false;

    }
     private void blockIfLoginAttemptsExeeded(User user){
         if(user.getLoginAttempts()==0){
             blockUser(user);
         }

     }


    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttemps(User user) {
        user.setLoginAttempts(user.getLoginAttempts()-1);
    }



    public void blockUser(User user) {
        user.setBlocked(true);

    }

    public void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }
}
