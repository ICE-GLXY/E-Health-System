package domain;

public class administrator extends User {
    private String name;
    private String managedUsers;

    protected administrator(){
    }

    public String getName() {
        return name;
    }

    public administrator setName(String name) {
        this.name = name;
        return this;
    }

    public String getManagedUsers() {
        return managedUsers;
    }

    public administrator setManagedUsers(String managedUsers) {
        this.managedUsers = managedUsers;
        return this;
    }

    private administrator(Builder b){
        this.name = b.name;
        this.managedUsers = b.managedUsers;
    }


    public administrator(String username, String password, String userType, int cellPhoneNumber, String email, String name, String managedUsers) {
        super (username, password, userType, cellPhoneNumber, email);
        this.name = name;
        this.password = managedUsers;
    }

    public static class Builder{
        private String name;
        private String managedUsers;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder managedUsers(String managedUsers) {
            this.managedUsers = managedUsers;
            return this;
        }

        public Builder copy(administrator e){
            this.name = e.name;
            this.managedUsers = e.managedUsers;
            return this;
        }

        public administrator build(){
            return new administrator(this);
        }
    }
}

