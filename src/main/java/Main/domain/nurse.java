package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.validation.constraints.NotNull;

@Document(collection = "Nurse")
@Data
@AllArgsConstructor
//@Entity
public class nurse{
//    @Id
//    @NotNull
    private String nurseID;
//    @OneToOne
//    @NotNull
    private User user;
//    @OneToOne
//    @NotNull
    private medicalFacility medicalFacility;

    protected nurse(){
    }

    private nurse(Builder b){
        this.nurseID = b.nurseID;
        this.user = b.user;
        this.medicalFacility = b.medicalFacility;
    }

    public User getUser() {
        return user;
    }

    public nurse setUser(User user) {
        this.user = user;
        return this;
    }

    public medicalFacility getMedicalFacility() {
        return medicalFacility;
    }

    public nurse setMedicalFacility(medicalFacility medicalFacility) {
        this.medicalFacility = medicalFacility;
        return this;
    }

    public String getNurseID() {
        return nurseID;
    }

    public nurse setNurseID(String nurseID) {
        this.nurseID = nurseID;
        return this;
    }

    @Override
    public String toString() {
        return "nurse{" +
                "nurseID='" + nurseID + '\'' +
                ", user=" + user +
                ", medicalFacility=" + medicalFacility +
                '}';
    }

    public static class Builder{
        private String nurseID;
        private User user;
        private medicalFacility medicalFacility;

        public Builder user(User user) {
            this.user = user;
            return this;
        }
        public Builder medicalFacility(medicalFacility medicalFacility) {
            this.medicalFacility = medicalFacility;
            return this;
        }
        public Builder nurseID(String nurseID) {
            this.nurseID = nurseID;
            return this;
        }

        public Builder copy(nurse e){
            this.nurseID = e.nurseID;
            this.user = e.user;
            this.medicalFacility = e.medicalFacility;
            return this;
        }

        public nurse build(){
            return new nurse(this);
        }
    }
}
