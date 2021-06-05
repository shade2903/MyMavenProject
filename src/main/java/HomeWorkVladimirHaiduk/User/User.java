package HomeWorkVladimirHaiduk.User;

public class User {
    private String login;
    private String password;
    private boolean unlocked;
    private int count;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.unlocked = true;
        this.count = 3;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUnlocked(boolean unlocked) {this.unlocked = unlocked;}

    public String getPassword() {
        return password;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public int getCount() {
        return count;
    }

    public int resetCount() {return count = 3;}

    public boolean blockUser() {return unlocked = false;}

}
