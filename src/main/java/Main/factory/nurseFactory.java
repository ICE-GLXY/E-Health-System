package Main.factory;

import Main.domain.User;
import Main.domain.medicalFacility;
import Main.domain.nurse;

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
