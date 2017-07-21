package learning.groundgurus;

/**
 * Created by User on 7/21/2017.
 */

public class UserModel {

    String user_email;
    String user_name;

    public UserModel(String user_email, String user_name) {
        this.user_email = user_email;
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_name() {
        return user_name;
    }
}
