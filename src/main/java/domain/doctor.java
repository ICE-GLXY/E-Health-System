package domain;

public class doctor
{
    private String doctorID;
    private medicalFacility medicalFacility;
    private User user;

    protected doctor(){
    }

    private doctor(Builder b){
        this.user = b.user;
        this.medicalFacility = b.medicalFacility;
        this.doctorID = b.doctorID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public doctor setDoctorID(String doctorID) {
        this.doctorID = doctorID;
        return this;
    }

    public medicalFacility getMedicalFacility() {
        return medicalFacility;
    }

    public doctor setMedicalFacility(medicalFacility medicalFacility) {
        this.medicalFacility = medicalFacility;
        return this;
    }

    public User getUser() {
        return user;
    }

    public doctor setUser(User user) {
        this.user = user;
        return this;
    }

    public static class Builder{
        private String doctorID;
        private medicalFacility medicalFacility;
        private User user;

        public Builder user(User user) {
            this.user = user;
            return this;
        }
        public Builder medicalFacility(medicalFacility medicalFacility) {
            this.medicalFacility = medicalFacility;
            return this;
        }
        public Builder doctorID(String doctorID) {
            this.doctorID = doctorID;
            return this;
        }

        public Builder copy(doctor e){
            this.doctorID = e.doctorID;
            this.medicalFacility = e.medicalFacility;
            this.user = e.user;
            return this;
        }

        public doctor build(){
            return new doctor(this);
        }
    }
}
