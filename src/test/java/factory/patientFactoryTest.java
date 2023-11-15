package factory;

import domain.User;
import domain.patient;
import domain.patientMedicalInformation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class patientFactoryTest {
    User user3 = new User.Builder().username("user3").name("name3").password("password3").cellPhoneNumber("213213129").email("email3@gmail.com").userType("patient").build();
    User user4 = new User.Builder().username("user4").name("name4").password("password4").cellPhoneNumber("211133331").email("email4@gmail.com").userType("patient").build();

    ArrayList<patient> patients = new ArrayList<>();

    ArrayList<patientMedicalInformation> patientMedicalInformation = new ArrayList<>();

    private final patientMedicalInformation patientMedicalInformation1 = patientMedicalInformationFactory
            .builder("MR12345", "Diabetes Type 2","Metformin 500mg twice daily", "HbA1c: 6.5%",
                    "Eggs", "Insulin", "COVID-19 vaccine (Pfizer)", "Pneumonia in 2016", 2003);

    private final patient patient1 = patientFactory.builder(user3, "ID3", 21, 70, 180, 1, "streetName1", "city1", "province1", patientMedicalInformation1);
    private final patient patient2 = patientFactory.builder(user4, "ID4", 22, 80, 190, 2, "streetName2", "city2", "province2", patientMedicalInformation1);

    @Test
    void builder() {
        patients.add(patient1);
        System.out.println(patients.get(0));
        patients.add(patient2);
        System.out.println(patients.get(1));
        assertNotNull(patients);
    }
}