package factory;

import domain.User;
import domain.doctor;
import domain.medicalFacility;

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
