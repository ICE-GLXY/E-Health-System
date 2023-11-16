package service.impl;

import Main.domain.User;
import Main.domain.medicalFacility;
import Main.domain.receptionist;
import Main.factory.receptionistFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import Main.repository.IReceptionistRepository;
import Main.service.IReceptionistService;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class receptionistServiceImplTest {

    //@Autowired
    @Mock
    private IReceptionistRepository repository;


    IReceptionistService receptionistService;

    //user test data
    User user7 = new User.Builder().username("user7").name("name7").password("password7").cellPhoneNumber("985234124").email("email7@gmail.com").userType("receptionist").build();


    //medical facility test data
    medicalFacility medicalFacility1 = new medicalFacility.Builder().medicalFacilityID("FacilityID1").name("medicalFacility1").streetNumber(1).streetName("street1").city("city1").province("province1").email("email1").phoneNumber("213213132").type("Hospital").build();


    private  receptionist Receptionist = receptionistFactory.builder("R001", user7, medicalFacility1);

    @Order(1)
    @Test
    void save() {
        /*  Receptionist = new receptionist.Builder()
                  .receptionistID("R001")
                  .user(user7)
                  .medicalFacility(medicalFacility1)
                  .build();*/


        System.out.println("a" + Receptionist);
        repository.save(Receptionist);
        System.out.println("b" +Receptionist);


        assertAll(
                () -> assertNotNull(Receptionist.getReceptionistID()),
                () -> assertNotNull(Receptionist.getUser()),
                () -> assertNotNull(Receptionist.getMedicalFacility())

                );

    }

    @Order(2)
    @Test
    void read() {
        repository.findReceptionistById(Receptionist.getReceptionistID());

        assertAll(
                () -> assertNotNull(Receptionist.getReceptionistID())

        );
        System.out.println(Receptionist.toString());

    }

    @Order(4)
    @Test
    void delete() {
        repository.deleteById(Receptionist.getReceptionistID());

        assertAll(
                () -> assertNotNull(Receptionist.getReceptionistID())
        );

        System.out.println("Receptionist successfully deleted");
        System.out.println(Receptionist);

    }

    @Order(3)
    @Test
    void readAll() {
            System.out.println(repository.findAll());

    }
}