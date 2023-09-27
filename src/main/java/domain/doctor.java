package domain;

public class doctor extends User
{
    private String doctorID;

    protected doctor(){
    }

    private doctor(Builder b){
        this.doctorID = b.doctorID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public doctor setDoctorID(String doctorID) {
        this.doctorID = doctorID;
        return this;
    }

    public doctor(String username, String name, String password, String userType, int cellPhoneNumber, String email) {
        super (username, name, password, userType, cellPhoneNumber, email);
        this.doctorID = doctorID;
    }

    public static class Builder{
        private String doctorID;

        public Builder doctorID(String doctorID) {
            this.doctorID = doctorID;
            return this;
        }

        public Builder copy(doctor e){
            this.doctorID = e.doctorID;
            return this;
        }

        public doctor build(){
            return new doctor(this);
        }
    }
}
