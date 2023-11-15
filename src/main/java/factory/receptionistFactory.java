package factory;

import domain.User;
import domain.medicalFacility;
import domain.receptionist;

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
