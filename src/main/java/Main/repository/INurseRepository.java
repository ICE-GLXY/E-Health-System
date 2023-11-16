package Main.repository;

import Main.domain.nurse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INurseRepository extends MongoRepository<nurse, String> {
}
