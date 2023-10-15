package factory;

import domain.User;
import domain.medicalFacility;
import domain.nurse;
import domain.patient;

public class nurseFactory {

    public static nurse builder(User user, medicalFacility medicalFacility, String nurseID){

        if(nurseID.isEmpty())
            throw new IllegalArgumentException("no nurse ID");
        return new nurse.Builder()
                .user(user)
                .medicalFacility(medicalFacility)
                .nurseID(nurseID)
                .build();
    }
}
