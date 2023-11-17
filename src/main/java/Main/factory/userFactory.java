package Main.factory;

import Main.domain.User;

public class userFactory {
    private static final String validation = "^(.+)@(.+)$";
    public static User builder(String username, String name, String password, String userType, String cellPhoneNumber, String email){

        if(!email.matches(validation))
            throw new IllegalArgumentException("Invalid email");
        return new User.Builder()
                .username(username)
                .name(name)
                .password(password)
                .userType(userType)
                .cellPhoneNumber(cellPhoneNumber)
                .email(email)
                .build();
    }
}