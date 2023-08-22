package domain;

public class administrator extends User {
    public administrator(String username, String password, String userType) {
        super(username, password, userType);
    }

    public void createAccount(String userType, String username, String password) {
        // Code to create an account for the specified user type
    }

    public void updateInformation(String userType, String username, String updatedInfo) {
        // Code to update user information
    }

    public void deleteAccount(String username) {
        // Code to delete a user account
    }

    public void viewInformation(String userType, String username) {
        // Code to view user information
    }
}
