package factory;

import domain.doctor;

public class doctorFactory {
    public static doctor builder(String doctorID){

        if(doctorID.isEmpty())
            throw new IllegalArgumentException("no doctor ID");
        return new doctor.Builder()
                .doctorID(doctorID)
                .build();
    }
}
