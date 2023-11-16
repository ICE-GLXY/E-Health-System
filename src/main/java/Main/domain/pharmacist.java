package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.validation.constraints.NotNull;

@Document(collection = "Pharmacist")
@Data
@AllArgsConstructor
//@Entity
public class pharmacist {
    @Id
//    @NotNull
    private String pharmacistID;
//    @NotNull
//    @OneToOne
    private medicalFacility medicalFacility;
//    @NotNull
//    @OneToOne
    private User user;

    protected pharmacist(){

    }
    private pharmacist(Builder b){
        this.user = b.user;
        this.medicalFacility = b.medicalFacility;
        this.pharmacistID = b.pharmacistID;
    }

    public String getPharmacistID() {
        return pharmacistID;
    }

    public void setPharmacistID(String pharmacistID) {
        this.pharmacistID = pharmacistID;
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
        return "pharmacist{" +
                "pharmacistID='" + pharmacistID + '\'' +
                ", medicalFacility=" + medicalFacility +
                ", user=" + user +
                '}';
    }

    public static class Builder {
        private String pharmacistID;
        private User user;
        private medicalFacility medicalFacility;


        public Builder pharmacistID(String pharmacistID) {
            this.pharmacistID = pharmacistID;
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

        public Builder copy(pharmacist e){
            this.pharmacistID = e.pharmacistID;
            this.user = e.user;
            this.medicalFacility = e.medicalFacility;
            return this;
        }
        public pharmacist build(){
            return new pharmacist(this);
        }
    }
}
