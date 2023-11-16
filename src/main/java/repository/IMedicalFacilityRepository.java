package repository;

import domain.medicalFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalFacilityRepository extends JpaRepository<medicalFacility, String> {
}
