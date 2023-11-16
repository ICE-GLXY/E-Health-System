package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@Document(collection = "MedicalFacility")
@Data
@AllArgsConstructor
//@Entity
public class medicalFacility {
//    @Id
//    @NotNull
    private String medicalFacilityID;
//    @NotNull
    private String name;
//    @NotNull
    private int streetNumber;
//    @NotNull
    private String streetName;
//    @NotNull
    private String city;
//    @NotNull
    private String province;
//    @NotNull
    private String email;
//    @NotNull
    private String phoneNumber;
//    @NotNull
    private String type;


    protected medicalFacility(){
    }

    private medicalFacility(Builder b){
        this.medicalFacilityID = b.medicalFacilityID;
        this.name = b.name;
        this.streetNumber = b.streetNumber;
        this.streetName = b.streetName;
        this.city = b.city;
        this.province = b.province;
        this.email = b.email;
        this.phoneNumber = b.phoneNumber;
        this.type = b.type;
    }

    public String getMedicalFacilityID() {
        return medicalFacilityID;
    }

    public medicalFacility setMedicalFacilityID(String medicalFacilityID) {
        this.medicalFacilityID = medicalFacilityID;
        return this;
    }

    public String getName() {
        return name;
    }

    public medicalFacility setName(String name) {
        this.name = name;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public medicalFacility setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public medicalFacility setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getCity() {
        return city;
    }

    public medicalFacility setCity(String city) {
        this.city = city;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public medicalFacility setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public medicalFacility setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public medicalFacility setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public medicalFacility setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "medicalFacility{" +
                "medicalFacilityID='" + medicalFacilityID + '\'' +
                ", name='" + name + '\'' +
                ", streetNumber=" + streetNumber + '\'' +
                ", streetName=" + streetName + '\'' +
                ", city=" + city + '\'' +
                ", province=" + province + '\'' +
                ", email=" + email + '\'' +
                ", phoneNumber=" + phoneNumber + '\'' +
                ", type=" + type +
                '}';
    }

    public static class Builder{
        private String medicalFacilityID;
        private String name;
        private int streetNumber;
        private String streetName;
        private String city;
        private String province;

        private String email;
        private String phoneNumber;

        private String type;

        public Builder medicalFacilityID(String medicalFacilityID) {
            this.medicalFacilityID = medicalFacilityID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder streetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder province(String province) {
            this.province = province;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder copy(medicalFacility e){
            this.medicalFacilityID = e.medicalFacilityID;
            this.name = e.name;
            this.streetNumber = e.streetNumber;
            this.streetName = e.streetName;
            this.city = e.city;
            this.province = e.province;
            this.email = e.email;
            this.phoneNumber = e.phoneNumber;
            this.type = e.type;
            return this;
        }

        public medicalFacility build(){
            return new medicalFacility(this);
        }
    }
}
