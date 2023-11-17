package Main.repository;

import Main.domain.patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends MongoRepository<patient, String> {
}
