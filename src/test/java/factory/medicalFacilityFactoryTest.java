package factory;

import domain.medicalFacility;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class medicalFacilityFactoryTest {
ArrayList<medicalFacility> medicalFacilities = new ArrayList<>();
    private final medicalFacility medicalFacility1 = medicalFacilityFactory.builder("FacilityID1", "medicalFacility1", 1, "street1", "city1", "province1", "email1", 213213132, "Hospital");
    private final medicalFacility medicalFacility2 = medicalFacilityFactory.builder("FacilityID2", "medicalFacility2", 2, "street2", "city2", "province2", "email2", 213213133, "Hospital");
    @Test
    void builder() {
        medicalFacilities.add(medicalFacility1);
        System.out.println(medicalFacilities.get(0));
        medicalFacilities.add(medicalFacility2);
        System.out.println(medicalFacilities.get(1));
        assertNotNull(medicalFacilities);
    }
}