package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {
}
