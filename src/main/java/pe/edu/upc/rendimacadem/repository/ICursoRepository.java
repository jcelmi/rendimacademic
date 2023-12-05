package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Curso;

public interface ICursoRepository extends JpaRepository<Curso,Long> {
}
