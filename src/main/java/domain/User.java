package domain;

import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class User {
        private String username;
        private String password;
        private String userType;

        protected User(){
        }

        private User(Builder b){
            this.username = b.username;
            this.password = b.password;
            this.userType = b.userType;
        }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public static class Builder{
            private String username;
            private String password;
            private String userType;


            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public Builder userType(String userType){
                this.userType = userType;
                return this;
            }

            public Builder copy(User e){
                this.username = e.username;
                this.password = e.password;
                this.userType = e.userType;
                return this;
            }

            public User build(){
                return new User(this);
            }
        }
}
