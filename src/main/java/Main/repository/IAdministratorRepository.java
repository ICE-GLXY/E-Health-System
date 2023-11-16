package Main.repository;

import Main.domain.administrator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministratorRepository extends MongoRepository<administrator, String> {
}
