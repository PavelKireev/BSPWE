package cz.upce.bspwe.db.repository;

import cz.upce.bspwe.db.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<PatientRepository, Long> {

    Optional<Patient> findByUuid(String uuid);

}
