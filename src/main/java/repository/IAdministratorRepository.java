package repository;

import domain.administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministratorRepository extends JpaRepository<administrator, String> {
}
