package repository;

import domain.receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IReceptionistRepository extends JpaRepository<receptionist, String> {

}
