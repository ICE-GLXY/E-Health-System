package repository;

import domain.receptionist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReceptionistRepository extends JpaRepository<receptionist, String> {
}
