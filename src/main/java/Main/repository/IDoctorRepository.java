package Main.repository;
import Main.domain.doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends MongoRepository<doctor, String> {
}
