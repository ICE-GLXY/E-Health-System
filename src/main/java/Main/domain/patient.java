package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.validation.constraints.NotNull;

@Document(collection = "Patient")
@Data
@AllArgsConstructor
//@Entity
public class patient
{
//    @OneToOne
//    @NotNull
    private User user;
    @Id
//    @NotNull
    private String patientID;
//    @NotNull
        private int age;
//    @NotNull
        private int weight;
//    @NotNull
        private int height;
//    @NotNull
    private int streetNumber;
//    @NotNull
    private String streetName;
//    @NotNull
    private String city;
//    @NotNull
    private String province;
//    @NotNull
//    @OneToOne
    private patientMedicalInformation patientMedicalInformation;

        protected patient(){
        }

        private patient(Builder b){
            this.user = b.user;
            this.patientID = b.patientID;
            this.age = b.age;
            this.weight = b.weight;
            this.height = b.height;
            this.streetNumber = b.streetNumber;
            this.streetName = b.streetName;
            this.city = b.city;
            this.province = b.province;
            this.patientMedicalInformation = b.patientMedicalInformation;
        }

    public User getUser() {
        return user;
    }

    public patient setUser(User user) {
        this.user = user;
        return this;
    }

    public String getPatientID() {
        return patientID;
    }

    public patient setPatientID(String patientID) {
        this.patientID = patientID;
        return this;
    }
    public int getAge() {
        return age;
    }

    public patient setAge(int age) {
        this.age = age;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public patient setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public patient setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public patient setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public String getStreetName() {
        return streetName;
    }

    public patient setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public String getCity() {
        return city;
    }

    public patient setCity(String city) {
        this.city = city;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public patient setProvince(String province) {
        this.province = province;
        return this;
    }

    public patientMedicalInformation getPatientMedicalInformation() {
        return patientMedicalInformation;
    }

    public patient setPatientMedicalInformation(patientMedicalInformation patientMedicalInformation) {
        this.patientMedicalInformation = patientMedicalInformation;
        return this;
    }

    @Override
    public String toString() {
        return "patient{" +
                "patientID='" + patientID + '\'' +
                ", user=" + user + '\'' +
                ", age=" + age + '\'' +
                ", weight=" + weight + '\'' +
                ", height=" + height + '\'' +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", patientMedicalInformation=" + patientMedicalInformation + '\'' +
                '}';
    }


        public static class Builder{
            private User user;
            private String patientID;
            private int age;
            private int weight;
            private int height;
            private int streetNumber;
            private String streetName;
            private String city;
            private String province;
            private patientMedicalInformation patientMedicalInformation;

            public Builder user(User user) {
                this.user = user;
                return this;
            }
            public Builder patientID(String patientID) {
                this.patientID = patientID;
                return this;
            }

            public Builder age(int age) {
                this.age = age;
                return this;
            }
            public Builder weight(int weight) {
                this.weight = weight;
                return this;
            }
            public Builder height(int height) {
                this.height = height;
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
            public Builder patientMedicalInformation(patientMedicalInformation patientMedicalInformation) {
                this.patientMedicalInformation = patientMedicalInformation;
                return this;
            }
            public Builder copy(patient e){
                this.user = e.user;
                this.patientID = e.patientID;
                this.age = e.age;
                this.weight = e.weight;
                this.height = e.height;
                this.streetNumber = e.streetNumber;
                this.streetName = e.streetName;
                this.city = e.city;
                this.province = e.province;
                this.patientMedicalInformation = e.patientMedicalInformation;
                return this;
            }

            public patient build(){
                return new patient(this);
            }
        }
}
