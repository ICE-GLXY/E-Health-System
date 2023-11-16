package repository;

import domain.patientMedicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientMedicalInformationRepository extends JpaRepository<patientMedicalInformation, String> {
}
