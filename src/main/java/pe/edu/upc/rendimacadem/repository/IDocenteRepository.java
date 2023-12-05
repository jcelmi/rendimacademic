package pe.edu.upc.rendimacadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.rendimacadem.entity.Docente;

public interface IDocenteRepository extends JpaRepository<Docente,Long> {
}
