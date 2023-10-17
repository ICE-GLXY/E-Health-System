package factory;

import domain.User;
import domain.medicalFacility;
import domain.nurse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class nurseFactoryTest {
    User user5 = new User.Builder().username("user5").name("name5").password("password5").cellPhoneNumber(324234244).email("email5@gmail.com").userType("nurse").build();
    User user6 = new User.Builder().username("user6").name("name6").password("password6").cellPhoneNumber(233522222).email("email6@gmail.com").userType("nurse").build();

    medicalFacility medicalFacility1 = new medicalFacility.Builder().medicalFacilityID("FacilityID1").name("medicalFacility1").streetNumber(1).streetName("street1").city("city1").province("province1").email("email1").phoneNumber(213213132).type("Hospital").build();
    ArrayList<nurse> nurses = new ArrayList<>();
    private final nurse nurse1 = nurseFactory.builder(user5, medicalFacility1, "ID5");
    private final nurse nurse2 = nurseFactory.builder(user6, medicalFacility1, "ID6");

    @Test
    void builder() {
        nurses.add(nurse1);
        System.out.println(nurses.get(0));
        nurses.add(nurse2);
        System.out.println(nurses.get(1));
        assertNotNull(nurses);
    }
}
