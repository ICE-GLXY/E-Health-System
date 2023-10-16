package repository;

import domain.administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdministratorRepository extends JpaRepository<administrator, String> {
}
