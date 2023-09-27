package domain;

public class administrator extends User {
    private String administratorID;
    private String managedUsers;

    protected administrator(){
    }

    public String getAdministratorID() {
        return administratorID;
    }

    public administrator setAdministratorID(String administratorID) {
        this.administratorID = administratorID;
        return this;
    }

    public String getManagedUsers() {
        return managedUsers;
    }

    public administrator setManagedUsers(String managedUsers) {
        this.administratorID = administratorID;
        this.managedUsers = managedUsers;
        return this;
    }

    private administrator(Builder b){
        this.administratorID = b.administratorID;
        this.managedUsers = b.managedUsers;
    }


    public administrator(String username, String name, String password, String userType, int cellPhoneNumber, String email) {
        super (username, name, password, userType, cellPhoneNumber, email);
        this.administratorID = administratorID;
        this.managedUsers = managedUsers;
    }

    public static class Builder{
        private String administratorID;
        private String managedUsers;

        public Builder administratorID(String administratorID) {
            this.administratorID = administratorID;
            return this;
        }
        public Builder managedUsers(String managedUsers) {
            this.managedUsers = managedUsers;
            return this;
        }

        public Builder copy(administrator e){
            this.administratorID = e.administratorID;
            this.managedUsers = e.managedUsers;
            return this;
        }

        public administrator build(){
            return new administrator(this);
        }
    }
}

