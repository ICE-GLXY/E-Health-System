package repository;

import domain.pharmacist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPharmacistRepository extends JpaRepository<pharmacist, String> {
}
