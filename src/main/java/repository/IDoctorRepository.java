package repository;
import domain.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends JpaRepository<doctor, String> {
}
