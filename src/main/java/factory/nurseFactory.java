package factory;

import domain.nurse;
import domain.patient;

public class nurseFactory {

    public static nurse builder(String nurseID){

        if(nurseID.isEmpty())
            throw new IllegalArgumentException("no nurse ID");
        return new nurse.Builder()
                .nurseID(nurseID)
                .build();
    }
}
