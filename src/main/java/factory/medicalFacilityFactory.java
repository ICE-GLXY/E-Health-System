package factory;

import domain.User;
import domain.medicalFacility;

public class medicalFacilityFactory {
    public static medicalFacility builder(String medicalFacilityID, String name, int streetNumber, String streetName, String city, String province, String email, String phoneNumber, String type){

        return new medicalFacility.Builder()
                .medicalFacilityID(medicalFacilityID)
                .name(name)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .city(city)
                .province(province)
                .email(email)
                .phoneNumber(phoneNumber)
                .type(type)
                .build();
    }
}