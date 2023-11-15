package repository;

import domain.patientMedicalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientMedicalInformationRepository extends JpaRepository<patientMedicalInformation, String> {
}
