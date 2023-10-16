package repository;

import domain.nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INurseRepository extends JpaRepository<nurse, String> {
}
