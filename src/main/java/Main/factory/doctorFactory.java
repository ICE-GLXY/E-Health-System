package Main.factory;

import Main.domain.User;
import Main.domain.doctor;
import Main.domain.medicalFacility;

public class doctorFactory {
    public static doctor builder(medicalFacility medicalFacility, User user, String doctorID){

        if(doctorID.isEmpty())
            throw new IllegalArgumentException("no doctor ID");
        return new doctor.Builder()
                .user(user)
                .medicalFacility(medicalFacility)
                .doctorID(doctorID)
                .build();
    }
}
