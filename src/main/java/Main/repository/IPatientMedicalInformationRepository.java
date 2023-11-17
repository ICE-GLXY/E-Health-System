package Main.repository;

import Main.domain.patientMedicalInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientMedicalInformationRepository extends MongoRepository<patientMedicalInformation, String> {
}
