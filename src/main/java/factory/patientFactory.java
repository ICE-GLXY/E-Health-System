package factory;

import domain.User;
import domain.patient;

public class patientFactory {

    public static patient builder(String patientID, int age, int weight, int height, int streetNumber, String streetName, String city, String province){

        if(patientID.isEmpty())
            throw new IllegalArgumentException("no patient ID");
        return new patient.Builder()
                .patientID(patientID)
                .age(age)
                .weight(weight)
                .height(height)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .city(city)
                .province(province)
                .build();
    }
}
