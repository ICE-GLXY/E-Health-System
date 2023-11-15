package repository;

import domain.pharmacist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPharmacistRepository extends JpaRepository<pharmacist, String> {
}
