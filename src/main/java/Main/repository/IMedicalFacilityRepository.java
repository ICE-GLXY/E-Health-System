package Main.repository;

import Main.domain.medicalFacility;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalFacilityRepository extends MongoRepository<medicalFacility, String> {
}
