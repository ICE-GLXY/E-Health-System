package factory;

import domain.patientMedicalInformation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class patientMedicalInformationFactoryTest {

    ArrayList<patientMedicalInformation> PatientMedicalInformation = new ArrayList<>();

    private final patientMedicalInformation patientMedicalInformation1 = patientMedicalInformationFactory
            .builder("MR12345", "Diabetes Type 2","Metformin 500mg twice daily", "HbA1c: 6.5%",
                    "Eggs", "Insulin", "COVID-19 vaccine (Pfizer)", "Pneumonia in 2016", 2003);

    private final patientMedicalInformation patientMedicalInformation2 = patientMedicalInformationFactory
            .builder("MR67891", "Hypertension","Lisinopril 10mg daily", "Blood Pressure: 120/80 mmHg",
                    "Shellfish", "Lisinopril", "Flu vaccine (2023)", "Fractured leg in 2018", 2004);

    @Test
    void builder() {

        PatientMedicalInformation.add(patientMedicalInformation1);
        System.out.println(PatientMedicalInformation.get(0));
        PatientMedicalInformation.add(patientMedicalInformation2);
        System.out.println(PatientMedicalInformation.get(1));
        assertNotNull(PatientMedicalInformation);

    }
}