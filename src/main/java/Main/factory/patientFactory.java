package Main.factory;

import Main.domain.User;
import Main.domain.patient;
import Main.domain.patientMedicalInformation;

public class patientFactory {

    public static patient builder(User user, String patientID, String IdNumber, int age, int weight, int height, int streetNumber, String streetName, String city, String province, patientMedicalInformation patientMedicalInformation){

        if(patientID.isEmpty())
            throw new IllegalArgumentException("no patient ID");
        return new patient.Builder()
                .user(user)
                .patientID(patientID)
                .IdNumber(IdNumber)
                .age(age)
                .weight(weight)
                .height(height)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .city(city)
                .province(province)
                .patientMedicalInformation(patientMedicalInformation)
                .build();
    }
}
