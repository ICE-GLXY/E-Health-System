package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
@Document(collection = "user")
@Data
@AllArgsConstructor
//@Entity
public class User {
    @Id
        public String username;
//    @NotNull
        public String name;
        public String surname;
//    @NotNull
        public String password;
//    @NotNull
        public String cellPhoneNumber;
//    @NotNull
        public String email;
//    @NotNull
        public String userType;

        protected User(){
        }

        private User(Builder b){
            this.username = b.username;
            this.name = b.name;
            this.surname = b.surname;
            this.password = b.password;
            this.cellPhoneNumber = b.cellPhoneNumber;
            this.email = b.email;
            this.userType = b.userType;
        }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
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
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password=" + password + '\'' +
                ", cellPhoneNumber=" + cellPhoneNumber + '\'' +
                ", email=" + email + '\'' +
                ", userType=" + userType +
                '}';
    }

    public static class Builder{
            private String name;
            private String surname;
            private String username;
            private String password;
            private String cellPhoneNumber;
            private String email;
            private String userType;


            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Builder name(String name) {
                this.name = name;
                return this;
            }
            public Builder surname(String surname) {
                this.surname = surname;
                return this;
            }
            public Builder password(String password) {
                this.password = password;
                return this;
            }

        public Builder cellPhoneNumber(String cellPhoneNumber){
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

            public Builder userType(String userType){
                this.userType = userType;
                return this;
            }

            public Builder copy(User e){
                this.name = e.name;
                this.surname = e.surname;
                this.username = e.username;
                this.password = e.password;
                this.cellPhoneNumber = e.cellPhoneNumber;
                this.email = e.email;
                this.userType = e.userType;
                return this;
            }

            public User build(){
                return new User(this);
            }
        }
}
