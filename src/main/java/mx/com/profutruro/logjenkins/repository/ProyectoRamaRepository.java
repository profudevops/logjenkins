package mx.com.profutruro.logjenkins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.com.profutruro.logjenkins.model.*;

@Repository
public interface ProyectoRamaRepository extends JpaRepository<ProyectoRama, Long> {
}
