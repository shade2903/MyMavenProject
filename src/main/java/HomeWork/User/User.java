package HomeWork.User;

public class User {
    private String login;
    private String password;
    private boolean unlocked;
    private int count=3;

    public String getLogin() {
        return login;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public int getCount() {
        return count;
    }

    public int resetCounter(){
        return count = 3;
    }
    public boolean blockUser(){
        return unlocked = false;
    }

}
