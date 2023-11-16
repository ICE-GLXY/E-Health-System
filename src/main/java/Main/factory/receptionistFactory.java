package Main.factory;

import Main.domain.User;
import Main.domain.medicalFacility;
import Main.domain.receptionist;

public class receptionistFactory {

    public static receptionist builder(String receptionistID, User user, medicalFacility medicalFacility){

        if(receptionistID.isEmpty())
            throw new IllegalArgumentException("no receptionist ID");
        return  new receptionist.Builder()
                .receptionistID(receptionistID)
                .user(user)
                .medicalFacility(medicalFacility)
                .build();
    }
}
