package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
//import javax.validation.constraints.NotNull;

@Document(collection = "Receptionist")
@Data
@AllArgsConstructor
//@NoArgsConstructor
//@Entity
public class receptionist {
//    @Id
//    private ObjectId id;
//    @NotNull
    @Id
    private String receptionistID;
//    @OneToOne
    private User user;
//    @OneToOne
    private medicalFacility medicalFacility;

    protected receptionist(){
    }

    private receptionist(Builder b){
//        this.id = b.id;
        this.receptionistID = b.receptionistID;
        this.user = b.user;
        this.medicalFacility = b.medicalFacility;
    }

//    public ObjectId getId() {
//        return id;
//    }
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

//    public void setId(ObjectId id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "receptionist{" +
//                "id=" + id +
                "receptionistID='" + receptionistID + '\'' +
                ", medicalFacility=" + medicalFacility +
                ", user=" + user +
                '}';
    }

    public static class Builder{
        private ObjectId id;
        private String receptionistID;
        private User user;
        private medicalFacility medicalFacility;

        public Builder id(ObjectId id){
            this.id = id;
            return this;
        }

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
//            this.id = e.id;
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
