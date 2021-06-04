package HomeWork.User;

public class UserLoginService {
    boolean login(User user, String password){
        if(user.getPassword().equals(password)&&user.getCount()!=0&&user.isUnlocked() ){
            user.resetCounter();
            return true;
        }else if (!user.getPassword().equals(password)&&user.getCount()!=0&&user.isUnlocked()){
            user.setCount(user.getCount()-1);
        }if (!user.getPassword().equals(password)&&user.getCount()>3&&user.isUnlocked()){
            user.blockUser();
            return false;
        }
        return true;
    }

}
