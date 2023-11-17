package factory;

import Main.factory.pharmacistFactory;
import Main.domain.User;
import Main.domain.medicalFacility;
import Main.domain.pharmacist;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class pharmacistFactoryTest {

    //user test data
    User user9 = new User.Builder().username("user9").name("name9").password("password9").cellPhoneNumber("698448124").email("email9@gmail.com").userType("pharmacist").build();

    User user10 = new User.Builder().username("user8").name("name8").password("password8").cellPhoneNumber("985812622").email("email10@gmail.com").userType("pharmacist").build();

    //medical facility test data
    medicalFacility medicalFacility2 = new medicalFacility.Builder().medicalFacilityID("FacilityID2").name("medicalFacility1").streetNumber(1).streetName("street1").city("city1").province("province1").email("email1").phoneNumber("213213132").type("Pharmacy").build();

    ArrayList<pharmacist> Pharmacist = new ArrayList<>();

    private final pharmacist pharmacist1 = pharmacistFactory.builder("ID002",medicalFacility2, user9);

    private final pharmacist pharmacist2 = pharmacistFactory.builder("ID003",medicalFacility2, user10);
    @Test
    void builder() {

        Pharmacist.add(pharmacist1);
        System.out.println(Pharmacist.get(0));
        Pharmacist.add(pharmacist2);
        System.out.println(Pharmacist.get(1));
        assertNotNull(Pharmacist);

    }
}