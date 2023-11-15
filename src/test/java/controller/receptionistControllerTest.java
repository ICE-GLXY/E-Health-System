package controller;

import domain.User;
import domain.medicalFacility;
import domain.receptionist;
import factory.receptionistFactory;
import org.apache.coyote.Response;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class receptionistControllerTest {

    @LocalServerPort
    int port;


    @Autowired
/*
    private receptionistController controller;
*/

    private TestRestTemplate restTemplate;

    private receptionist receptionist;

    private String baseUrl;

    //medical facility test data
    medicalFacility medicalFacility1 = new medicalFacility.Builder().medicalFacilityID("FacilityID1").name("medicalFacility1").streetNumber(1).streetName("street1").city("city1").province("province1").email("email1").phoneNumber("213213132").type("Hospital").build();

    //user test data
    User user7 = new User.Builder().username("user7").name("name7").password("password7").cellPhoneNumber("985234124").email("email7@gmail.com").userType("receptionist").build();


    @BeforeEach
    void set(){
        this.receptionist = receptionistFactory.builder("R001",user7,medicalFacility1);
        this.baseUrl = "http://localhost:" + this.port + "/E-Health-System/receptionist/";
    }

    @Order(1)
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<receptionist> response = this.restTemplate
                .postForEntity(url,this.receptionist, receptionist.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Order(2)
    @Test
    void read() {
        String url = baseUrl + "read/" + this.receptionist.getReceptionistID();
        System.out.println(url);
        ResponseEntity<receptionist>response=
                this.restTemplate.getForEntity(url,receptionist.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }

    @Order(4)
    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.receptionist.getReceptionistID();
        System.out.println(url);
       //Error below
       //  this.restTemplate.delete(url,controller.delete(url));
    }

    @Order(3)
    @Test
    void findAll() {
        String url = baseUrl + "all";
        System.out.println(url);
        ResponseEntity<receptionist[]>response =
                this.restTemplate.getForEntity(url,receptionist[].class);
        System.out.println(Arrays.asList(response.getBody()));
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())
        );
    }
}