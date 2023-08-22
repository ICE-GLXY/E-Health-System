package factory;

import domain.User;

public class userFactory {
    public static User builder(String username, String password, String userType){

        return new User.Builder()
                .username(username)
                .password(password)
                .userType(userType)
                .build();
    }
}
