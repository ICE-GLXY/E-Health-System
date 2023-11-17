package Main.repository;

import Main.domain.receptionist;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IReceptionistRepository extends MongoRepository<receptionist, String> {
//    Optional<receptionist> findReceptionistByid(String receptionistID);

}
