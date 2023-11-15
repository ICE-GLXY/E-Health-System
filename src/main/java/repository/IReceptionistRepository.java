package repository;

import domain.receptionist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IReceptionistRepository extends JpaRepository<receptionist, String> {

}
