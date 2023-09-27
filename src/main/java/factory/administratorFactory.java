package factory;

import domain.administrator;
import domain.doctor;

public class administratorFactory {
    public static administrator builder(String administratorID,String managedUsers){

        if(administratorID.isEmpty())
            throw new IllegalArgumentException("no administrator ID");
        return new administrator.Builder()
                .administratorID(administratorID)
                .build();
    }
}
