package domain;

public class User {
        public String username;
        public String name;
        public String password;
        public int cellPhoneNumber;
        public String email;
        public String userType;

        protected User(){
        }

        private User(Builder b){
            this.username = b.username;
            this.name = b.name;
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

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setCellPhoneNumber(int cellPhoneNumber) {
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

    public User(String username, String name, String password, String userType, int cellPhoneNumber, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        this.email = email;
        this.userType = userType;
    }

    public static class Builder{
            private String name;
            private String username;
            private String password;
            private int cellPhoneNumber;
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
            public Builder password(String password) {
                this.password = password;
                return this;
            }

        public Builder cellPhoneNumber(int cellPhoneNumber){
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
