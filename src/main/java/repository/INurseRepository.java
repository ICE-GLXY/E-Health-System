package repository;

import domain.nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INurseRepository extends JpaRepository<nurse, String> {
}
