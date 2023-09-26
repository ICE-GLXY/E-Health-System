package domain;

public class nurse extends User{
    private String nurseID;

    protected nurse(){
    }

    private nurse(Builder b){
        this.nurseID = b.nurseID;
    }

    public String getNurseID() {
        return nurseID;
    }

    public nurse setNurseID(String nurseID) {
        this.nurseID = nurseID;
        return this;
    }

    public nurse(String username, String name, String password, String userType, int cellPhoneNumber, String email) {
        super (username, name, password, userType, cellPhoneNumber, email);
          this.nurseID = nurseID;
    }

    public static class Builder{
        private String nurseID;

        public Builder nurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder copy(nurse e){
            this.nurseID = e.nurseID;
            return this;
        }

        public nurse build(){
            return new nurse(this);
        }
    }
}
