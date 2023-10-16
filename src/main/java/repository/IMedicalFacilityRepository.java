package repository;

import domain.medicalFacility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicalFacilityRepository extends JpaRepository<medicalFacility, String> {
}
