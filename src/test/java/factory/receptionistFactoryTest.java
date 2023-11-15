package factory;

import domain.User;
import domain.medicalFacility;
import domain.receptionist;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class receptionistFactoryTest {

    //user test data
    User user7 = new User.Builder().username("user7").name("name7").password("password7").cellPhoneNumber("985234124").email("email7@gmail.com").userType("receptionist").build();
    User user8 = new User.Builder().username("user8").name("name8").password("password8").cellPhoneNumber("265812622").email("email8@gmail.com").userType("receptionist").build();

    //medical facility test data
    medicalFacility medicalFacility1 = new medicalFacility.Builder().medicalFacilityID("FacilityID1").name("medicalFacility1").streetNumber(1).streetName("street1").city("city1").province("province1").email("email1").phoneNumber("213213132").type("Hospital").build();

    ArrayList<receptionist> Receptionist = new ArrayList<>();

    private final receptionist receptionist1 = receptionistFactory.builder("ID001", user7, medicalFacility1);

    private final receptionist receptionist2 = receptionistFactory.builder("ID002", user8, medicalFacility1);

    @Test
    void builder() {

        Receptionist.add(receptionist1);
        System.out.println(Receptionist.get(0));
        Receptionist.add(receptionist2);
        System.out.println(Receptionist.get(1));
        assertNotNull(Receptionist);

    }
}