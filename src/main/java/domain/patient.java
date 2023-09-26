package domain;

public class patient extends User
{
    private String patientID;
        private int age;
        private int weight;
        private int height;
    private int streetNumber;
    private String streetName;
    private String city;
    private String province;

        protected patient(){
        }

        private patient(Builder b){
            this.patientID = b.patientID;
            this.age = b.age;
            this.weight = b.weight;
            this.height = b.height;
            this.streetNumber = b.streetNumber;
            this.streetName = b.streetName;
            this.city = b.city;
            this.province = b.province;
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

    public patient(String username, String name, String password, String userType, int cellPhoneNumber, String email) {
            super (username, name, password, userType, cellPhoneNumber, email);
            this.patientID = patientID;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.city = city;
            this.province = province;
        }

        public static class Builder{
            private String patientID;
            private int age;
            private int weight;
            private int height;
            private int streetNumber;
            private String streetName;
            private String city;
            private String province;


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
            public Builder copy(patient e){
                this.patientID = e.patientID;
                this.age = e.age;
                this.weight = e.weight;
                this.height = e.height;
                this.streetNumber = e.streetNumber;
                this.streetName = e.streetName;
                this.city = e.city;
                this.province = e.province;
                return this;
            }

            public patient build(){
                return new patient(this);
            }
        }
}
