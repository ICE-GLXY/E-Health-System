package Main.repository;

import Main.domain.pharmacist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPharmacistRepository extends MongoRepository<pharmacist, String> {
}
