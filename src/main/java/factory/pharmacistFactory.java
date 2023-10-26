package factory;

import domain.User;
import domain.medicalFacility;
import domain.pharmacist;

public class pharmacistFactory {

    public static pharmacist builder(String pharmacistID, medicalFacility medicalFacility, User user){

        if(pharmacistID.isEmpty())
            throw new IllegalArgumentException("no pharmacist ID");
        return new pharmacist.Builder()
                .pharmacistID(pharmacistID)
                .medicalFacility(medicalFacility)
                .user(user)
                .build();
    }
}
