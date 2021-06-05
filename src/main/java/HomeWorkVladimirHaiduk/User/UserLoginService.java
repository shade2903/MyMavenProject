package HomeWorkVladimirHaiduk.User;

public class UserLoginService {
    public boolean login(User user, String password){
         if (user.getCount()==0) {
             user.blockUser();
             return false;
         }else if(user.getPassword().equals(password)){
            user.resetCount();
            user.setUnlocked(true);
            return true;
        }else if (!user.getPassword().equals(password)&&user.isUnlocked()){
            user.setCount(user.getCount()-1);
            return false;
        }
        return true;
    }

}
