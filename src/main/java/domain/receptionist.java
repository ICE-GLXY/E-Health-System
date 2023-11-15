package domain;

public class receptionist {

    private String receptionistID;
    private User user;
    private medicalFacility medicalFacility;

    protected receptionist(){
    }

    private receptionist(Builder b){
        this.receptionistID = b.receptionistID;
        this.user = b.user;
        this.medicalFacility = b.medicalFacility;
    }

    public String getReceptionistID() {
        return receptionistID;
    }

    public void setReceptionistID(String receptionistID) {
        this.receptionistID = receptionistID;
    }

    public medicalFacility getMedicalFacility() {
        return medicalFacility;
    }

    public void setMedicalFacility(medicalFacility medicalFacility) {
        this.medicalFacility = medicalFacility;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "receptionist{" +
                "receptionistID='" + receptionistID + '\'' +
                ", medicalFacility=" + medicalFacility +
                ", user=" + user +
                '}';
    }

    public static class Builder{
        private String receptionistID;
        private User user;
        private medicalFacility medicalFacility;

        public Builder receptionistID(String receptionistID){
            this.receptionistID = receptionistID;
            return this;
        }

        public Builder user(User user){
            this.user = user;
            return this;
        }

        public Builder medicalFacility(medicalFacility medicalFacility){
            this.medicalFacility = medicalFacility;
            return this;
        }

        public Builder copy(receptionist e){
            this.receptionistID = e.receptionistID;
            this.user = e.user;
            this.medicalFacility = e.medicalFacility;
            return this;
        }
        public receptionist build(){
            return new receptionist(this);
        }
    }
}
